public class Dia8 {

    public static String invertir (String texto) {
        StringBuilder resultado = new StringBuilder();

        for (int i = texto.length() - 1; i >= 0; i--) {
            resultado.append(texto.charAt(i));
        }

    String invertido = resultado.toString();
        return invertido;
    }

    public static void main(String[] args) {
        String texto = "This is amazing :)";
        String resultado = invertir(texto);
        System.out.println("El texto invertido es: " + resultado);
    }
}