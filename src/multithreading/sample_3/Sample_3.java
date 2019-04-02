package multithreading.sample_3;

class TestThread_3 implements Runnable {
    @Override
    public void run() {
        while( ! Thread.currentThread().isInterrupted()) {
            System.out.println("prog.kiev.ua");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}

public class Sample_3 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new TestThread_3());
        thread.start();

        Thread.sleep(5000);
        //thread.stop();          // Deprecated, прерывает тред без лишних вопросов
        thread.interrupt();     // Это корректный способ попросить тхред прерваться.
    }
}