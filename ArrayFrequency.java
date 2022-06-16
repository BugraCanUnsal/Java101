import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayFrequency {
    public static void main(String[] args) {

        int[] arr = {10,20,20,10,10,20,5,20};
        int[] freq = new int[arr.length];

        System.out.println("Dizi : " + Arrays.toString(arr));
        System.out.println("Tekrar Sayilari");
        for (int i = 0; i < arr.length; i++) {
            int counter = 1 ;
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i] == arr[j]){
                    counter++;
                }
            }if (!contains(freq,arr[i])){
                System.out.println(arr[i] + " sayisi " + counter + " kere tekrar edildi.");
                freq[i] = arr[i];
            }
        }
    }
    public static boolean contains(int[] array , int value ){
        for (int i: array ) {
            if (i == value){
                return true;
            }
        }return false;
    }
}
