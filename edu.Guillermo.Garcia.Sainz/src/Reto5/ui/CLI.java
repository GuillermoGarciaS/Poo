package src.Reto5.ui;

import src.Reto5.process.*;

import java.util.ArrayList;
import java.util.Scanner;

public class CLI {

    /*
     * 
     * Dentro de cada string estatico ire guardando las palabras,
     * estas se guardaran en base a su dificultad
     */

    public static void showJuego() {

        ArrayList<String> letrasAgregadas = new ArrayList<>();
        ArrayList<Integer> letrasDescubiertas = new ArrayList<>();
        String palabra = "";
        String letraYaIntroducida;
        int dificultad = 5;
        int opccionFinal;

        while (dificultad != 0) {
            letrasAgregadas.clear();
            letrasDescubiertas.clear();

            System.out.println("Bienvenido!");
            System.out.println("Ingrese la dificultad que desea escoger");
            System.out.println("|1| Facil");
            System.out.println("|2| Intermedio");
            System.out.println("|3| Avanzado");
            System.out.println("|0| Salir");
    
            Scanner scanner = new Scanner(System.in);
            dificultad = scanner.nextInt();
    
    
            while (dificultad > 3 && dificultad < 1 ) {
                System.out.println("Opccion invalida, porfavor intentalo de nuevo");
    
                System.out.println("Bienvenido!");
                System.out.println("Ingrese la dificultad que desea escoger");
                System.out.println("|1| Facil");
                System.out.println("|2| Intermedio");
                System.out.println("|3| Avanzado");
    
                dificultad = scanner.nextInt();
            }
    
            /*
             * 
             * aqui uso un switch para que llame a escoger el modo
             * de dificultad en base a un numero ya marcado en los prints 
             * localizados arriba
             */
    
            switch (dificultad) {
                case 1:
                palabra = Juego.getOpccionFacil();
                break;
                case 2:
                palabra = Juego.getOpccionIntermedia();
                break;
                case 3:
                palabra = Juego.getOpccionDificil();
                break;
            }
    
            /*
             * 
             * aqui vamos a evitar algunos errores que el usuario quizas cometa,
             * como el de letras repetidas, así como el poder evitar que 
             * 
             */
    
            while (letrasDescubiertas.size() != palabra.length()) {
                System.out.println("Intruduzca su letra");
                letraYaIntroducida = scanner.next().toUpperCase();
    
                if (letrasAgregadas.contains(letraYaIntroducida)) {
                    System.out.println("Ya introdujo esta letra");
                    continue;
                }
    
                boolean letrasEncontradas = false;
                for (int i =0; i < palabra.length(); i++); {
                    if (palabra.charAt('i') == letraYaIntroducida.charAt(0)) {
                        letrasEncontradas = true;
                        letrasDescubiertas.add(i);
                    }
                }
    
                if (letrasEncontradas) {
                    letrasAgregadas.add(letraYaIntroducida);
    
                    for (int i = 0; i < palabra.length(); i++); {
                        if (letrasEncontradas.contains(i)) {
                            System.out.println(palabra.charAt('i'));
                        }else {
                            System.out.println("_");
                        }
                    }
                    System.out.println();
                }else {
                    letrasAgregadas.add(letraYaIntroducida);
                    System.out.println("Intente de nuevo");
                }
            }
            System.out.println("Desea continuar?");
            System.out.println("|1| para continuar");
            System.out.println("|0| para salir");

            Scanner scannerFinal = new Scanner(System.in);
            opccionFinal = scannerFinal.nextInt();

            if (opccionFinal == 1) {
                System.out.println("Entendido, iniciando de nuevo el proyecto...");

                System.out.println("Bienvenido!");
                System.out.println("Ingrese la dificultad que desea escoger");
                System.out.println("|1| Facil");
                System.out.println("|2| Intermedio");
                System.out.println("|3| Avanzado");
    
                dificultad = scanner.nextInt();

                } else {
                    System.out.println("Gracias por jugar! tenga un buen día");
                    break;
                }
            }
         }
      }