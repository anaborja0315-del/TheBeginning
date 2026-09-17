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
        int[] numeros = {2, 5, 8, 12, 16, 23, 38, 45, 50, 64};
        int objetivo = 23;
        int resultado = contarMenoresQue(numeros, objetivo);
        System.out.println("Cantidad de numeros menores que " + objetivo + ": " + resultado);
    }
}