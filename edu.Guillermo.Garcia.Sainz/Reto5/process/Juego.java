public class Juego {

    private static String opccionFacil() {
        System.out.println("Ha escogido la dificultad Facil");
        int aleatorio = (int) (Math.random() * 9);
        String palabraFacil = new String[] {"perro", "gato", "lapiz"
                                         ,"taza", "pluma", "libro"
                                         ,"cinta", "gel", "papel"}[aleatorio];
        return palabraFacil;
    }

    private static String opccionIntermedia() {
        System.out.println("Ha escogido la dificultad Intermedia");
        int aleatorio = (int) (Math.random() * 9);
        String palabraIntermedia = new String[] {"bateria", "entrada", "moneda"
                                                ,"domino", "ajedrez", "pantalla"
                                                ,"memoria", "cinturon", "guitarra"}[aleatorio];
        return palabraIntermedia;                                    
    }

    private static String opccionDificil() {
        System.out.println("Ha escogido la dificultad Facil");
        int aleatorio = (int) (Math.random() * 9);
        String palabraDificil = new String[] {"computadora", "composicion"
                                             ,"bloqueador", "interpretacion"
                                             ,"receptor", "multicontrol"
                                             ,"multicontactos", "paracetamol"
                                             ,"austrolopitecus"}[aleatorio];
            return palabraDificil; 
    }         
}
