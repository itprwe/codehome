package my.prwe;

//2
public class Circle {

    public static void main(String[] args) {
        //打印出
        //123
        //123
        //123
        for (int j = 1; j <=5 ; j++) {
            for (int i = 1; i <=5 ; i++) {
                System.out.print(i+"\t");
            }
            System.out.println();
        }
        //打印出乘法表
        for (int m = 1; m <=9 ; m++) {
            for (int n = 1; n <=m ; n++) {
                System.out.print(m+"*"+n+"="+m*n+"  ");
            }
            System.out.println();
        }
    }
}
