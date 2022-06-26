import java.util.Scanner;

public class RecursiveDesen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayiyi giriniz : ");
        int n = input.nextInt();

        DesenNegatif(DesenPozitif(n),n);

    }

    static int DesenPozitif(int n){
        while (n>0){
            System.out.print(n + " ");
            return DesenPozitif(n-5);
        }
        System.out.print(n + " ");
        return n;
    }
    static int DesenNegatif(int n,int m){
        if (n!=m){
            System.out.print(n+5 + " ");
            return DesenNegatif(n+5,m);
        }else {
            return m;
        }

    }
}
