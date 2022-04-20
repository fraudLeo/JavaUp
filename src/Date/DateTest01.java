package Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        //获取系统当前时间
        Date date = new Date();
        System.out.println(date);
        //将日期按照指定格式转换 Date --转换成具有一定格式的日期字符串--String
        /*
        * yyyy  年
        * MM    月
        * dd    日
        * HH    时
        * mm    分
        * ss    秒
        * SSS   毫秒
        * */
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");
        String date_str = simpleDateFormat.format(date);
        System.out.println(date_str);

    }
}
