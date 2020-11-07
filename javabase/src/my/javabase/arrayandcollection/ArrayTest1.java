package my.javabase.arrayandcollection;

public class ArrayTest1 {
    public static void main(String[] args) {
        //声明数组
        int[] array;

        //数组初始化
        int[] arr0 = new int[3];
        String[] strArr = new String[3];
        boolean[] booArr = new boolean[3];

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = new int[4];//常用
        arr2[0] = 1;
        arr2[1] = 2;
        arr2[2] = 3;
        arr2[3] = 4;
        int[] arr3 = new int[]{1, 2, 3, 4};

        System.out.println(arr1.length);
        System.out.println(arr2.length);
        System.out.println(arr3.length);

        //整数数组遍历
        int[] arr4 = new int[6];
        //初始化赋值
        for (int i = 0; i < arr4.length; i++) {
            arr4[i] = 100 * i;
        }
        //遍历取值
        for (int i = 0; i < arr4.length; i++) {
            System.out.println(arr4[i]);
        }

        //字符串数组遍历
        String[] strArr1 = {"aaa", "bbb", "ccc", "ddd", "eee"};
        for (String s : strArr1) {
            System.out.println(s);
        }

        //数组拷贝api
        String[] strArr2 = {"aaa", "bbb", "ccc", "ddd", "eee"};
        String[] strArr2Bak = new String[6];
        //将strArr2从第0个元素开始到strArr2.length长度个元素，
        // 赋值给strArr2Bak，且从strArr2Bak的第1个元素开始赋值
        System.arraycopy(strArr2, 0, strArr2Bak, 1, strArr2.length);
        for (int i = 0; i < strArr2Bak.length; i++) {
            System.out.print(strArr2Bak[i] + "\t");
        }
        System.out.println(strArr2Bak.length);
    }

}
