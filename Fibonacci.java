public class Fibonacci {
    public static void main(String[] args) {
        int before= 0;
        int last = 1;
        int placeHolder;

        for (int i = 0; i < 9 ; i++) {
            System.out.print(last + " ");
            placeHolder = last + before;
            before = last;
            last = placeHolder;
        }
    }
}
