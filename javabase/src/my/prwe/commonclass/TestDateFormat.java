package my.prwe.commonclass;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateFormat {
    public static void main(String[] args) throws ParseException {
        //时间转为字符串，抽象类不能直接new通过实现类来new，
        // 且这里format方法不是抽象方法，且实现类没有覆盖，
        // 所以直接是调用父类方法format
        DateFormat d = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String str = d.format(new Date(4000000));
        System.out.println(str);

        //字符串转为date
        DateFormat dd = new SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒");
        Date date = dd.parse("2020年11月3日 12时33分21秒");
        System.out.println(date);

        //获得今天是今年的第多少天
        DateFormat ddd = new SimpleDateFormat("D");
        String sss = ddd.format(new Date());
        System.out.println(sss);
    }
}
