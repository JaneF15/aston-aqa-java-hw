import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(sumInRange(3, 9));
        System.out.println("------------------------------------------------");
        printSign(13);
        System.out.println("------------------------------------------------");
        System.out.println(isNegative(-2));
        System.out.println("------------------------------------------------");
        printLines("Apple", 5);
        System.out.println("------------------------------------------------");
        System.out.println(isLeapYear(2050));
        System.out.println("------------------------------------------------");
        reverseArrayValues(new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0});
        System.out.println("------------------------------------------------");
        fillArrayWithNumInOrder(new int[100]);
        System.out.println("------------------------------------------------");
        doubleSomeArrayValues(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1});
        System.out.println("------------------------------------------------");
        fillDiagonalsOfMatrix(new int[5][5]);
        System.out.println("------------------------------------------------");
        System.out.println(Arrays.toString(fillArray(5, -7)));
    }


    public static boolean sumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }


    public static void printSign(int a) {
        String result = a >= 0 ? "Положительное" : "Отрицательное";
        System.out.println(result);
    }


    public static boolean isNegative(int a) {
        return a < 0;
    }


    public static void printLines(String str, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }
    }


    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        }
        return year % 4 == 0;
    }


    public static void reverseArrayValues(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] == 0 ? 1 : 0;
        }
        System.out.println(Arrays.toString(array));
    }


    public static void fillArrayWithNumInOrder(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));
    }


    public static void doubleSomeArrayValues(int[] array) {


        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(array));
    }


    public static void fillDiagonalsOfMatrix(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
            array[i][array.length - 1 - i] = 1;
            System.out.println(Arrays.toString(array[i]));
        }
    }


    public static int[] fillArray(int len, int initialValue) {
        int[] array = new int[len];
        Arrays.fill(array, initialValue);
        return array;
    }
}
