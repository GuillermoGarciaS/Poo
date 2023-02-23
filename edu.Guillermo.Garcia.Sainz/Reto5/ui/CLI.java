import java.util.Scanner;

public class CLI {

    /*
     * 
     * Dentro de cada string estatico ire guardando las palabras,
     * estas se guardaran en base a su dificultad
     */
    
    private static String tablaFacil = "1";

    private static String tablaIntermedia = "2";

    private static String tablaAvanzada = "3";

    public static void showJuego() {

        System.out.println("Bienvenido!");
        System.out.println("Ingrese la dificultad que desea escoger");
        System.out.println("/1/ Facil");
        System.out.println("/2/ Intermedio");
        System.out.println("/3/ Avanzado");

        Scanner scanner1 = new Scanner(System.in);
        int dificultad = scanner1.nextInt();

        while (dificultad > 3 && dificultad < 1) {
            System.out.println("Opccion invalida, porfavor intentalo de nuevo");

            System.out.println("Bienvenido!");
            System.out.println("Ingrese la dificultad que desea escoger");
            System.out.println("/1/ Facil");
            System.out.println("/2/ Intermedio");
            System.out.println("/3/ Avanzado");

            dificultad = scanner1.nextInt();
        }
    }
}
