package com.yousaf.Generics;
import java.util.*;

public class KeyValuePair<K,V> {

        //Dictionary in java
        private Dictionary dictionary = new Hashtable();
        private K key;
        private V value;

        //Adding element in dictionary
        public void add_element(K key,V value){
            this.key = key;
            this.value = value;
            dictionary.put(key,value);
        }
        //Getting value by key in dictionary
    public V getElement(K key){
            value = (V) dictionary.get(key);
            return value;
    }
    public void remove_element(K key){
            dictionary.remove(key);
            System.out.println("Element is successfully deleted");
    }
}
