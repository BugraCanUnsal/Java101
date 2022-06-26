import java.util.Scanner;

public class EBOB_EKOK {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayi 1 : ");
        int NUMBER1 = input.nextInt();
        int number1 = NUMBER1;
        System.out.print("Sayi 2 : ");
        int NUMBER2 = input.nextInt();
        int number2 = NUMBER2;
        int EBOB = 1;

        int i=2;
        if (number1>number2){
            while (i<number2){
                if (number1%i==0 && number2%i==0){
                    EBOB*=i;
                } else if (number1%i == 0 && number2%i !=0) {
                    number1/=i;
                } else if (number1%i !=0&& number2%i ==0) {
                    number2/=i;
                }
                i++;
            }
        } else if (number2>number1) {
            while (i<number1){
                if (number1%i==0 && number2%i==0){
                    EBOB*=i;
                } else if (number1%i == 0 && number2%i !=0) {
                    number1/=i;
                } else if (number1%i !=0&& number2%i ==0) {
                    number2/=i;
                }
                i++;
            }
        }
        System.out.println("Bu sayilarin ebob'u : " + EBOB);
        int EKOK = (NUMBER1*NUMBER2)/EBOB;
        System.out.println("Bu sayilarin ekok'u : " + EKOK);
    }
}
