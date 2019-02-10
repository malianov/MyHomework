package task_2;

import java.util.Scanner;

public class Main {

    public static int rndGeneration(int minRnd, int maxRnd) {
        Random random = new Random(minRnd, maxRnd);
        return random.rnd;
    }

    public static void rndGenerationConfirmation(int minRnd, int maxRnd) {
        System.out.println("The program has already generated an integer value in [" + minRnd + "; " + maxRnd + "]. You have to guess it.");
    }

    public static void initialUserInstruction(int minRnd, int maxRnd) {
        System.out.println("Please, enter an integer number in [" + minRnd + "; " + maxRnd + "]");
    }

    public static void ifNotIntegerMessage(int minRnd, int maxRnd) {
        System.out.println("You entered not INTEGER value. Try again with INTEGER value inside [" + minRnd + ";" + maxRnd + "]");
    }

    public static void ifNotInRangeMessage(int minRnd, int maxRnd){
        System.out.println("Your number is not inside [" + minRnd + ";" + maxRnd + "]");
    }

    public static void smallerMessage() {
        System.out.println("The generated value is smaller");
    }

    public static void biggerMessage() {
        System.out.println("The generated value is bigger");
    }

    public static void winnerMessage(int attCounter) {
        System.out.println("Congratulations! You have solved the task in " + attCounter + " attempts!");
    }

    public static boolean isInteger(String str) {
        int length = str.length();
        if (str == null | str.isEmpty() | str.charAt(0) == '-') {

            return false;
        }

        for (int i = 0; i < length; i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int maxRnd = 100;
        int minRnd = 0;
        String strInput;
        int intInput;
        int attCounter = 0;
        int rnd;

        rnd = rndGeneration(minRnd, maxRnd);
        rndGenerationConfirmation(minRnd, maxRnd);
        initialUserInstruction(minRnd, maxRnd);

        Scanner sc = new Scanner(System.in);

        do {
            strInput = sc.nextLine();
            attCounter++;

            if (!isInteger(strInput)) {
                ifNotIntegerMessage(minRnd, maxRnd);
                continue;
            }

            intInput = Integer.parseInt(strInput);

            if (intInput <= minRnd | intInput >= maxRnd) {
                ifNotInRangeMessage(minRnd, maxRnd);
                continue;
            }
            if (intInput > rnd) {
                smallerMessage();
            } else if (intInput < rnd) {
                biggerMessage();
            } else {
                winnerMessage(attCounter);
                break;
            }

        } while (true);
    }
}

