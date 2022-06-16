import java.util.Scanner;

public class Ucgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hipotenus hesabi icin degerleri giriniz:");
        System.out.print("1. Kenar(cm): ");
        int firstSide = input.nextInt();
        System.out.print("2. Kenar(cm): ");
        int secondSide = input.nextInt();

        System.out.println("Hipotenus uzunlugu: " + Math.pow(Math.pow(firstSide,2)+Math.pow(secondSide,2),0.5) + "cm");

        System.out.println("Ucgenin alanini hesaplamak icin kenar uzunluklarini giriniz(cm):");
        System.out.print("1. Kenar: ");
        int a_Side = input.nextInt();
        System.out.print("2. Kenar: ");
        int b_Side = input.nextInt();
        System.out.print("3. Kenar: ");
        int c_Side = input.nextInt();

        //Half perimeter
        double u = (a_Side+b_Side+c_Side)/2;

        double area = Math.pow((u*(u-a_Side)*(u-b_Side)*(u-c_Side)),0.5);

        String isNaN = Double.isNaN(area)? "Bu olculer, bir ucgen belirtmez..." : "Ucgeninizin alani: " + area;
        System.out.print(isNaN);

    }
}
