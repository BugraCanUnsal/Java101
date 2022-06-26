import java.util.Scanner;

public class BolunenSayilar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;

        System.out.print("Bir sayi giriniz : ");
        int n = input.nextInt();
        int counter = 0 ;

        for (int i = 0; i <= n ; i++) {
            if (i%3 == 0 && i%4 == 0 ){
                sum += i;
                counter++;
            }
        }
        System.out.println("Sayilarin ortalamasi : " + (sum/counter));
    }
}
