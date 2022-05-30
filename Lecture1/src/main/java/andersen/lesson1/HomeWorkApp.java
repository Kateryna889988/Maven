package andersen.lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeFruits();
        checkSumSing(8, 2);
        checkSumSing(-1, 0);
        printColor(1);
        printColor(200);
        printColor(-1);
        compareNumbers(4, 5);
        compareNumbers(8, 7);
    }

    public static void printThreeFruits() {
        System.out.println("Orange\n");

        System.out.println("Banana\n");

        System.out.println("Apple\n");
    }

    public static void checkSumSing(int a, int b) {
        int c = (a + b);
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");

        }
    }

    public static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
    private static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a>=b");
        }
            else {
            System.out.println("a<b");
        }
    }
}