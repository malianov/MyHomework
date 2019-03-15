package task_1_block_8_collection;

import java.util.ArrayList;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arlist = new ArrayList<>();
        arlist.add(4);
        arlist.add(5);
        arlist.add(-6);
        arlist.add(4);
        arlist.add(5);
        arlist.add(3);
        arlist.add(4);
        arlist.add(2);
        arlist.add(4);
        arlist.add(5);
        arlist.add(7);

        System.out.println("We have the following ArrayList<Integer>:\n" + arlist);
        Counter_oldStyle counter = new Counter_oldStyle(arlist);

        System.out.println("\nAs result with an old variant we have: ");
        for (Map.Entry<Integer, Integer> entry : counter.map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        Counter_newStyle new_counter = new Counter_newStyle(arlist);
        System.out.println("\nAs result with a new variant we have: ");
        new_counter.map.forEach((k, v) -> System.out.println(k + " - " + v));
    }
}

