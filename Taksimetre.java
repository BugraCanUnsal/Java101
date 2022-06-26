import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float perKm = 2.20f;
        short minPayment = 20;
        short startingPrice = 10;

        System.out.print("Gidilen mesafeyi giriniz: ");
        double distance = input.nextDouble();

        String payment = (startingPrice + (distance*perKm)) <= minPayment? "Ücret: " + minPayment :
                "Ücret: " + (startingPrice + (distance*perKm));

        System.out.print(payment);
    }
}
