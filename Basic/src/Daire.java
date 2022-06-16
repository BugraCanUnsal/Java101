import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float pi = 3.14f;

        System.out.print("Dairenin yari capini giriniz: ");
        double radius = input.nextDouble();
        System.out.print("Aciyi giriniz: ");
        double angle = input.nextDouble();

        double totalArea = pi * Math.pow(radius,2);
        double perimeter = 2 * pi * radius;
        double angleArea = totalArea * (angle/360);

        System.out.println("Dairenin total alani: " + totalArea +
                "\nCevresi: " + perimeter +
                "\n"+ angle+ " derecelik alan: "+ angleArea);

    }
}
