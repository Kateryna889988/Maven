package andersen.lesson6;


import static andersen.lesson6.MyArray.checkArray;

public class HomeWorkApp {
    public static void main(String[] args) {
        Integer[][] nums =
                {
                        {1, 2, 3, 4},
                        {1, 2, 3, 4},
                        {1, 2, 3, 4},
                        {1, 2, 3, 4},
                };
        try {
            int result = checkArray(nums);
            System.out.println("Sum result:" + result);

        } catch (MyArraySizeException | MyArrayDataException exception) {
            System.out.println(exception.getMessage());
        } finally {
            System.out.println("End");
        }


        String[][] strs =
                {
                        {"5", "l", "8", "5"},
                        {"5", "l", "8", "5"},
                        {"5", "l", "8", "5"},
                        {"5", "l", "8", "5"},
                };
        try {
            int result = checkArray(strs);
            System.out.println("Sum result:" + result);
        } catch (MyArrayDataException | MyArraySizeException exception) {
            System.out.println(exception.getMessage());
        } finally {
            System.out.println("End");
        }
    }
}

