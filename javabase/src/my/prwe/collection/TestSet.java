package my.prwe.collection;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
    public static void main(String[] args) {
        Set s = new HashSet();
        s.add("aa");
        s.add("bb");
        s.add("cc");
        s.add("dd");
        System.out.println(s);
    }
}
