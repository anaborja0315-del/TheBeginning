public class Dia7 {

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        }
        return base * potencia(base, exponente - 1);
    }

    public static int suma(int n) {
        if (n == 1) {
            return 1;
        }
        return n + suma(n - 1);
    }

    public static void main(String[] args) {
        int numero = 5;
        int resultado = factorial(numero);
        System.out.println("El factorial de " + numero + " es: " + resultado);

        int base = 2;
        int exponente = 5;
        int resultadoPotencia = potencia(base, exponente);
        System.out.println("La potencia de " + base + " elevado a " + exponente + " es: " + resultadoPotencia);

        int n = 5;
        int result = suma(n);
        System.out.println("La suma recursiva del numero "+ n + " es en total: "+ result );
    }
}
