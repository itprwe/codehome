package my.prwe.commonclass;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestCalendar {
    public static void main(String[] args) {
        //获得日期
        Calendar c = new GregorianCalendar(2020,4,22,22,37,22);
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);
        int week = c.get(Calendar.DAY_OF_WEEK);
        System.out.println(year+" "+month+" "+day+" "+week);

        //设置日期
        Calendar c2 = new GregorianCalendar();
        c2.set(Calendar.YEAR,2222);
        System.out.println(c2);

        //日期计算
        Calendar c3 = new GregorianCalendar();
        c3.add(Calendar.DATE,100);
        System.out.println(c3);

        //日期对象和日历对象的转换
        Date d4 = c3.getTime();//日历转日期
        Calendar c4 = new GregorianCalendar();
        c4.setTime(new Date());//日期转日历

        printCalendar(c3);

    }

    public static void printCalendar(Calendar c){
        //打印：1111年11月11日 11:11:11 周一
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH)+1;
        int day = c.get(Calendar.DATE);
        int week = c.get(Calendar.DAY_OF_WEEK)-1;
        String dayWeek = week==0?"日":week+"";
        int hour = c.get(Calendar.HOUR);
        int minute = c.get(Calendar.MINUTE);
        int second = c.get(Calendar.SECOND);

        System.out.println(year+"年"+month+"月"+day+"日"+" "+hour+":"+minute+":"+second+" 周"+dayWeek);

    }
}
