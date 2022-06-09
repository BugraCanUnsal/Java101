import java.util.Scanner;

public class NotOrtalamasiPratik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mathGrade, phyGrade, chemGrade, turkGrade, histGrade, musGrade, sum;

        System.out.println("Lutfen matematik notunuzu giriniz:");
        mathGrade = input.nextInt();
        System.out.println("Lutfen fizik notunuzu giriniz:");
        phyGrade = input.nextInt();
        System.out.println("Lutfen kimya notunuzu giriniz:");
        chemGrade = input.nextInt();
        System.out.println("Lutfen Turkce notunuzu giriniz:");
        turkGrade = input.nextInt();
        System.out.println("Lutfen tarih notunuzu giriniz:");
        histGrade = input.nextInt();
        System.out.println("Lutfen muzik notunuzu giriniz:");
        musGrade = input.nextInt();

        sum = mathGrade + phyGrade + chemGrade + turkGrade + histGrade + musGrade;

        System.out.println("Not ortalamaniz: " + (double)(sum/6));

        String overall =  (sum/6>=60)? "Sinifi gecti...":"Sinifta kaldi...";
        System.out.print(overall);

    }
}
