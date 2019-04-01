package multithreading.sample_2;

class TestThread_2 extends Thread {
    @Override
    public void run() {
        try {
            //Усыпляем поток на определенное кол-во времени
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println("Hi, I am " + this.getClass().getName());
    }
}

public class Sample_2 {
    public static void main(String[] args) throws InterruptedException {
        TestThread_2 thread = new TestThread_2();
        thread.start();
        // Мы можем запустить тред и с помощью джоина дождаться его выполнения.
        // Запусьили, он 3 сек ждет, выводит текст на экран, а мы с помощью тред джоин
        // ждем, когда она завершит своб работу.
        thread.join();

        System.out.println("Finish");
    }
}
