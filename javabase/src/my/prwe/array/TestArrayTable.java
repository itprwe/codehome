package my.prwe.array;

import java.util.Arrays;

public class TestArrayTable {
    public static void main(String[] args) {
        Object[] emp1 = {1001,"itprwe",11,"篮球","2020.4.6"};
        Object[] emp2 = {1002,"hahaitprwe",31,"足球","2020.4.8"};
        Object[] emp3 = {1003,"istprwe",15,"排球","2020.5.6"};

        Object[][] tableData = new Object[3][];
        tableData[0] = emp1;
        tableData[1] = emp2;
        tableData[2] = emp3;

        for (Object[] o:tableData){
            System.out.println(Arrays.toString(o));
        }
    }
}
