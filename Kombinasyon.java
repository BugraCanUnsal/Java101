import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nFactorial=1;
        int rFactorial=1;
        int n_rFactorial=1;
        System.out.print("N'in R'li kombinasyonu icin...\nN sayisini giriniz: ");
        int n = input.nextInt();
        System.out.print("R sayisini giriniz: ");
        int r = input.nextInt();

        for (int i = 1; i <=n; i++) {
            nFactorial*=i;
        }

        for (int i = 1; i <=r; i++) {
            rFactorial*=i;
        }
        for (int i = 1; i <=n-r ; i++) {
            n_rFactorial*=i;
        }

        System.out.println(n + "'in " + r + "'li kombinasyonu = " + nFactorial/(rFactorial*n_rFactorial));
    }
}
