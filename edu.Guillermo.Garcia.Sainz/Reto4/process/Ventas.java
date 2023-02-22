/*
 * 
 * Generar metedos que obtienen el producto que más se vende por trimestre y por sabor
 * 
 */

package edu.Guillermo.Garcia.Sainz.Reto4.process;
import java.util.ArrayList;

public class Ventas {

    /*
     * 
     * Se leen los valores de una tabla, posterior a esto regresa el
     * valor máximo de cada fila 
     * 
     */
    
    public static ArrayList<Integer> MaxProduct(double [][] tabla) {

        ArrayList<Integer> maximo = new ArrayList<>();

        for (int i = 0; i < tabla.length; i++) {
            double max = Double.MIN_VALUE;
            int auxIndex = 0;

            for (int j = 0; j < tabla[i].length; j++) {
                if (tabla [i][j] > max) {
                    auxIndex = j;
                    max = tabla[i][j];
                }
            }
            maximo.add(auxIndex);
        }
        return maximo;
    }

    /*
     * 
     * Aqui se sumaran los valores para devolver la posicion
     * y el valor más grande
     * 
     */

    public static int maxTrimeste(double[][] tabla) {
        int maxTrimeste = 0;
        int auxIndex = 0;

        for (int i = 0; i < tabla.length; i++) {
            int sumaDeVenta = 0;
            for (int j = 0; j < tabla.length; i++) {
                sumaDeVenta += tabla[j][i];
            }

            if (sumaDeVenta > maxTrimeste) {
                maxTrimeste = sumaDeVenta;
                auxIndex = i;
            }
        }
        return auxIndex;
    }
}
