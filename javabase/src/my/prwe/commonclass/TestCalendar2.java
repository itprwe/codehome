package my.prwe.commonclass;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class TestCalendar2 {
    public static void main(String[] args) throws ParseException {

        System.out.println("请输入日期（格式是2222-11-22）:");
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
//        String str = "2222-11-22";
        DateFormat d = new SimpleDateFormat("yyyy-MM-dd");
        Date date = d.parse(str);

        Calendar c = new GregorianCalendar();
        c.setTime(date);//转为日历对象

        System.out.println("日\t一\t二\t三\t四\t五\t六");

        int now = c.get(Calendar.DAY_OF_MONTH);
        int maxDay = c.getActualMaximum(Calendar.DATE);

        c.set(Calendar.DATE,1);
        for (int i = 0; i <c.get(Calendar.DAY_OF_WEEK)-1 ; i++) {
            System.out.print("\t");

        }


        for (int i = 1; i <=maxDay ; i++) {

            if(now==c.get(Calendar.DAY_OF_MONTH)){
                System.out.print(c.get(Calendar.DATE)+"*\t");
            }else {
                System.out.print(c.get(Calendar.DATE)+"\t");
            }

            if(c.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY){
                System.out.println();
            }
            c.add(Calendar.DATE,1);


        }


    }
}
