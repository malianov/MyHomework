package task_2_user_input;

import task_2.support.Random;

public class Model {

    public static int rndGeneration(int minRnd, int maxRnd) {
        Random random = new Random(minRnd, maxRnd);
        return random.rnd;
    }
}
