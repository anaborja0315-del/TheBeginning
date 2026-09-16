import java.util.HashMap;

public class Dia3 {
    public static int Escaleras(int n, HashMap<Integer, Integer> memo) {
    
    if (memo.containsKey(n)) {
        return memo.get(n);
    }
    
    if (n == 1) {
        return 1;
    }
    if (n == 2) {
        return 2;
    }
    
    int resultado = Escaleras(n-1, memo) + Escaleras(n-2, memo);
    

    memo.put(n, resultado);
    return resultado;
}

    public static void main(String[] args) {
        
        HashMap<Integer, Integer> memo = new HashMap<>();
        int resultado = Escaleras(10, memo);
        System.out.println(resultado);
    }
}

