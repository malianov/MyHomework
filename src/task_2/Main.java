package task_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int maxRnd = 100;
        int minRnd = 0;
        String strInput;
        int intInput;
        int attCounter = 0;

        Random random = new Random(minRnd, maxRnd);
        System.out.println(random.rnd);

        System.out.println("The program has generated an integer value in [" + minRnd + "; " + maxRnd + "]");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter an integer number in [" + minRnd + "; " + maxRnd + "]");

        do {
            strInput = sc.nextLine();
            attCounter++;

            if (isInteger(strInput)) {
                intInput = Integer.parseInt(strInput);

                if (intInput >= 0 && intInput <= 100) {
                    if (intInput > random.rnd) {
                        System.out.println("The generated value is smaller");
                    } else if (intInput < random.rnd){
                        System.out.println("The generated value is bigger");
                    } else {
                        System.out.println("Congratulations! You win in " + attCounter + " attempts!");
                        break;
                    }
                } else {
                    System.out.println("Your number is not inside [" + minRnd + ";" + maxRnd + "]");
                }
            } else {
                System.out.println("Please, enter an integer number in [" + minRnd + "; " + maxRnd + "]: ");
            }
        } while (true);
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
}
