/*
 * 
 * Aqui se manda a llamar a la clase de Ventas
 * 
 * los datos se almacenaran con los métodos mencionados
 * 
 * @author ggs
 */

package edu.Guillermo.Garcia.Sainz.Reto4.ui;
import edu.Guillermo.Garcia.Sainz.ventas;
import java.uitl.ArrayList;

public class CLI {

    /*
     * 
     * El array de abajo contiene los valores
     * 
     */
    
    static double [][] tablaDeVenta = {
        {111, 483, 471, 427},
        {192, 500, 355, 158},
        {289, 470, 474, 160},
        {415, 114, 161, 308}
    };

    /*
     * 
     * Los arreglos seran establecidos por sabores y trimestres mediante su posición en la table
     * 
     */

    public static void showTabla(){
        String[] sabores = {"Chocolate", "Vainilla", "Fresa", "Oreo"};
        String[] trimestres = {"Enero a Marzo", "Abril a Junio", "Julio a Septiembre","Octubre a Diciembre"};

        for (int i = 0; i < sabores.length; i++) {
            ArrayList<Integer> maximo = Ventas.MaxProduct(tablaDeVenta);
            System.out.println("El mejor trimestre para " + flavours[i] + " es " + trimestres[maximo.get(i)]);
        }

        System.out.println();
        System.out.println("El trimestre con mayores ventas fue " + trimestres[Ventas.MaxProduct(tablaDeVenta)]);
    }
}
