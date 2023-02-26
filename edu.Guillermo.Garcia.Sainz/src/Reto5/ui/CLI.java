package src.Reto5.ui;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.SpinnerDateModel;

import src.Reto5.process.*;

public class CLI {

    /*
     * 
     * Dentro de cada string estatico ire guardando las palabras,
     * estas se guardaran en base a su dificultad
     */
    
    private static String getOpccionFacil = "|Modo Fácil|";
    private static String getOpccionIntermedia = "|Modo Intermedio|";
    private static String getOpccionDificil = "|Modo Difícil|";

    public static void showJuego() {

        ArrayList<String> letrasAgregadas = new ArrayList<>();
        ArrayList<Integer> letrasDescubiertas = new ArrayList<>();
        String palabra = "";
        String letraYaIntroducida;

        System.out.println("Bienvenido!");
        System.out.println("Ingrese la dificultad que desea escoger");
        System.out.println("/1/ Facil");
        System.out.println("/2/ Intermedio");
        System.out.println("/3/ Avanzado");

        Scanner scanner1 = new Scanner(System.in);
        int dificultad = scanner1.nextInt();


        while (dificultad > 3 && dificultad < 1 ) {
            System.out.println("Opccion invalida, porfavor intentalo de nuevo");

            System.out.println("Bienvenido!");
            System.out.println("Ingrese la dificultad que desea escoger");
            System.out.println("/1/ Facil");
            System.out.println("/2/ Intermedio");
            System.out.println("/3/ Avanzado");

            dificultad = scanner1.nextInt();
        }

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

        while (letrasDescubiertas.size() != palabra.length()) {
            System.out.println("Intruduzca su letra");
            letraYaIntroducida = scanner1.next().toUpperCase();

            if (letrasAgregadas.contains(letraYaIntroducida)) {
                System.out.println("Ya introdujo esta letra");
                continue;
            }

            boolean letrasEncontradas = false;
            for (int i =0; i < palabra.length(); i++);
            {
                if (palabra.charAt(i) == letraYaIntroducida.charAt(0)) {
                    letrasEncontradas = true;
                    letrasDescubiertas.add(i);
                }
            }

            if (letrasEncontradas) {
                letrasAgregadas.add(letraYaIntroducida);

                for (int i = 0; i < palabra.length(); i++); {
                    if (letrasEncontradas.contains(i)) {
                        System.out.println(palabra.charAt(i));
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
      }
    }

