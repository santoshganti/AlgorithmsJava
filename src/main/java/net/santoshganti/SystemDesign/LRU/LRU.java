package net.santoshganti.SystemDesign.LRU;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRU {

    LinkedHashMap<Integer, Integer> lMap;

    public LRU(final int capacity) {
        lMap = new LinkedHashMap() {
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size() > capacity;
            }
        };

    }

    public int get(int key) {
        if (!lMap.containsKey(key)) {
            return -1;
        }

        int val = lMap.remove(key);
        lMap.put(key, val);
        return val;
    }

    public void put(int key, int value) {
        lMap.remove(key);
        lMap.put(key, value);
    }
}

//    public boolean removeEldestEntry(Map.Entry<Integer key, Inetger value> en){
//        return size() > capacity;
//    }
//        )

//}