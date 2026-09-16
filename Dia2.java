import java.util.HashMap;

public class Dia2 {

    public static int FibonacciHashmap(int valor, HashMap<Integer, Integer> memo) {

        if (memo.containsKey(valor)) {
            // Si ya lo calculé, lo tomo del HashMap
            return memo.get(valor);
        } else {
            if (valor <= 0) {
                return 0;
            } else if (valor == 1 || valor == 2) {
                return 1;
            } else {

                int resultado = FibonacciHashmap(valor - 1, memo) + FibonacciHashmap(valor - 2, memo);
                memo.put(valor, resultado);
                return resultado;
            }
        }
    }

    public static void main(String[] args) {

        HashMap<Integer, Integer> memo = new HashMap<>();

        long inicio = System.currentTimeMillis();
        int resultado = FibonacciHashmap(30, memo);
        long tiempo1 = System.currentTimeMillis() - inicio;

        long inicio2 = System.currentTimeMillis();
        int resultado2 = FibonacciHashmap(40, memo); // MISMO memo
        long tiempo2 = System.currentTimeMillis() - inicio2;

        System.out.println("Fibonacci(30): " + resultado + " en " + tiempo1 + "ms");
        System.out.println("Fibonacci(40): " + resultado2 + " en " + tiempo2 + "ms");
    }
}