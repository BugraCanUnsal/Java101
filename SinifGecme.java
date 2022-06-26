import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double math,physic,turkish,chemistry,music;
        short counter = 0;

        System.out.print("Matematik: ");
        double mathGrade= input.nextDouble();
        if(0<=mathGrade && mathGrade<=100) {
            math = mathGrade;
            counter++;
        }
        else math = 0;

        System.out.print("Fizik: ");
        double physicGrade = input.nextDouble();
        if(0<=physicGrade && physicGrade<=100) {
            physic = physicGrade;
            counter++;
        }
        else physic = 0;

        System.out.print("Turkce: ");
        double turkishGrade = input.nextDouble();
        if(0<=turkishGrade && turkishGrade<=100) {
            turkish = turkishGrade;
            counter++;
        }
        else turkish = 0;

        System.out.print("Kimya: ");
        double chemistryGrade = input.nextDouble();
        if(0<=chemistryGrade && chemistryGrade<=100) {
            chemistry = chemistryGrade;
            counter++;
        }
        else chemistry = 0;

        System.out.print("Muzik: ");
        double musicGrade = input.nextDouble();
        if(0<=musicGrade && musicGrade<=100) {
            music = musicGrade;
            counter++;
        }
        else music = 0;

        double average;

        if (counter==0) average = (math+physic+turkish+chemistry+music)/(++counter);
        else  average = (math+physic+turkish+chemistry+music)/counter;

        if (average<55)System.out.print("Sinifta kaldiniz. Seneye gorusmek uzere...");
        else System.out.print("Tebrikler sinifi gectiniz...");

        System.out.print("Ortalamaniz: " + average);
    }
}
