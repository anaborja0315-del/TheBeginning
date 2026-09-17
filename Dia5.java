public class Dia5 {

    public static int contarMenoresQue(int[] numeros, int objetivo) {

        int contador = 0;
        for (int numero : numeros) {
            if (numero < objetivo) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        int[] numeros = { 1, 3, 5, 7, 9 };
        int objetivo = 6;
        int resultado = contarMenoresQue(numeros, objetivo);
        System.out.println("Cantidad de números menores que " + objetivo + ": " + resultado);
    }
}