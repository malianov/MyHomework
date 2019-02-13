package task_2;

import java.util.Scanner;

public class Controller {

    String strInput;
    int attCounter = 0;
    int maxRnd = 99;
    int minRnd = 1;
    int intInput;
    int rnd;

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUserInput() {

        rnd = Model.rndGeneration(minRnd, maxRnd);
        System.out.println(rnd);

        view.initialMessage(minRnd, maxRnd);

        Scanner sc = new Scanner(System.in);

        do {
            strInput = sc.nextLine();
            attCounter++;

            if (!isInteger(strInput)) {
                view.ifNotIntegerMessage(minRnd, maxRnd);
                continue;
            }

            intInput = Integer.parseInt(strInput);

            if (intInput <= minRnd | intInput >= maxRnd) {
                view.ifNotInRangeMessage(minRnd, maxRnd);
                continue;
            }
            if (intInput > rnd) {
                maxRnd = intInput;
                view.smallerMessage(minRnd, maxRnd);
            } else if (intInput < rnd) {
                minRnd = intInput;
                view.biggerMessage(minRnd, maxRnd);
            } else {
                view.winnerMessage(attCounter);
                break;
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
