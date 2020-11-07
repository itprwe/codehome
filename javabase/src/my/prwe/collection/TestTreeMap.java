package my.prwe.collection;

import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {
    public static void main(String[] args) {
        Map<Integer,String> treeMap1 = new TreeMap<>();
        treeMap1.put(11,"prwe");
        treeMap1.put(4,"gaga");
        treeMap1.put(5,"haha");
        treeMap1.put(6,"haha");

        for(Integer key:treeMap1.keySet()){
            System.out.println(key+"==="+treeMap1.get(key));
        }
    }
}
