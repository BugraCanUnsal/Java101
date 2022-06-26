import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String USERNAME = "admin";
        String PASSWORD = "patikadev";

        System.out.print("Lutfen kullanici adinizi giriniz: ");
        String userName = input.nextLine();
        System.out.print("Lufen sifrenizi giriniz: ");
        String password = input.nextLine();

        if (userName.equals(USERNAME) && password.equals(PASSWORD)){
            System.out.print("Basarili giris yaptiniz...");
        }
        else if (!password.equals(PASSWORD)) {
            System.out.println("Hatali sifre girdiniz.Yeni sifre olusturmak ister misiniz? (y/n)");
            String choose = input.nextLine();

            switch (choose){
                case "y" : System.out.print("Yeni sifrenizi giriniz: ");
                String newPassword = input.nextLine();
                if (newPassword.equals(PASSWORD) || newPassword.equals(password))
                    System.out.print("Sifre olusturulamadi, lutfen baska bir sifre giriniz...");
                else {
                    PASSWORD = newPassword;
                    System.out.print("Sifre olusturuldu...");
                }
                break;
                case "n" : System.out.print("Gorusmek uzere...");break;
                default: System.out.print("Hatali secim yaptiniz...");
            }

        }

    }
}
