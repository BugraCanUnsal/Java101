import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Mayin tarlasinin x boyutunu giriniz : ");
        int x = input.nextInt();
        System.out.print("Mayin tarlasinin y boyutunu giriniz : ");
        int y = input.nextInt();

        MineSweeper ms = new MineSweeper(x,y);

        ms.run();
    }
}
