package task_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String word_1;
        String word_2;
        int flag = 0;

        System.out.println("You have to enter \"Hello world!\"");
        System.out.println("Enter the first word: ");
        Scanner sc = new Scanner(System.in);

        do {
            if (flag++ != 0) {
                System.out.println("You entered the wrong word! Try again:");
            }
            word_1 = sc.nextLine();
        } while (!firstWordChecker(word_1));
        System.out.println("Enter the second word: ");

        flag = 0;

        do {
            if (flag++ != 0) {
                System.out.println("You entered the wrong word! Try again:");
            }
            word_2 = sc.nextLine();
        } while (!secondWordChecker(word_2));
        System.out.println("So, FINALLY you did this: " + word_1 + " " + word_2);
    }

    public static boolean firstWordChecker(String str) {
        return str.equals("Hello") ? true : false;
    }

    public static boolean secondWordChecker(String str) {
        return str.equals("world!") ? true : false;
    }
}
