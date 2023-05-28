package Banking.Main_Operation;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class TwoKeyHashMap<K1, K2, V>{

    static class KeyPair<K1, K2>{
        private K1 key1;
        private K2 key2;

        public KeyPair(K1 key1, K2 key2){
            this.key1 = key1;
            this.key2 = key2;
        }
    }
    private Map<KeyPair<K1, K2>, V> map;

    public TwoKeyHashMap(){
        map = new HashMap<>();
    }

    public void put(K1 key1, K2 key2, V value){
        KeyPair<K1, K2> keyPair = new KeyPair<>(key1, key2);
        map.put(keyPair, value);

    }

    public V get(K1 key1, K2 key2, V value){
       KeyPair<K1, K2>keyPair = new KeyPair<>(key1, key2);
       return map.get(keyPair);
    }


    /*public boolean hashEquals(Object o){
        return;
    }
    public int newHashCode(){
        return;
    }*/
}

//TwoKeyHashMap<key1, key2, LinkedList<>> twoKeyHashMap = new TwoKeyHashMap<>();
// twoKeyHashMap.put(key1, key2, new LinkedList<>(List.of(values, values2)));

//retrieve
// LinkedList<String> valuesForKey1 = twoKeyHashMap.get(Key, subkey1)