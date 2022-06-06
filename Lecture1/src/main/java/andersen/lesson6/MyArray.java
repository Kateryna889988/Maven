package andersen.lesson6;

public class MyArray {

    public static <T> int checkArray(T[][] arr) throws MyArrayDataException, MyArraySizeException {

        if (arr.length != 4) throw new MyArraySizeException("Array columns are not equal to 4");

        for (T[] column : arr) {
            if (column.length != 4) throw new MyArraySizeException("Array lines are not equal to 4");
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                var item = arr[i][j];
                if (item instanceof Number) {
                    sum += ((Number) item).intValue();
                    continue;
                }

                throw new MyArrayDataException("Array rows not summed", i, j);
            }
        }
        return sum;
    }
}




