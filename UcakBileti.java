import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float perKm = 0.10f;
        short distance,age,tripType;

        System.out.print("Gideceğiniz mesafeyi giriniz (Km) : ");
        distance = input.nextShort();
        System.out.print("Yasinizi giriniz : ");
        age = input.nextShort();
        System.out.println("Yolculuk tipini giriniz:\n1-Tek Yon\n2-Gidis-Donus");
        tripType = input.nextShort();

        double normalPayment = distance * perKm;
        double overallPayment;

        if (age>0 && distance>0){
            if (age<12){
                overallPayment = normalPayment*0.50;
            } else if (age<24) {
                overallPayment = normalPayment*0.90;
            } else if (age>65) {
                overallPayment = normalPayment*0.70;
            }else overallPayment = normalPayment;
            switch (tripType){
                case 1:
                    System.out.print("Toplam Tutar = " + overallPayment);
                    break;
                case 2:
                    System.out.println("Toplam Tutar = " + (overallPayment*0.80)*2 );
                    break;
                default:
                    System.out.println("Hatali Veri Girdiniz!");
            }
        }else {
            System.out.println("Hatali Veri Girdiniz!");
        }
    }
}
