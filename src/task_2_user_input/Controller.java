package task_2_user_input;

import java.util.Scanner;

public class Controller {

    int maxRnd;
    int minRnd;
    int intInput;
    int rnd;

    String strInput;
    int attCounter = 0;

    private Scanner scanner;
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
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

    public int getMaxRnd() {
        return maxRnd;
    }

    public void setMaxRnd(int maxRnd) {
        this.maxRnd = maxRnd;
    }

    public int getMinRnd() {
        return minRnd;
    }

    public void setMinRnd(int minRnd) {
        this.minRnd = minRnd;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void generateScanner() {
        this.scanner = new Scanner(System.in);
    }

    public void UserSettingBoundaries() {
        View.printLowBoundaryInvitation();
        do {
            strInput = scanner.nextLine();
            if (!isInteger(strInput)) {
                view.valueNotInteger();
                continue;
            }
            setMinRnd(Integer.parseInt(strInput));
            break;
        } while (true);

        View.printUpperBoundaryInvitation();
        do {
            strInput = scanner.nextLine();
            if (!isInteger(strInput)) {
                view.valueNotInteger();
                continue;
            }
            setMaxRnd(Integer.parseInt(strInput));
            break;
        } while (true);

    }

    public void processUserInput() {
        generateScanner();
        UserSettingBoundaries();

        rnd = Model.rndGeneration(getMinRnd(), getMaxRnd());

        view.initialMessage(getMinRnd(), getMaxRnd());

        do {
            strInput = scanner.nextLine();
            attCounter++;

            if (!isInteger(strInput)) {
                view.ifNotIntegerMessage(getMinRnd(), getMaxRnd());
                continue;
            }

            intInput = Integer.parseInt(strInput);

            if (intInput < getMinRnd() | intInput > getMaxRnd()) {
                view.ifNotInRangeMessage(getMinRnd(), getMaxRnd());
                continue;
            }
            if (intInput > rnd) {
                setMaxRnd(intInput);
                view.smallerMessage(getMinRnd(), getMaxRnd());
            } else if (intInput < rnd) {
                setMinRnd(intInput);
                view.biggerMessage(getMinRnd(), getMaxRnd());
            } else {
                view.winnerMessage(attCounter);
                break;
            }

        } while (true);
    }
}
