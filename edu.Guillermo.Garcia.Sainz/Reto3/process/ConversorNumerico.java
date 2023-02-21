/**
 *
 * esta clase contiene metodos para convertir numeros
 */

public class ConversorNumerico {
    /**
      * aqui se encuentras cada de las operaciones que se usaran en el CLI
      * para que el usuario tenga su resultado
      */
 
      public static String convertidorDecimalABinario(String DecimalABinario) {
        int decimal = 0;
        int residuo;
        String binario = "";

        while (decimal > 0) {

            residuo = (decimal % 2);
            binario = residuo + binario;
            decimal = (decimal / 2);
        }
        return binario;
    }

    public static String convertidorDecimalAOctal(int DecimalAOctal) {
        String octal = "";
        String ranOctal = "12345670";

        if (DecimalAOctal == 0) {
           octal = "0";
        }

        while (DecimalAOctal > 0) {

            int residuo = DecimalAOctal % 8;
            octal = (ranOctal.charAt(residuo) + octal);
            DecimalAOctal /= 8;

        }
        return octal;
    }

    public static String convertidorDecimalHexadecimal(int DecimalAHexadecimal) {
        String hexadecimal = "";
        String ranhexadeccimal = "1234567890ABCDEF";

        if (DecimalAHexadecimal == 0) {
           hexadecimal = "0";
        }

        while (DecimalAHexadecimal > 0) {
            int residuo = DecimalAHexadecimal % 16;
            hexadecimal = (ranhexadeccimal.charAt(residuo) + hexadecimal);
            DecimalAHexadecimal /= 16;
        }
        return hexadecimal;
    }

    public static long convertidorBinarioADecimal(String BinarioADecimal) {
        long decimal = 0;
        int exponente = 0;

        for (int i = BinarioADecimal.length() - 1; i >= 0; i--) {
            short digito = 1;
            if (BinarioADecimal.charAt(i) == '0') {
                digito = 0;
            }

            double multiplicador = Math.pow(2, exponente);
            decimal += digito * multiplicador;
            exponente++;
        }
        return decimal;
       }

    public static int convertidorOctalADecimal(String DecimalAOctal) {
        int octal = Integer.parseInt(DecimalAOctal);
        int exponente = 1;
        int decimal = 0;

        if (octal == 0) {
            decimal = 0;
        }

        while (octal > 0) {
            int residuo = (octal % 10);
            decimal = (decimal + (residuo * exponente));
            octal = octal / 10;
            exponente = exponente * 8;
        }
        return octal;
    }

    /**
     *
     * aqui la unica diferencia del resto, es que usa un switch para caracteres de char,
     * esto ya que el Hexadecimal contiene letras de la A hasta la F
     */
    
    public static int HexadecimalADecimal(String HexadecimalADecimal) {
       HexadecimalADecimal.toUpperCase();
       int hexadecimal = Integer.parseInt(HexadecimalADecimal);
       int exponente = 1;
       int decimal = 0;

       while (hexadecimal > 0) {
           int residuo = (hexadecimal % 10);
           decimal = (decimal + (residuo * exponente));
           hexadecimal = hexadecimal / 10;
           exponente = exponente * 8;
       }

        switch (HexadecimalADecimal) {
            case "A":
                return 10;
            case "B":
                return 11;
            case "C":
                return 12;
            case "D":
                return 13;
            case "E":
                return 14;
            case "F":
                return 15;
            default:
                return Integer.parseInt(String.valueOf(HexadecimalADecimal));
        }
    }
}
