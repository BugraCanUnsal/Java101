import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lutfen bir sayi giriniz : ");
        double harmonicNumber = input.nextInt();
        double sum = 0;
        for (double i = 1; i <= harmonicNumber; i++) {
            sum += (1/i);
        }
        System.out.println(sum);
    }
}
