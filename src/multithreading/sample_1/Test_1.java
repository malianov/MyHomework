package multithreading.sample_1;

class Test_1 extends Thread {
    // Самый простой способ создать тред - наследоваться от тред
    // Один объект тред - это один поток.
    @Override
    public void run() {
        System.out.println("Hi, I'm " + this.getClass().getName());
    }
}

class Test_2 implements Runnable {
    // Второй способ - написать класс, реализующий интерфейс Runnable
    @Override
    public void run() {
        System.out.println("Hi, I'm " + this.getClass().getName());
    }
}

