import java.util.Scanner;

public class MineSweeper {

    private int x,y;
    private String[][] board;
    private String[][] minedBoard;


    public MineSweeper(int x, int y) {
        this.x = x;
        this.y = y;
        this.board=createBoard(x,y);
        //showBoard(this.board);
        this.minedBoard = createMinedBoard(x,y);
        //showBoard(this.minedBoard);
    }

    public String[][] createBoard(int x,int y){
        String[][] BOARD = new String[x][y];
        for (int i = 0; i <BOARD.length ; i++) {
            for (int j = 0; j <BOARD[i].length ; j++) {
                BOARD[i][j] = "-";
            }
        }
        return BOARD;
    }
    public String[][] createMinedBoard(int x, int y){
        String[][] BOARD = createBoard(x,y);
        int mineCount = (x*y)/4;
        for (int i = 0; i < mineCount ; i++) {
            int a = (int) (Math.random() * x);
            int b = (int) (Math.random() * y);
            if (!BOARD[a][b].equals("*")){
                BOARD[a][b] = "*";
            }else i--;
        }return BOARD;
    }
    public void showBoard(String[][] arr){
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public boolean isMined(int coord1, int coord2){
        return this.minedBoard[coord1][coord2].equals("*");
    }

    public String checkNearMines(int coord1,int coord2){
        int counter = 0;

        for (int i = coord1-1; i < coord1+2 ; i++) {
            for (int j = coord2-1; j < coord2+2; j++) {
                if (i<0 || i>this.board.length-1){
                    continue;
                } else if (j<0 || j>this.board[0].length-1) {
                    continue;
                } else if (this.minedBoard[i][j].equals("*")) counter++;
            }
        }return Integer.toString(counter);
    }
    public void run(){
        Scanner input = new Scanner(System.in);
        int mines = 0;
        for (String[] mine: this.minedBoard) {
            for (String Mine: mine ) {
                if (Mine.equals("*"))mines++;
            }
        }
        System.out.println("Mayin Tarlasi Oyununa Hosgeldiniz !");

        while (true){
            System.out.println("=================================");

            showBoard(this.board);
            System.out.print("Satir Giriniz : ");
            int coord1 = input.nextInt();
            System.out.print("Sutun Giriniz : ");
            int coord2 = input.nextInt();

            if (coord1>this.board.length-1 || coord2>this.board[0].length){
                System.out.println("Lutfen sinir disina cikmayiniz!!");
                continue;
            } else if (coord1<0 || coord2<0) {
                System.out.println("Lutfen sinir disina cikmayiniz!!");
                continue;
            } else if (!isMined(coord1,coord2)){
                String mineCount = checkNearMines(coord1,coord2);
                this.board[coord1][coord2] = mineCount;
            } else {
                System.out.println("Game Over!!");
                showBoard(this.minedBoard);
                break;
            }
            int spaces = 0;
            for (String[] space : this.board) {
                for (String Space: space) {
                    if (Space.equals("-"))spaces++;
                }
            }if (spaces == mines) {
                System.out.println("Oyunu Kazandiniz !");
                for (int i = 0; i <this.minedBoard.length ; i++) {
                    for (int j = 0; j <this.minedBoard[0].length ; j++) {
                        if (this.minedBoard[i][j].equals("*")){
                            this.board[i][j] = this.minedBoard[i][j];
                    }
                }
                }
                showBoard(this.board);
                break;
            }
        }


    }

}
