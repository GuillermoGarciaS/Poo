public class CLI {
    /*
     * 
     * Aqui se ejecutara y mostrara el menu
     * 
     */

     public static void Main(Object ConversorNumerico) {

        String DecimalABinario = "";
        int DecimalAOctal = 0;
        int DecimalAHexadecimal = 0;
        String BinarioADecimal = "";
        String OctalADecimal = "";
        String HexadecimalADecimal = "";
        int salir = 0;

        salida:

        do {
            System.out.println("Bienvenido! seleccione que tipo de opccion usara");
            System.out.println("/1/ Decimal a Binario");
            System.out.println("/2/ Decimal a Octal");
            System.out.println("/3/ Decimal a Hexadecimal");
            System.out.println("/4/ Binario a Decimal");
            System.out.println("/5/ Octal a Decimal");
            System.out.println("/6/ Hexadecimal a Decimal");
            System.out.println("/7/ Salir");

            try (Scanner scanner1 = new Scanner(System.in)) {
                int opccion = scanner1.nextInt();

                while (opccion > 7 && opccion < 1) {
                    System.out.println("Digito invalido, porfavor intente de nuevo");
                    opccion = scanner1.nextInt();
                }

                if (opccion == 7) {
                    System.out.println("Tenga un buen día");
                    break salida;

                    /*
                     *
                     * aqui el switch traera las operaciones usadas en "Process", despues usando
                     * un break para terminarla
                     */

                }
                switch (opccion) {

                    case 1:
                        System.out.println("Ingrese el digito(s)");
                        String numero = scanner1.next();
                        System.out.println("La conversion ressulta en " + DecimalABinario);
                        break;
                    case 2:
                        System.out.println("Ingrese el digito(s)");
                        String numero2 = scanner1.next();
                        System.out.println("La conversion ressulta en " + DecimalAOctal);
                        break;
                    case 3:
                        System.out.println("Ingrese el digito(s)");
                        String numero3= scanner1.next();
                        System.out.println("La conversion ressulta en " + DecimalAHexadecimal);
                        break;
                    case 4:
                        System.out.println("Ingrese el digito(s)");
                        String numero4 = scanner1.next();
                        System.out.println("La conversion ressulta en " + BinarioADecimal);
                        break;
                    case 5:
                        System.out.println("Ingrese el digito(s)");
                        String numero5 = scanner1.next();
                        System.out.println("La conversion ressulta en " + OctalADecimal);
                        break;
                    case 6:
                        System.out.println("Ingrese el digito(s)");
                        String numero6 = scanner1.next();
                        System.out.println("La conversion ressulta en " + HexadecimalADecimal);
                        break;
                    case 7:
                        salir++;
                        break;
                }
            }
        }
        while (salir == 0);
    }
    
    public static void mostrarMenu() {
    }
}
