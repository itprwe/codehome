package my.prwe.commonclass;

import java.util.Random;

public class TestMath {
    public static void main(String[] args) {
        System.out.println(Math.random());
        Random r = new Random();
        System.out.println(r.nextInt(10));
    }
}
