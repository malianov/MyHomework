package draft;

public class View {
    public static final String INITIAL_MESSAGE = "The program has already generated an integer value in ";
    public static final String INPUT_INTEGER = "Please, enter an integer number in ";
    public static final String INPUT_NOT_INTEGER = "You entered not INTEGER value. Try again with INTEGER value inside";
    public static final String INPUT_NOT_INSIDE = "Your number is not inside ";
    public static final String SMALLER = "The generated value is smaller";
    public static final String BIGGER = "The generated value is bigger";
    public static final String CONGRATULATIONS = "Congratulations! You have solved the task in ";
    public static final String LEFT_QUOTE = "[";
    public static final String RIGHT_QUOTE = "]";
    public static final String SEMICOLON = ";";
    public static final String ATTEMPTS = " attempts";
    public static final String LEFT_PARENTHESIS = "(";
    public static final String RIGHT_PARENTHESIS = ")";


    public static void initialMessage(int minRnd, int maxRnd) {
        System.out.println(INITIAL_MESSAGE + LEFT_PARENTHESIS + (minRnd - 1) + SEMICOLON + (maxRnd + 1) + RIGHT_PARENTHESIS);
        System.out.println(INPUT_INTEGER + LEFT_QUOTE + minRnd + SEMICOLON + maxRnd + RIGHT_QUOTE);
    }

    public static void ifNotIntegerMessage(int minRnd, int maxRnd) {
        System.out.println(INPUT_NOT_INTEGER + LEFT_QUOTE + minRnd + SEMICOLON + maxRnd + RIGHT_QUOTE);
    }

    public static void ifNotInRangeMessage(int minRnd, int maxRnd){
        System.out.println(INPUT_NOT_INSIDE + LEFT_QUOTE + minRnd + SEMICOLON + maxRnd + RIGHT_QUOTE);
        System.out.println(INPUT_INTEGER + LEFT_QUOTE + minRnd + SEMICOLON + maxRnd + RIGHT_QUOTE);
    }

    public static void smallerMessage(int minRnd, int maxRnd) {
        System.out.println(SMALLER);
        System.out.println(INPUT_INTEGER + LEFT_QUOTE + minRnd + SEMICOLON + maxRnd + RIGHT_QUOTE);
    }

    public static void biggerMessage(int minRnd, int maxRnd) {
        System.out.println(BIGGER);
        System.out.println(INPUT_INTEGER + LEFT_QUOTE + minRnd + SEMICOLON + maxRnd + RIGHT_QUOTE);
    }

    public static void winnerMessage(int attCounter) {
        System.out.println(CONGRATULATIONS + attCounter + ATTEMPTS);
    }
}
