public class sumaDescendente {

    public static void main(String[] args) {

    }

    public static long resultado(long numero){

        //Metodo para saber hacer una suma descendente del numero

        long resultado = numero;
        String primero = String.valueOf(numero);

        for (int i = 1; i < primero.length(); i++) {
            char digito = primero.charAt(i);
            String cadena = primero.substring(i,primero.length());
            int descendente = Integer.parseInt(cadena);
            resultado = resultado + descendente;

        }

        return resultado;
    }
}
