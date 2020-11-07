package my.prwe.array;

import java.util.Arrays;

public class TestBinarySearch {
    public static void main(String[] args) {
        int[] arr ={30,20,50,10,80,9,7,12,100,40,8};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int t = myBinarySearch(50,arr);
        System.out.println(t);

    }

    public static int myBinarySearch(int val,int[] arr){
        int low = 0;
        int high = arr.length-1;

        while (low<=high){
            int mid = (low+high)/2;

            if (val == arr[mid]){
                return mid;
            }
            if(val<arr[mid]){
                high = mid-1;
            }
            if(val >arr[mid]){
                low = mid+1;
            }

        }
        return -1;
    }
}
