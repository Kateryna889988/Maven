package andersen.lesson2;

public class Task8 {
    public void diagonalFillOne(int[][] numbersLessSix) {
        for (int i = 0; i < numbersLessSix.length; i++) {
            for (int j = 0; j < numbersLessSix[i].length; j++) {
                if (i == j) {
                    numbersLessSix[i][j] = 1;
                }

                if (numbersLessSix[i].length - 1 - j == i) {
                    numbersLessSix[i][j] = 1;
                }

                System.out.print(numbersLessSix[i][j] + " ");
            }

            System.out.println();
        }
    }
}
