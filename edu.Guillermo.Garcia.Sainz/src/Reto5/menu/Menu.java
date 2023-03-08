package src.Reto5.menu;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Esta plantilla ayudara a poder usarse en más proyectos con tan solo cambiar el texto,
 * ya que es de por si funcional 
 * 
 * Agradecimientos a Luciel por ayudarme a entender mejor el uso de este mismo
 */

public class Menu { 
    
    Scanner scanner = new Scanner(System.in);

    private String pedir_opccion = "Eliga la dificultad";

    private String tipo_de_error = "Su valor debe de ser numerico, porfavor intentelo una vez más";

    private String opccion_invalida = "Esta opccion no está disponible, seleccione una opccion valida";


    /*
     * ver porque el MenuAction da error, que tambien da error en el actionList
     * por lo que otros objetos abajo tambien tienen un error
     */

    private ArrayList<String> optionList = new ArrayList<>();
    private ArrayList<MenuAction> actionList = new ArrayList<>();

    private boolean alive = true;

    public boolean isAlive(){
        return alive;
    }
    public void killMenu(){
        alive = false;
    }

    /*
     * Aqui agregaremos opcciones para el arraylist
     */


    public Menu agregarOpccion (String opccion, MenuAction accion) {

        optionList.add(opccion);
        actionList.add(accion);

        return this; 
        // se regresara el objeto que es la opccion de la lista de arreglos
    }

    public void crearMenu() {
        optionList.add("Salir");
    }

    public void cleanMenu() {
        optionList.clear();
    }

    /*
     * Aqui se imprimira el menu
     * para que el usuario pueda verlo
     */


    public void showMenu() {
        System.out.println("|Menu|");

        for (int i = 0; i < optionList.size(); i++) {
            System.out.printf("%d.- %s\n", i + 1, optionList.get(i));
        }

        System.out.println();
        System.out.println(pedir_opccion);
    }

    /*
     * Ahora se iran leyendo las opcciones que el usuario introduzca
     * y dependiendo de esta, el sistema vera que hacer, ya sea un
     * error o algo que se espera que haga
     */

     public int readOption() {

        while (true) {

            try {

                int numeroOpcion = scanner.nextInt();
                scanner.nextLine();

                if (numeroOpcion < 1 || numeroOpcion > actionList.size() +1) {
                    System.out.println(opccion_invalida);
                    continue;

                }
                return numeroOpcion;
            }catch (InputMismatchException error) {
                System.out.println(tipo_de_error);
            }
        }
     }

     /*
      * Corroborar el porque esta opccion la ve como boleano
      */

     public void seleccionarYCorrerOpcion(int opccion) {
        if (opccion = optionList.size()) {
            killMenu();
            System.out.println("Gracias por usar el sistema uwu");
            return;
        }

        actionList.get(opccion-1).run(scanner);
    }
}
