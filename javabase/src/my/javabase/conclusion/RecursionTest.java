package my.javabase.conclusion;

public class RecursionTest {
    public static void main(String[] args) {

        System.out.println(digui(5));
    }

    //借助2号杆将1号杆上的珠子移动到3号杆，不改变珠子的上下顺序，最多移动几次
    //每次只能移动一个珠子
    //大珠子不能放在小珠子上面
    public static int digui(int n) {
        if (1 == n) {
            return 1;
        } else {
            return n * digui(n - 1);
        }
    }
}
