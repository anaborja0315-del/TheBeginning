public class Dia6 {

    public static int contarMenoresQue(int[] numeros, int objetivo) {
    
       int izquierda = 0;
        int derecha = numeros.length;
        while (izquierda < derecha){
             int medio = izquierda + (derecha - izquierda) / 2;
            if (numeros[medio] < objetivo)
                 izquierda = medio + 1;
            else{
                
                derecha = medio;
            }
        }    
        return izquierda;
    }


    public static void main(String[] args) {
        int[] numeros = {2, 5, 8, 12, 16, 23, 38, 45, 50, 64};
        int objetivo = 23;
        int resultado = contarMenoresQue(numeros, objetivo);
        System.out.println("Cantidad de numeros menores que " + objetivo + ": " + resultado);
    }
}