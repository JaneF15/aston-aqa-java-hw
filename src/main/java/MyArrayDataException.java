public class MyArrayDataException extends Exception {
    private int i;
    private int j;

    MyArrayDataException(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public MyArrayDataException(String message, int i, int j) {
        super(message + i + ", " + j);
        this.i = i;
        this.j = j;
    }

    public MyArrayDataException(String message, Throwable cause, int i, int j) {
        super(message + i + ", " + j, cause);
        this.i = i;
        this.j = j;
    }

}