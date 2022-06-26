import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz : ");
        int number = input.nextInt();
        int armstrong = 0,tempNumber;

        while(number>0){
            tempNumber=number%10;
            armstrong+=tempNumber;
            number/=10;
        }
        System.out.println(armstrong);
    }
}
