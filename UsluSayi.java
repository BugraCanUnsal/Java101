import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int bottom,top;

        System.out.print("Alt sayiyi giriniz : ");
        bottom = input.nextInt();
        System.out.print("Ust sayiyi giriniz : ");
        top = input.nextInt();

        if (top != 0){
            for (int i = 0; i <top-1 ; i++) {
                bottom*=bottom;
            }
        }else {
            bottom = 1;
        }
        System.out.println(bottom);
    }
}
