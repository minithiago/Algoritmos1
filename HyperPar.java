public class HyperPar {
    public static void main(String[] args) {

    }

    public static boolean esHyperPar(long numero) {
        while (numero != 0) {
            long digit = numero % 10;
            if (digit % 2 != 0) {
                return false;
            }
            numero /= 10;
        }
        return true;
    }
}
