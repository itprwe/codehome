package my.prwe.array;

import java.util.Arrays;

public class TestBubbleSort {
    public static void main(String[] args) {
        int[] values = {12,3,4,2,7,5,9,1,8};
        int temp = 0;
        for (int j= 0; j < values.length-1 ; j++) {
            for (int i = 0; i <values.length-1-j ; i++) {
                if(values[i]>values[i+1]){
                    temp = values[i];
                    values[i] = values[i+1];
                    values[i+1] = temp;
                }

                System.out.println(Arrays.toString(values));

            }
        }

    }
}
