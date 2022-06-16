import java.util.Arrays;
import java.util.Scanner;

public class DiziSiralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Dizinin boyutu = " );
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Dizinin elemanlarini giriniz = ");

        for (int i = 0; i < arr.length ; i++) {
            System.out.print((i+1) + ". elemani giriniz : ");
            int n = input.nextInt();
            arr[i] = n;
        }

        //System.out.println("Dizinin normal hali : " + Arrays.toString(arr));

        int temporary;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]>arr[j]){
                    temporary = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temporary;
                }
            }
        }

        System.out.println("Siralama : " + Arrays.toString(arr));
    }
}
