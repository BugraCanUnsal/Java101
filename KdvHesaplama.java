import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen tutari giriniz: ");
        double tutar = input.nextDouble();

        String output = tutar<1000? "Kdv haric tutar: " + tutar + "\nKdv dahil tutar: " + tutar*1.18 :
                "Kdv haric tutar: " + tutar + "\nKdv dahil tutar: " + tutar*1.08;
        System.out.println(output);

    }
}
