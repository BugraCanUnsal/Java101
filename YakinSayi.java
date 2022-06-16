import java.util.Arrays;
import java.util.Scanner;

public class YakinSayi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] arr = {15,12,788,1,-1,-778,2,0};
        Arrays.sort(arr);
        System.out.println("Dizi : " + Arrays.toString(arr));

        System.out.print("Girilen sayi : ");
        int number = input.nextInt();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i]>number){
                System.out.println("Girilen sayidan buyuk en yakin sayi : " + arr[i]);
                System.out.println("Girilen sayidan kucuk en yakin sayi : " + arr[i-1]);
                break;
            } else if (arr[i] == number) {
                System.out.println("Girilen sayi ile "+ arr[i] + " esittir.");
                break;
            }
        }

    }


}
