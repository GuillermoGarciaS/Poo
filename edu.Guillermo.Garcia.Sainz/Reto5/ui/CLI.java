public class CLI {
    
    static string [] tablaFacil = {
        {perro, gato, lapiz},
        {taza, pluma, libro},
        {cinta, gel, papel}
    };

    static string [] tablaIntermedia = {
        {bateria, entrada, moneda},
        {domino, ajedrez, pantalla},
        {memoria, cinturon, guitarra}
    };

    static string [] tablaAvanzada = {
        {computadora, composicion},
        {bloqueador, interpretacion},
        {receptor, multicontrol}
    };

    public static void showJuego() {
        System.out.println("Bienvenido!");
        System.out.println("Ingrese la dificultad que desea escoger");
        System.out.println("/1/ Facil");
        System.out.println("/2/ Intermedio");
        System.out.println("/3/ Avanzado");
        
        
    }
}
