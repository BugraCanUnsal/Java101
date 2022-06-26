import java.util.Scanner;

public class CiftveDort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int number;

        while(true){
            System.out.println("Lutfen bir sayi giriniz : ");
            number = input.nextInt();
            if (number%4 == 0){
                sum+=number;
            } else if (number%2 !=0) {
                break;
            }
        }
        System.out.println("Sayilar yoplami : " + sum);
    }
}
