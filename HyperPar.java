public class HyperPar {
    public static void main(String[] args) {
        long numero = 2468642;
        boolean hyperPar = esHyperPar(numero);
    }

    public static boolean esHyperPar(long numero) {
        //Mientras que el numero sea distinto a 0
        while (numero != 0) {
            long digit = numero % 10;
            //Si no es par return falso
            if (digit % 2 != 0) {
                return false;
            }
            //Numero entre 10
            numero /= 10;
        }
        return true;
    }
}
