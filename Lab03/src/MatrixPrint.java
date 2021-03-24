// print out matrix (mainly for de-bugging purpose)
public class MatrixPrint {
    public MatrixPrint(int[][] array) {
        for (int[] row : array) {
            for (int x : row)
                System.out.print(x + " ");
            System.out.println();
        }
        System.out.println();
    }
}
