package patterns.creational.factory;

import java.util.Date;

public class FactoryMethodApp {
    public static void main(String[] args) {
        WatchMaker maker = getMakerByName("Digital");
        Watch watch = maker.createWatch();
        watch.showTime();
    }
    public static WatchMaker getMakerByName(String maker) {
        if(maker.equals("Digital")) {
            return new DigitalWatchMaker();
        } else if (maker.equals("Rome")) {
            return new RomelWatchMaker();
        }
        throw new RuntimeException("Not supported factory line " + maker);
    }
}

interface Watch {
    void showTime();
}

class DigitalWatch implements Watch {
    public void showTime() {
        System.out.println(new Date());
    }
}

class RomeWatch implements Watch {
    public void showTime() {
        System.out.println("VII-XX");
    }
}

interface WatchMaker {
    Watch createWatch();
}

class DigitalWatchMaker implements WatchMaker {
    public Watch createWatch() {
        return new DigitalWatch();
    }
}

class RomelWatchMaker implements WatchMaker {
    public Watch createWatch() {
        return new RomeWatch();
    }
}