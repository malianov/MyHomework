package streams;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        final int ARRAY_LENGTH = 100;                         ////
        int[] array = new int[ARRAY_LENGTH];                    //
        final int MULTIPLICATOR = 10;                           //
                                                                //
        for (int i = 0; i < ARRAY_LENGTH; i++) {                //
            array[i] = Generator.RandomValueGeneration();       //  Array created and filled in
        }                                                       //
                                                                //
        System.out.println("\n The generated array is: ");      //
        ArrayPrinter.Printer(array, ARRAY_LENGTH);            ////

        int[] arrayStream = Arrays.stream(array).toArray();             ////
                                                                          //
        System.out.println("\n The converted to stream array is: ");      //  Array converted to stream and printed
        ArrayPrinter.Printer(arrayStream, ARRAY_LENGTH);                ////

        System.out.println("\n The average is: "                                + Average(array));
        System.out.println("\n The minimal value is: "                          + Minimal(array) + ", and the minimal value index is: "
                                                                                + MinIndex(array, Minimal(array)));
        System.out.println("\n The quantity of elements equal to 0 is: "        + EqualToZero(array));
        System.out.println("\n The quantity of elements where element > 0 is: " + BiggerThanZero(array));
        System.out.println("\n The new array, with elements multiplied by "     + MULTIPLICATOR + ":");
        ArrayPrinter.Printer(ArrayMultiplyBy(array, MULTIPLICATOR), ARRAY_LENGTH);
    }

    public static double Average(int[] array) {
        OptionalDouble ArrayStreamAverage = Arrays.stream(array).average();
        return ArrayStreamAverage.getAsDouble();
    }

    public static int Minimal(int[] array) {
        OptionalInt ArrayStreamMin = Arrays.stream(array).min();
        return ArrayStreamMin.getAsInt();
    }

    public static int MinIndex(int[] array, int minValue) {
        int minIndex = IntStream.range(0, array.length).
            filter(i -> minValue == array[i])
            .findFirst()
            .getAsInt();
        return minIndex;
    }

    public static long EqualToZero(int[] array) {
        long equalToZero = Arrays.stream(array)
                .filter(x -> x == 0)
                .count();
        return equalToZero;
    }

    public static long BiggerThanZero(int[] array) {
        long biggerThanZero = Arrays.stream(array)
                .filter(x -> x > 0)
                .count();

        return biggerThanZero;
    }

    public static int[] ArrayMultiplyBy(int[] array, int multiplicator) {
        int[] arrayMultiplyBy = Arrays.stream(array)
            .map(x -> x * multiplicator)
            .toArray();
        return arrayMultiplyBy;
    }
}
