package andersen.lesson2;

public class Task7 {
    public void multiplyArray(int[] numbersLessSix) {
        for (int i = 0; i < numbersLessSix.length; i++) {
            if (numbersLessSix [i] <= 6) {
                numbersLessSix [i] = numbersLessSix [i] * 2;
            }

            System.out.println("array [" + i + "] = " + numbersLessSix [i]);
        }
    }
}


