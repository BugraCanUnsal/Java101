import java.util.Scanner;

public class UsHesabi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban degeri giriniz :");
        int a = input.nextInt();
        System.out.print("Us degeri giriniz : ");
        int b = input.nextInt();

        System.out.println("Sonuc : " + power(a,b));
    }

    static int power(int a,int b){
        int sum=1;
        for (int i = 0; i < b; i++) {
            sum*=a;
        }
        return sum;
    }
}
