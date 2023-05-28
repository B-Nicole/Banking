package Banking;

import java.util.HashMap;
import java.util.Map;
import java.util.LinkedList;

public class TwoKeyHashMap<K1, K2, V>{
    private Map<K1, Map<K2, V>> hashmap;

    public TwoKeyHashMap(){
        hashmap = new HashMap<>();
    }

    public void put(K1 key1, K2 key2, V value){
        if(hashmap.containsKey(key1)){
            Map<K2, V> innerMap = hashmap.get(key1);
            innerMap.put(key2, value);
        }
        else{
            Map<K2, V> innerMap = new HashMap<>();
            innerMap.put(key2, value);
            hashmap.put(key1, innerMap);
        }
    }

    public V get(K1 key1, K2 key2, V value){

    }
}

