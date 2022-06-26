import java.util.Scanner;

public class Min_Max {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kac adet sayi gireceksiniz? : ");
        int n = input.nextInt();
        int i = 2;
        int min = 0;
        int max = 0;
        byte counter = 0;

        System.out.print("1. sayiyi giriniz : ");
        int localMax = input.nextInt();
        
        while (i<=n){
            System.out.print(i + ". sayiyi giriniz : ");
            int number = input.nextInt();
            if (number>localMax && counter == 0){
                max=number;
                min = localMax;
                counter++;
            } else if (number<localMax && counter==0) {
                min = number;
                max = localMax;
                counter++;
            } else if (number>max) {
                max=number;
            } else if (number<min) {
                min = number;
            }
            i++;
        }
        System.out.println("En kucuk sayi : " + min);
        System.out.println("En buyuk sayi : " + max);
    }
}
