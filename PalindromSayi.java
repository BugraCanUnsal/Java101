import java.util.Scanner;

public class PalindromSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayiyi giriniz: ");
        int n = input.nextInt();
        System.out.println(isPalindrom(n));

    }

    static boolean isPalindrom(int number){
        int temp = number, reverseNumber = 0, lastNumber = 0;

        while (temp!=0){
            reverseNumber=temp%10;
            lastNumber = (lastNumber*10)+reverseNumber;
            temp/=10;
        }
        if (lastNumber==number)
            return true;
        else
            return false;
    }
}
