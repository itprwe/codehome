package my.prwe.array;

public class TestArrayCopy {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10};
        System.arraycopy(arr1,2,arr2,0,3);
        for (int a:arr2){

            System.out.println(a);
        }
    }
}
