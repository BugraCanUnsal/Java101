import java.util.Scanner;

public class SayiTahmini {
    public static void main(String[] args) {

        int random = (int) (Math.random()*100);
        int life = 7;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Hakkiniz : " + life);
            System.out.print("Tahmininiz nedir? : ");
            int n = input.nextInt();
            if (n == random){
                break;
            } else if (n<random && life>1) {
                System.out.println("Daha yuksek bir sayi deneyiniz.");
            } else if (n>random && life>1) {
                System.out.println("Daha dusuk bir sayi deneyiniz.");
            }
            life--;
        }while (life>0);

        if (life == 0 ){
            System.out.println("Uzgunum hakkiniz bitti.");
        }else System.out.println("Tebrikler aradiginiz sayi : " + random);
    }
}
