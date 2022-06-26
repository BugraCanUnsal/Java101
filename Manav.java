import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float armutKg = 2.14f;
        float elmaKg = 3.67f;
        float domatesKg = 1.11f;
        float muzKg = 0.95f;
        float patlıcanKg = 5.0f;

        System.out.print("Armut Kac Kilo ? : ");
        float armut = input.nextFloat();
        System.out.print("Elma Kac Kilo ? : ");
        float elma = input.nextFloat();
        System.out.print("Domates Kac Kilo ? : ");
        float domates = input.nextFloat();
        System.out.print("Muz Kac Kilo ? : ");
        float muz = input.nextFloat();
        System.out.print("Patlıcan Kac Kilo ? : ");
        float patlıcan = input.nextFloat();

        System.out.print("Toplam Tutar : " + (armut*armutKg+elma*elmaKg+domates*domatesKg+muz*muzKg+patlıcan*patlıcanKg) + " TL");


    }
}
