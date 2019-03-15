package task_1_block_8_collection;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Counter_oldStyle {

    Map<Integer, Integer> map = new TreeMap<>();

    public Counter_oldStyle(ArrayList<Integer> arrayList) {
        for (Integer element : arrayList) {
            map.put(element, map.containsKey(element) ? map.get(element) + 1 : 1);
        }
    }
}
