public class Byazdirma {
    public static void main(String[] args) {
        String[][] b = new String[7][4];

        for (int i = 0; i <b.length ; i++) {
            for (int j = 0; j < b[i].length; j++) {
                if (i == 0 || i == 3 || i == 6){
                    b[i][j] = "*";
                } else if (j==0 || j ==3) {
                    b[i][j] = "* ";
                }else b[i][j] = " ";
            }
        }

        for (String[] row : b) {
            for (String col : row ) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
