import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class HavaSicakligi {
    public static void main(String[] args) {
        short heat;

        Scanner input = new Scanner(System.in);

        System.out.print("Hava sicakligi giriniz: ");
        heat = input.nextShort();

        if (heat<5) System.out.println("Kayak yapmaya gidebilirsiniz.");
        else if (heat<15) System.out.println("Sinemaya gidebilirsiniz.");
        else if (heat<25) System.out.println("Piknige gidebilirsiniz.");
        else System.out.println("Yuzmeye gidebilirsiniz.");
    }
}
