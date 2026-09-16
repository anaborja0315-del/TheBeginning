public class Dia4 {

    public static int BusquedaBinaria(int [] numero, int objetivo){
        
        int izquierda = 0;
        int derecha = numero.length - 1;

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;

            if (numero[medio] == objetivo) {
                return medio; 
            }

            if (numero[medio] < objetivo) {
                izquierda = medio + 1; 
            } else {
                derecha = medio - 1;
            }
        }

        return -1; 
    }

    public static void main(String[] args) {
        int[] numeros = {1, 3, 5, 7, 9, 11, 13, 15};
        int objetivo = 100;

        int resultado = BusquedaBinaria(numeros, objetivo);

        if (resultado != -1) {
            System.out.println("Elemento encontrado en el índice: " + resultado);
        } else {
            System.out.println("Elemento no encontrado");
        }
    }
}