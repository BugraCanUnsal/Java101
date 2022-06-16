package Basic.src;

public class Arrays_HarmonicSayi {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Harmonic(numbers));
    }

    public static double Harmonic(int[] arr){
        int n = 0;
        double harmonicSum = 0;
        for (int i : arr){
            n++;
        }
        for (int i = 0 ; i<arr.length; i++ ){
            harmonicSum += (1/i);
        }
        return n/harmonicSum;
    }
}
