public class Polidivisible {

    public static boolean tieneTodosLosDigitos(String numero) {
        int longitud = numero.length();
        boolean[] digitos = new boolean[longitud];

        for (int i = 0; i < longitud; i++) {
            int digito = Character.getNumericValue(numero.charAt(i));
            if (digito < 0 || digito >= longitud || digitos[digito]) {
                return false;
            }
            digitos[digito] = true;
        }

        return true;
    }

    public static boolean esPolidivisible(long numero) {
        String numeroStr = String.valueOf(numero);

        for (int i = 1; i <= numeroStr.length(); i++) {
            String subNumeroStr = numeroStr.substring(0, i);
            long subNumero = Long.parseLong(subNumeroStr);
            if (subNumero % i != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        long numero = 381654729;

        if (tieneTodosLosDigitos(String.valueOf(numero))) {
            if (esPolidivisible(numero)) {
                System.out.println(numero + " es un numero polidivisible.");
            } else {
                System.out.println(numero + " no es un numero polidivisible.");
            }
        } else {
            System.out.println(numero + " no contiene todos los digitos desde 1 hasta su longitud menos 1.");
        }
    }
}
