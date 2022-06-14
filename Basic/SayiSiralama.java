import java.util.Scanner;

public class SayiSiralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("1.Sayiyi giriniz: ");
        int a = input.nextInt();
        System.out.print("2.Sayiyi giriniz: ");
        int b = input.nextInt();
        System.out.print("3.Sayiyi giriniz: ");
        int c = input.nextInt();

        if (a == b && b == c) {
            System.out.println(a + " = " + b + " = " + c);
        } else if (a == b && b > c ) {
            System.out.println(c+ " <" + a + " = " + b);
        } else if (a == b && c > b) {
            System.out.println(b + " = " + a + " < " + c);
        } else if (b == c && b > a) {
            System.out.println(a + " < " + c + " = " + b);
        } else if (b == c && a > b) {
            System.out.println(c + " = " + b + " < " + a);
        } else if (a == c && a > b) {
            System.out.println(b + " < " + c + " = " + a);
        } else if (a == c && b > a) {
            System.out.println(c + " = " + a + " < "+ b);
        } else if (a > b && a > c ){
            if (b > c) System.out.println(c + " < " + b + " < " + a);
            else System.out.println(b + " > " + c + " < " + a);
        } else if (b > c && b > a) {
            if (a > c) System.out.println(c + " < " + a + " < " + b);
            else System.out.println(a + " < " + c + " < " + a);
        } else if (c > b && c > a) {
            if (b > a) System.out.println(a + " < " + b + " < " + c);
            else System.out.println(b + " < " + a + " < " + c);
        }
    }
}
