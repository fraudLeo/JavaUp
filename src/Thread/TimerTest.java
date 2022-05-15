package Thread;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 使用定时器指定定时任务
 */
public class TimerTest {
    public static void main(String[] args) throws ParseException {
        //创建定时器对象
        Timer timer = new Timer();
//        Timer timer = new Timer(true);//守护线程的方式

        //指定定时任务
//        timer.schedule(定时任务,第一次执行的时间,间隔多久执行一次);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


            Date firstTime =  sdf.parse("2022-05-07 13:53:59");


        timer.schedule(new LogTimerTask(),firstTime,1000*5);
    }
}


class LogTimerTask extends TimerTask {
    @Override
    public void run() {
        //编写需要执行的任务
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String format = sdf.format(new Date());
        System.out.println(format+"完成了一次数据备份");
    }
}