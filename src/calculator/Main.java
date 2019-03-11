package calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("result is :" + calc.add         (6,4));
        System.out.println("result is :" + calc.subtract    (6,4));
        System.out.println("result is :" + calc.multiply    (6,4));
        System.out.println("result is :" + calc.divide      (6,4));
        System.out.println("result is :" + calc.concate     ("6","4"));
    }
}
