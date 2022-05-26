package andersen.lesson2;

public class Task1 {
    public boolean isSumCorrect(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }
}