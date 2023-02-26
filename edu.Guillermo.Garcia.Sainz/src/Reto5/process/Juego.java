package src.Reto5.process;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Juego {

    /*
     * 
     * Los public statics aqui los use para guardar las palabras
     * asi como la operacion para que se escoga una aleatoriamente
     */

    public static String getOpccionFacil() {
        List<String> Facil = Arrays.asList("perro", "gato", "lapiz"
                                                ,"taza", "pluma", "libro"
                                                ,"cinta", "gel", "papel");
        Random random = new Random();
        
        int randomItem = random.nextInt(Facil.size());
        String OpccionFacil = Facil.get(randomItem);
        return OpccionFacil;
    }

    public static String getOpccionIntermedia() {
        List<String> Intermedia = Arrays.asList ("bateria", "entrada", "moneda"
                                                ,"domino", "ajedrez", "pantalla"
                                                ,"memoria", "cinturon", "guitarra");
        Random random = new Random();

        int randomItem = random.nextInt(Intermedia.size());
        String OpccionIntermedia = Intermedia.get(randomItem);  
        return OpccionIntermedia;                                    
    }

    public static String getOpccionDificil() {
        List<String> Dificil = Arrays.asList ("computadora", "composicion"
                                             ,"bloqueador", "interpretacion"
                                             ,"receptor", "multicontrol"
                                             ,"multicontactos", "paracetamol"
                                             ,"austrolopitecus");

            Random random = new Random();

            int randomItem = random.nextInt(Dificil.size());
            String OpccionDificil = Dificil.get(randomItem);
            return OpccionDificil; 
    }
}
