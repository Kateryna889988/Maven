package andersen.lesson2;

public class HomeWorkApp {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        Task3 task3 = new Task3();
        Task4 task4 = new Task4();
        Task5 task5 = new Task5();
        Task6 task6 = new Task6();
        Task7 task7 = new Task7();
        Task8 task8 = new Task8();

        System.out.println("____task1_____");
        boolean t = task1.isSumCorrect(1, 5);
        boolean f = task1.isSumCorrect(10, 5);

        System.out.println("____task2_____");
        task2.isPositiveOrNegative(5);
        task2.isPositiveOrNegative(-2);
        task2.isPositiveOrNegative(0);

        System.out.println("____task3_____");
        boolean b = task3.isPositiveOrNegative1(5);
        boolean g = task3.isPositiveOrNegative1(-2);
        boolean j = task3.isPositiveOrNegative1(0);

        System.out.println("____task4_____");
        task4.printWordNTimes("Helloy, Kitty!", 6);

        System.out.println("____task5_____");
        int[] nums = {1, 0, 1, 0, 1, 0};
        task5.rotateItems(nums);

        System.out.println("____task6_____");
        int[] numbers = new int[100];
        task6.fillArray(numbers);

        System.out.println("____task7_____");
        int[] numbersLessSix = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        task7.multiplyArray(numbersLessSix);

        System.out.println("____task8_____");
        int[][] matrix =
                {
                        {4, 5, 3, 2, 4},
                        {8, 5, 3, 2, 5},
                        {9, 5, 3, 2, 9},
                        {6, 5, 3, 2, 5},
                        {6, 5, 3, 2, 5}
                };

        task8.diagonalFillOne(matrix);
    }
}