import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double balance = 4500;
        byte right = 3;
        String USERNAME = "patikadev";
        String PASSWORD = "admin";

        while (right>0){

            System.out.print("Lutfen kullanici adinizi giriniz: ");
            String userName = input.nextLine();
            System.out.print("Lutfen parolanizi giriniz: ");
            String password = input.nextLine();

            while (true){
                if (userName.equals(USERNAME) && password.equals(PASSWORD)){
                    System.out.print("Yapmak istediginiz islemi seciniz:\n1-Para cekme\n2-Para yatirma\n3-Bakiye sorgula\n4-Cikis yap\n");
                    System.out.print("Islem: ");
                    byte select = input.nextByte();

                    switch (select){
                        case 1:
                            while (true){
                                System.out.println("Bakiyeniz : " + balance);
                                System.out.print("Cekmek istediginiz tutari giriniz: ");
                                double cashOut = input.nextDouble();

                                if (balance-cashOut < 0){
                                    System.out.println("Hesabinizda bu tutarda para yok...");
                                }else {
                                    balance-=cashOut;
                                    System.out.println("Yeni bakiyeniz : " + balance);
                                    break;
                                }
                            }
                            continue;
                        case 2:
                            System.out.print("Yatirmak istediginiz tutari giriniz: ");
                            double cashIn = input.nextDouble();
                            balance+=cashIn;
                            System.out.println("Yeni bakiye : " + balance);
                            continue;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            continue;
                        case 4:
                            System.out.println("Cikis yapiliyor...\nGorusmek uzere...");
                            break;
                        default:
                            System.out.println("Hatali islem tusladınız...");
                            continue;
                    }
                    if (select==4){
                        break;
                    }
                }
                else {
                    right--;
                    System.out.println("Hatali kullanici adi veya sifre tusladiniz.");
                    if (right == 0){
                        System.out.println("Giris hakkiniz kalmamistir. Lutfen musteri hizmetleriyle iletisime geciniz.");
                        break;
                    }
                    else {
                        System.out.println("Lutfen tekrar deneyiniz. Kalan hakkiniz : " + right);
                        break;
                    }
                }
                continue;
            }

        }

    }
}
