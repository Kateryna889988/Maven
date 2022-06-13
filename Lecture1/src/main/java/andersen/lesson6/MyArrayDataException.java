package andersen.lesson6;

public class MyArrayDataException extends Exception {

    public MyArrayDataException(String message, int column, int line) {

        super("Array conversion error on column:" + column + " and line:" + line + ". Message:" + message);
    }
}
