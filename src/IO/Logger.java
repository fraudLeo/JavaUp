package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    日志工具:

 */
public class Logger {
    public static void main(String[] args) {
        //测试工具类是否好用
        Logger.log("调用了System类的gc()方法,减一启动垃圾回收器");
        Logger.log("调用了UserService的doSome()方法");
        Logger.log("用户尝试进行登录进行验证失败");
    }


    /**
     * 记录日志的方法
     * @param msg
     */
    public static void log(String msg) {
        try {
            //标准输出流指向一个日志文件
            PrintStream out = new PrintStream(new FileOutputStream("src/IO/FilePackage/log.txt",true));
            //改变输出方向
            System.setOut(out);
            //创建当前时间对象
            Date nowTime = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String format = sdf.format(nowTime);
            System.out.println(format);
            System.out.println(format+":"+msg);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
