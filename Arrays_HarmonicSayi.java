public class Arrays_HarmonicSayi {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Harmonic(numbers));
    }

    public static double Harmonic(int[] arr){
        int n = 0;
        double harmonicSum = 0;
        for (double i  : arr ){
            harmonicSum += (1/i);
            n++;
        }
        return n/harmonicSum;
    }
}
