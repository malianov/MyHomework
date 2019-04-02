package multithreading.sample_4;

class TestThread_4 extends Thread {
    private volatile boolean stop;

    // volatile - ключевое слово, которое можно применять как к примитивам (к полям примитивного
    // типа в полях класса), так и к полям ссылочного типа.
    // volatile  гарантирует, что если с отмеченным полем вы работаете из разных тредов,
    // то обеспечивается то, что все треды работают именно с этим полем и операции чтения и записи
    // происходят атомарно.

    @Override
    public void run() {
        while (!stop) {
            System.out.println("prog.kiev.ua");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
    public void myInterrupt() {
        stop = true;
    }
}

public class Sample_4 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new TestThread_4());
        thread.start();

        thread.sleep(5000);
        thread.interrupt();
    }
}