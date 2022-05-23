package andersen.lesson2;

public class Task6 {
    public void fillArray(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
            System.out.println("array [" + i + "] = " + numbers[i]);
        }
    }
}


