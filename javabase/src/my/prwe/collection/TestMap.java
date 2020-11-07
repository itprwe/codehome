package my.prwe.collection;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        Map<Integer,String> m = new HashMap<>();
        m.put(1,"prwe");
        m.put(2,"haha");
        m.put(3,"gaga");

        String d = m.get(2);
        System.out.println(d);
        System.out.println(m.size());
        System.out.println(m.isEmpty());
        System.out.println(m.containsKey(2));
        System.out.println(m.containsValue("prwe"));
    }
}
