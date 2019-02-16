package quickTasks.regex_ukr_name;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your name: ");

        while (true) {
            String name = scanner.nextLine();

            if (checkUkrName(name)) {
                System.out.println("Your name is " + name + " and it is ukraininan");
            } else {
                System.out.println("Your entered not ukraininan name");
            }
        }
    }

    public static boolean checkUkrName(String ukrName) {
        Pattern pattern = Pattern.compile("^[А-ЩЬЮЯҐІЇЄа-щьюяґіїє'\\-]{2,30}$");
        Matcher matcher = pattern.matcher(ukrName);
        return matcher.find();
    }
}
