package andersen.lesson2;

public class Task8 {
    public void diagonalFillOne(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    matrix[i][j] = 1;
                }

                if (matrix[i].length - 1 - j == i) {
                    matrix[i][j] = 1;
                }

                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }
}
