package Practice_3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapSynch<E,V> implements Map {
    private Map<Object, Object> map1 = new HashMap<>();

    public MapSynch(){
    }

    @Override
    public synchronized int size() {
        return map1.size();
    }

    @Override
    public synchronized boolean isEmpty() {
        return map1.isEmpty();
    }

    @Override
    public synchronized boolean containsKey(Object key) {
        return map1.containsKey(key);
    }

    @Override
    public synchronized boolean containsValue(Object value) {
        return map1.containsValue(value);
    }

    @Override
    public synchronized Object get(Object key) {
        return map1.get(key);
    }

    @Override
    public synchronized Object put(Object key, Object value) {
        return map1.put(key, value);
    }

    @Override
    public synchronized Object remove(Object key) {
        return map1.remove(key);
    }

    @Override
    public void putAll(Map m) {
        map1.putAll(m);
    }

    @Override
    public synchronized void clear() {
        map1.clear();
    }

    @Override
    public synchronized Set<Object> keySet() {
            return map1.keySet();
    }

    @Override
    public synchronized Collection<Object> values() {
        return map1.values();
    }

    @Override
    public synchronized Set<Entry<Object, Object>> entrySet() {
        return map1.entrySet();
    }
}
