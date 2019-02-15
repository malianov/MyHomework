package task_2_user_input.support;

public class Random {
    int RAND_MAX = 2_147_483_646;
    int min = 0;
    int max = RAND_MAX;
    public int rnd;

    public Random () {
        rnd = (int) (Math.random() * (max - min + 1) + min);
    }

    public Random(int min, int max) {
        rnd = (int) (Math.random() * (max - min + 1) + min);
    }
}
