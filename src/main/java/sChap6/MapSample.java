package sChap6;

import java.util.*;

public class MapSample {

    public static void main(String[] args) {
        MapSample sample = new MapSample();
//        sample.checkHashMap();
//
//        sample.checkHashMapEntry();

//        sample.checkTreeMap();

        sample.checkProperties();
    }

    private void checkProperties() {

        Properties prop = System.getProperties();
        Set<Object> keySet = prop.keySet();
        for (Object tempObject:keySet) {
            System.out.println(tempObject+"="+prop.get(tempObject));
        }

    }


    private void checkTreeMap() {
        TreeMap<String,String> map = new TreeMap<String, String>();
        map.put("A", "a");
        map.put("B", "b");
        map.put("c", "c");
        map.put("D", "d");
        map.put("1", "2");
        map.put("가","나다라");
        Set<Map.Entry<String,String>> entries = map.entrySet();
        for (Map.Entry<String,String> tempEntry:entries) {
            System.out.println(tempEntry.getKey()+"="+tempEntry.getValue());
        }
    }

    private void checkHashMapEntry() {

        HashMap<String, String> map = new HashMap<String, String>();
        map.put("A", "a");
        map.put("B", "b");
        map.put("C", "c");
        map.put("D", "d");
//        Set<Map.Entry<String,String>> entries = map.entrySet();
//        for(Map.Entry<String,String> tempEntry:entries) {
//            System.out.println(tempEntry.getKey() + "=" +tempEntry.getValue());
//        }
        System.out.println(map.containsKey("A"));
        System.out.println(map.containsKey("Z"));
        System.out.println(map.containsKey("a"));
        System.out.println(map.containsValue("c"));
    }

    private void checkHashMap() {

        HashMap<String, String> map = new HashMap<String, String>();
        map.put("A", "a");
        map.put("A", "1"); //<- 덮어 씌워짐 !

        map.put("C", "c");
        map.put("D","d");
        map.remove("A");
//        Set<String> keySet = map.keySet();
//        for(String tempKey : keySet) {
//            System.out.println("tempkey : "+map.get(tempKey));
//        }
        Collection<String> values = map.values();
        for(String tempValue : values) {
            System.out.println(tempValue);
        }
    }


}
