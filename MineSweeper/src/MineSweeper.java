public class MineSweeper {

    int x,y;
    String[][] board;
    String[][] minedBoard;


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

}
