package example_for_concurrent_modification_exception;

/*
 * Написать пример на получение java.util.ConcurrentModificationException и
 * словить его.
 */

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {

        Collection<Integer> l = new ArrayList<>();

        for (int i = 0; i < 6; ++i) {
            l.add(1);
            l.add(2);
            l.add(3);
        }

        System.out.println("Before exception: \n " + l + "\n");

        try {
            for (int i : l) {
                if (i == 2) {
                    l.remove(i);
                }
            }
        } catch (Exception e) {
            System.out.println("WARNING! We catched an exception \"java.util.ConcurrentModificationException!\" \n");
        }

        System.out.println("After exception: \n " + l);
    }
}