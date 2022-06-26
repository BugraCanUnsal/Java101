import java.util.Scanner;

public class RecursiveAsalSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Birden buyuk pozitif bir sayi giriniz: ");
        int n = input.nextInt();

        int isAsal = isAsal(n,n-1);

        if (isAsal == 1){
            System.out.println("Sayi asaldir.");
        }else System.out.println("Sayi asal degildir.");
    }

    static int isAsal(int n, int i){
        if (i==1){
            return 1;
        }
        if (n%i == 0){
            return 2;
        }else {
            return isAsal(n,i-1);
        }


    }
}
