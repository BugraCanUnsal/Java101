import java.util.Scanner;

public class GelismisHesapMakinesi {
    public static void main(String[] args) {
        /*1- Toplama İşlemi
        2- Çıkarma İşlemi
        3- Çarpma İşlemi
        4- Bölme işlemi
        5- Üslü Sayı Hesaplama
        6- Faktoriyel Hesaplama
        7- Mod Alma
        8- Dikdörtgen Alan ve Çevre Hesabı*/
        Scanner input = new Scanner(System.in);

        while (true){
            System.out.print("1- Toplama Islemi\n" +
                    "2- Cikarma Islemi\n" +
                    "3- Carpma Islemi\n" +
                    "4- Bolme Islemi\n" +
                    "5- Uslu Sayi Hesaplama\n" +
                    "6- Faktoriyel Hesaplama\n" +
                    "7- Mod Alma\n" +
                    "8- Dikdortgen Alan ve Cevre Hesabi\n"+
                    "0- Cikis\n"+
                    "Yapmak istediginiz islemi seciniz = ");

            byte select = input.nextByte();
            if (select==0){
                System.out.println("Cikik yapiliyor...");
                break;
            }
            switch (select){
                case 1:
                    sum();
                    break;
                case 2:
                    sub();
                    break;
                case 3:
                    multiply();
                    break;
                case 4:
                    divide();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangle();
                    break;
                default:
                    continue;
            }
        }
    }
    static void sum(){
        Scanner input = new Scanner(System.in);
        int i = 1, sum = 0 , number ;
        System.out.print(i + ". sayi = ");
        sum = input.nextInt();
        while (true){
            System.out.print(sum + " + " );
            number = input.nextInt();
            if (number == 0 ){
                System.out.println("Sonuc = " + sum);
                break;
            }
            sum+=number;
            System.out.println("= " + sum);
        }
    }
    static void sub(){
        Scanner input = new Scanner(System.in);
        int sub , number ;
        System.out.print("1. sayi = ");
        sub = input.nextInt();
        while (true){
            System.out.print(sub + " - " );
            number = input.nextInt();
            if (number == 0 ){
                System.out.println("Sonuc = " + sub);
                break;
            }
            sub-=number;
            System.out.println("= " + sub);
        }
    }
    static void multiply(){
        Scanner input = new Scanner(System.in);
        int mult , number ;
        System.out.print("1. sayi = ");
        mult = input.nextInt();
        while (true){
            System.out.print(mult + " * " );
            number = input.nextInt();
            if (number == 0 ){
                System.out.println("Sonuc = " + 0);
                break;
            } else if (number == 1) {
                System.out.println("Sonuc = " + mult);
                break;
            }
            mult*=number;
            System.out.println("= " + mult);
        }
    }
    static void divide(){
        Scanner input = new Scanner(System.in);
        double mult , number ;
        System.out.print("1. sayi = ");
        mult = input.nextDouble();
        while (true){
            System.out.print(mult + " / " );
            number = input.nextDouble();
            if (number == 0 ){
                System.out.println("Sayi sifira bolunemez...");
                continue;
            } else if (number == 1) {
                System.out.println("Sonuc = " + mult);
                break;
            }
            mult/=number;
            System.out.println("= " + mult);
        }
    }
    static void power(){
        Scanner input = new Scanner(System.in);
        System.out.print("Taban sayiyi giriniz = ");
        int base = input.nextInt();
        System.out.print("Us sayiyi giriniz = ");
        int power = input.nextInt();
        int total = 1;
        if (power == 0) System.out.println("Sonuc = 1");
        else if (base == 0 ) System.out.println("Sonuc = 0");
        else {
            for (int i = 0; i < power; i++) {
                total*=base;
            }
            System.out.println("Sonuc = " + total);
        }
    }
    static void factorial(){
        Scanner input = new Scanner(System.in);
        System.out.print("Faktoriyeli alinacak sayiyi giriniz = ");
        int number = input.nextInt();
        int factorial = 1;
        for (int i = 1; i <= number ; i++) {
            factorial*=i;
        }
        System.out.println("Sonuc = " + factorial);
    }
    static void mod(){
        Scanner input = new Scanner(System.in);
        System.out.print("Modu alinacak sayiyi giriniz = ");
        int base = input.nextInt();
        while (true){
            System.out.print(base + " % " );
            int mod = input.nextInt();
            if (mod == 0){
                System.out.println("Sayi sifira bolunemez...");
                continue;
            }
            System.out.println("= " + base%mod);
            break;
        }
    }
    static void rectangle(){
        Scanner input = new Scanner(System.in);
        System.out.print("Dikdortgenin enini giriniz = ");
        int width = input.nextInt();
        System.out.print("Dikdortgenin boyunu giriniz = ");
        int height = input.nextInt();
        System.out.println("Dikdortgenin alani = " + height*width);
        System.out.println("Dikdortgenin cevresi = " + 2*(height+width));
    }
}
