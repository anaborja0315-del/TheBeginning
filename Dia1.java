public class Dia1 {

    public static int Fibonacci(int valor) {

        if (valor <= 0) {
            return 0;

        } else if (valor == 1 || valor == 2) {
            return 1;
        } else {
            return Fibonacci(valor - 1) + Fibonacci(valor - 2);
        }
    }

    public static void main(String[] args) {

        int valor = 30;
        int resultado = Fibonacci(valor);
        System.out.println("El resultado de Fibonacci para " + valor + " es: " + resultado);
    }

}