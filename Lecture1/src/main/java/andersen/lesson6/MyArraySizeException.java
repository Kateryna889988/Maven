package andersen.lesson6;

public class MyArraySizeException extends Exception {

    public MyArraySizeException(String message) {

        super("Array size error: " + message);

    }
}



