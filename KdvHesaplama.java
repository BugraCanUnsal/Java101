import jdk.jshell.Snippet;

import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen tutari giriniz: ");
        int tutar = input.nextInt();

        String output = tutar<1000? "Kdv haric tutar: " + tutar + "\nKdv dahil tutar: " + tutar*1.18 :
                "Kdv haric tutar: " + tutar + "\nKdv dahil tutar: " + tutar*1.08;
        System.out.println(output);

    }
}
