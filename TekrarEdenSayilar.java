import java.util.Arrays;

public class TekrarEdenSayilar {
    public static void main(String[] args) {
        int[] arr = {2,7,2,2,2,9,10,21,1,33,9,1};
        int[] repeating = new int[arr.length];
        int startingIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            int counter = 0;
            for (int j = i+1 ; j<arr.length ; j++ ) {
                if (arr[i] == arr[j]){
                    counter++;
                    if (counter==1 && !contains(repeating,arr[j]) && arr[j]%2==0){
                        repeating[startingIndex] = arr[j];
                        startingIndex++;
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(repeating));
    }
    public static boolean contains(int[] array , int value){
        for (int i: array ) {
            if (i == value){
                return true;
            }
        }return false;
    }
}
