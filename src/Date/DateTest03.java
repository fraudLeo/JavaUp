package Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest03 {

    public static void main(String[] args) {
        //这个获取的时间是什么?
        //时格林威治时间
        Date date = new Date(1);
        System.out.println(date);
        //当你进行了格式化之后,它会自动转到当前位置
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");
        String str_dateTime = simpleDateFormat.format(date);
        System.out.println(date);

        //获取昨天的此时的时间
        Date date1 = new Date(System.currentTimeMillis() - 1000 * 60 * 60 * 24);
        System.out.println(date1);
    }
}
