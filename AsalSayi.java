public class AsalSayi {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            for (int j = 2; j <= i ; j++) {
                if (i%j == 0 && i != j){
                    break;
                } else if (i%j==0 && i==j) {
                    System.out.print(i + " ");
                }
            }
        }


    }
}
