package task_1_block_8_collection;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Counter_newStyle {

    Map<Integer, Integer> map = new TreeMap<>();

    public Counter_newStyle(ArrayList<Integer> arrayList) {

        arrayList.stream()
                .forEach(a -> map.put(a, map.getOrDefault(a, 0) + 1));
    }
}
