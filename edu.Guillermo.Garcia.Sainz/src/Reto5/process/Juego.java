package src.Reto5.process;

import java.util.Arrays;
import java.util.*;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Juego {

    public static String getModoFacil () {

        /*
         * Para esta parte me atore, se puede notar que es un tanto diferente
         * a la version que tenía antes, le pedí ayuda a Lucilel
         */

        List<String> faciles = Arrays.asList("perro", "gato", "lapiz"
                                                   ,"taza", "pluma", "libro"
                                                   ,"cinta", "gel", "pape");
        Random random = new Random();
        int palabraRandom = random.nextInt(faciles.size());
        String palabraFacil = faciles.get(palabraRandom);

        ArrayList<String> letrasIntroducidas = new ArrayList<>();

        ArrayList<Integer> letrasAdivinadas = new ArrayList<>();

        String letraYaIntroducida;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Adivine la siguiente palabra: ");

            while (letrasAdivinadas.size() != palabraFacil.length()) {

                boolean letraAdivinada = false;
                letraYaIntroducida = scanner.next().toLowerCase();

                for (int i = 0; i < palabraFacil.length(); i++) {

                    if (palabraFacil.charAt(i) == letraYaIntroducida.charAt(0)) {
                        letraAdivinada = true;
                        letrasAdivinadas.add(i);

                    }
                }
                if (letraAdivinada) {
                    letrasIntroducidas.add(letraYaIntroducida);

                    for (int i = 0; i < palabraFacil.length(); i++) {
                        if (letrasAdivinadas.contains(i)) {
                            System.out.println(palabraFacil.charAt(i));
                        }
                        else {
                            System.out.println("_");
                        }
                    }
                    System.out.println();
                }
                else {
                    letrasIntroducidas.add(letraYaIntroducida);
                    System.out.println("Letra incorrecta! intentalo de nuevo");
                }
            }
        }
    }

    public static String getModoIntermedio() {

                List<String> intermedias = Arrays.asList("bateria", "entrada", "moneda"
                                                              ,"domino", "ajedrez", "pantalla"
                                                              ,"memoria", "cinturon", "guitarra");
        Random random = new Random();
        int palabraRandom = random.nextInt(intermedias.size());
        String palabraIntermedia = intermedias.get(palabraRandom);

        ArrayList<String> letrasIntroducidas = new ArrayList<>();

        ArrayList<Integer> letrasAdivinadas = new ArrayList<>();

        String letraYaIntroducida;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Adivine la siguiente palabra: ");

            while (letrasAdivinadas.size() != palabraIntermedia.length()) {

                boolean letraAdivinada = false;
                letraYaIntroducida = scanner.next().toLowerCase();

                for (int i = 0; i < palabraIntermedia.length(); i++) {

                    if (palabraIntermedia.charAt(i) == letraYaIntroducida.charAt(0)) {
                        letraAdivinada = true;
                        letrasAdivinadas.add(i);

                    }
                }
                if (letraAdivinada) {
                    letrasIntroducidas.add(letraYaIntroducida);

                    for (int i = 0; i < palabraIntermedia.length(); i++) {
                        if (letrasAdivinadas.contains(i)) {
                            System.out.println(palabraIntermedia.charAt(i));
                        }
                        else {
                            System.out.println("_");
                        }
                    }
                    System.out.println();
                }
                else {
                    letrasIntroducidas.add(letraYaIntroducida);
                    System.out.println("Letra incorrecta! intentalo de nuevo");
                }
            }
        }
    }

    public static String getModoDificil() {

                List<String> dificiles = Arrays.asList("bateria", "entrada", "moneda"
                                                              ,"domino", "ajedrez", "pantalla"
                                                              ,"memoria", "cinturon", "guitarra");
        Random random = new Random();
        int palabraRandom = random.nextInt(dificiles.size());
        String palabraDificil = dificiles.get(palabraRandom);

        ArrayList<String> letrasIntroducidas = new ArrayList<>();

        ArrayList<Integer> letrasAdivinadas = new ArrayList<>();

        String letraYaIntroducida;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Adivine la siguiente palabra: ");

            while (letrasAdivinadas.size() != palabraDificil.length()) {

                boolean letraAdivinada = false;
                letraYaIntroducida = scanner.next().toLowerCase();

                for (int i = 0; i < palabraDificil.length(); i++) {

                    if (palabraDificil.charAt(i) == letraYaIntroducida.charAt(0)) {
                        letraAdivinada = true;
                        letrasAdivinadas.add(i);

                    }
                }
                if (letraAdivinada) {
                    letrasIntroducidas.add(letraYaIntroducida);

                    for (int i = 0; i < palabraDificil.length(); i++) {
                        if (letrasAdivinadas.contains(i)) {
                            System.out.println(palabraDificil.charAt(i));
                        }
                        else {
                            System.out.println("_");
                        }
                    }
                    System.out.println();
                }
                else {
                    letrasIntroducidas.add(letraYaIntroducida);
                    System.out.println("Letra incorrecta! intentalo de nuevo");
                }
            }
        }
    }
}

