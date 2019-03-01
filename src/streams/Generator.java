package streams;

public class Generator {
    final static int MIN = -100;
    final static int MAX = 100;

    public static int RandomValueGeneration(int min, int max) {
        int rnd = (int) (Math.random() * (max - min + 1) + min);
        return rnd;
    }

    public static int RandomValueGeneration() {
        int rnd = (int) (Math.random() * (MAX - MIN + 1) + MIN);
        return rnd;
    }
}
