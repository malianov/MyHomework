package quickTasks;

/*
 * Найти сумму элементов массива
 */

import java.util.stream.IntStream;

public class ArraySum {

    public static int ArraySum(int[] Array) {
        int sum = IntStream.of(Array).sum();
        return sum;
    }

    public static void main(String[] args) {
        int[] Array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        System.out.println(ArraySum(Array));
    }
}
