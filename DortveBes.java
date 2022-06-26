import java.util.Scanner;

public class DortveBes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayiyi giriniz: ");
        int number = input.nextInt();

        for (int i = 1 , j = 1; i<=number || j<=number ; i*=4, j*=5) {
            if (i <= number){
                System.out.print(i+ " , ");
            } if (j<=number) {
                System.out.println(j);
            }
        }
    }
}
