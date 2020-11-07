package my.javabase.conclusion;

import java.util.*;

public class ForeachTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("123", "45634", "7892", "abch", "sdfhrthj", "mvkd");

        //stream lamda
        list.stream().forEach(e -> {
            if (e.length() >= 5) {
                return;
            }
            System.out.println(e);
        });

        //常规for
        for (String a : list) {
            if (a.length() >= 5) {
                continue;
            }
            System.out.println(a);
        }

        //iterator
        for (Iterator<String> iterator = list.iterator(); iterator.hasNext(); ) {
            String temp = iterator.next();
            System.out.println(temp);
        }

        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("a", 1);
        hashMap.put("b", 2);
        hashMap.put("c", 3);
        hashMap.put("d", 4);

        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + "_" + entry.getValue());
        }

        hashMap.forEach((x, y) -> System.out.println(x + "_" + y.intValue()));
        hashMap.forEach((k, v) -> System.out.println(k + "_" + v.intValue()));

    }
}
