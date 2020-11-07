package my.prwe.collection;

import java.util.*;

public class TestIterator {
    public static void main(String[] args) {
        testIteratorList();
        testIteratorSet();
        testMap();
    }

    public static void testIteratorList() {
        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("dd");

        for (Iterator<String> it = list.iterator(); it.hasNext(); ) {
            String temp = it.next();
            System.out.println(temp);
        }
    }

    public static void testIteratorSet() {
        Set<String> set = new HashSet<>();
        set.add("aa");
        set.add("sdf");
        set.add("werw");

        for (Iterator<String> it = set.iterator(); it.hasNext(); ) {
            String next = it.next();
            System.out.println(next);
        }
    }

    public static void testMap(){
        Map<Integer,String> map = new HashMap<>();
        map.put(123,"qwer");
        map.put(234,"rtyu");
        map.put(345,"tyui");
        map.put(456,"asdf");

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for(Iterator<Map.Entry<Integer, String>> it = entries.iterator(); it.hasNext();){
            Map.Entry<Integer, String> next = it.next();
            System.out.println(next.getKey()+"====="+next.getValue());
        }

        Set<Integer> integers = map.keySet();
        for(Iterator<Integer> it = integers.iterator();it.hasNext();){
            Integer next = it.next();
            System.out.println(next+"---"+map.get(next));
        }


    }
}
