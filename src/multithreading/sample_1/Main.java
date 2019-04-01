package multithreading.sample_1;

public class Main {

    public static void main(String[] args) {

        // (1)
        Test_1 thread_1 = new Test_1();
        thread_1.setDaemon(true);
        System.out.println(thread_1.getId());
        thread_1.start();       // в этот момент и порождается тред и будет выполняться параллельно Main()


        //thread_1.setPriority(Thread.MAX_PRIORITY); // 1 - 10

        // (2)
        Thread thread_2 = new Thread(new Test_2());
        thread_2.start();

        // (3) Через анонимный класс
        Thread thread_3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hi, I'm " + this.getClass().getName());
            }
        });

        thread_3.start();

        System.out.println("Finish");
        // Последовательность завершения тхредов непредсказуема.
    }
}
