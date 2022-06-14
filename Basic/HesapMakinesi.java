import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen ilk sayiyi giriniz: ");
        double firstNumber = input.nextDouble();
        System.out.print("Lütfen ikinci sayiyi giriniz: ");
        double secondNumber = input.nextDouble();

        System.out.println("Yapmak istediginiz islemi giriniz:");
        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        byte choose = input.nextByte();

        switch (choose){
            case 1: System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber+secondNumber));break;
            case 2: System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber-secondNumber));break;
            case 3: System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber*secondNumber));break;
            case 4: if (secondNumber== 0) System.out.println("Sayi sifira bolunemez...");
                else System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber/secondNumber));break;
            default:System.out.println("Hatali bir islem girdiniz...");

        }
    }
}
