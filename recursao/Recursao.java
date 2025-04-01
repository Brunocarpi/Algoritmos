public class Recursao {
   
    static long fatorialIterativo (int n) {
        long f = 1;
        // for (int = 2; i <= n; i++) {
        //     f = f * i;
        // }
        while (n > 1) {
            f = f * n--;
        }
        return f;
    }
    static long fatorialRecursivo (int n){
        if (n <= 1) {
            return 1;
        }
        return n * fatorialRecursivo(n-1);
    }
    static int fibonacciRec (int n) {
        if (n <= 2) return 1;
        return fibonacciRec(n-1) + fibonacciRec(n-2);
    }
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            System.out.println("fatorial de " + i + " = " + fatorialIterativo(i));
        } 

        for (int i = 0; i <= 20; i++) {
            System.out.println("\nfibonacci de " + i + " = " + fibonacciRec(i));
        } 

    }
}