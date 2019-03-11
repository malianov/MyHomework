package calculator;

public class Calculator extends GenericCalculator <Number> {

    public Number add(Number num_1, Number num_2) {
        return (num_1.doubleValue() + num_2.doubleValue());
    }

    public Number subtract(Number num_1, Number num_2) {
        return (num_1.doubleValue() - num_2.doubleValue());
    }

    public Number multiply(Number num_1, Number num_2) {
        return (num_1.doubleValue() * num_2.doubleValue());
    }

    public Number divide(Number num_1, Number num_2) {
        return (num_1.doubleValue() / num_2.doubleValue());
    }

    public String concate(String str_1, String str_2) {
        return (str_1 + str_2);
    }
}
