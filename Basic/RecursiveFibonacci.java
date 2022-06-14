public class RecursiveFibonacci {
    public static void main(String[] args) {

        for (int i = 1; i < 9  ; i++) {
            System.out.print(fib(i) + " ");
        }

    }
    static int fib(int n){
        if (n==0){
            return 0;

        } else if (n==1 || n == 2) {
            return 1;
        } else {
            return fib(n-2) + fib(n-1);
        }
    }
}
