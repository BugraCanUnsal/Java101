import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz : ");
        float height = input.nextFloat();
        System.out.print("Lütfen kilonuzu giriniz : ");
        float weight = input.nextFloat();

        System.out.print("Vücut kitle indeksiniz :" + (weight / (height*height)) );

    }
}
