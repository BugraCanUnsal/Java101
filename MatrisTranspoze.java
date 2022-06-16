public class MatrisTranspoze {
    public static void main(String[] args) {

        int[][] arr = new int[2][3];
        arr[0] = new int[]{2, 3, 4};
        arr[1] = new int[]{5, 6, 4};
        int x = arr.length;
        int y = arr[0].length;
        int[][] arrT = new int[y][x];

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arrT[j][i]=arr[i][j];
            }
        }
    }
}
