import java.util.Scanner;

public class Burclar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        short day,month;

        System.out.print("Kacinci ayda dogdunuz? :");
        month = input.nextShort();
        System.out.print("Ayin kacinci gununde dogdunuz? :");
        day = input.nextShort();

        if (month == 1){
            if (day<=21) System.out.println("Oglak burcusunuz...");
            else System.out.println("Kova burcusunuz...");
        } else if (month == 2){
            if (day<=19) System.out.println("Kova burcusunuz...");
            else System.out.println("Balik burcusunuz...");
        } else if (month == 3){
            if (day<=20) System.out.println("Balik burcusunuz...");
            else System.out.println("Koc burcusunuz...");
        } else if (month == 4){
            if (day<=20) System.out.println("Koc burcusunuz...");
            else System.out.println("Boga burcusunuz...");
        } else if (month == 5){
            if (day<=21) System.out.println("Boga burcusunuz...");
            else System.out.println("Ikizler burcusunuz...");
        } else if (month == 6){
            if (day<=22) System.out.println("Ikizler burcusunuz...");
            else System.out.println("Yengec burcusunuz...");
        } else if (month == 7){
            if (day<=22) System.out.println("Yengec burcusunuz...");
            else System.out.println("Aslan burcusunuz...");
        } else if (month == 8){
            if (day<=22) System.out.println("Aslan burcusunuz...");
            else System.out.println("Basak burcusunuz...");
        } else if (month == 9){
            if (day<=22) System.out.println("Basak burcusunuz...");
            else System.out.println("Terazi burcusunuz...");
        } else if (month == 10){
            if (day<=22) System.out.println("Terazi burcusunuz...");
            else System.out.println("Akrep burcusunuz...");
        } else if (month == 11){
            if (day<=21) System.out.println("Akrep burcusunuz...");
            else System.out.println("Yay burcusunuz...");
        } else if (month == 12){
            if (day<=21) System.out.println("Yay burcusunuz...");
            else System.out.println("Oglak burcusunuz...");
        }

    }
}
