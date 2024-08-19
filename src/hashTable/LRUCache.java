package hashTable;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

class LRUCache {
    Map<Integer,Integer> cache ;
    public LRUCache(int capacity) {
        cache = new MyLinkedHashMap<>(capacity);
    }

    public int get(int key) {
        if(cache.get(key)!=null)
        {
            return cache.get(key);
        }
        return -1;
    }

    public void put(int key, int value) {

        cache.put(key,value);
    }
}
class MyLinkedHashMap<K, V> extends LinkedHashMap<K, V> {
    int MAX_ENTRIES ;

    public MyLinkedHashMap(
            int initialCapacity) {
        super(initialCapacity, 0.75f, true);
        MAX_ENTRIES=initialCapacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry eldest) {
        return size() > MAX_ENTRIES;
    }

}

