package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 关于try catch中的finally子句
 *      1. 在finally子句中的代码是最后执行的,比国内且是一定会执行的 即使try语句块中的代码出现了异常
 *      finally字句必须和try一起写 不能单独编写  在没有catch的情况下,只写try和finally也是可以的
 *      2.finally语句通常在哪些情况下使用呢?
 *
 */
public class ExceptionTest07 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            //创建输入流对象
            fis = new FileInputStream("E:\\JavaUp\\src\\Exception\\ExceptionTest07.java");
            //......

            String s =null;
            //这里一定会出现空指针异常
            s.toString();//倘若注释掉这里,hello world就不会再出现
            System.out.println("hello world!");

            //流使用完需要关闭,因为流是占用资源的
            //即使一场程序出现异常,流必须关闭
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } finally {
            System.out.println("hello kitty");
            //流的关闭放在这里比较保险
            //finally中的代码是一定会在这里执行的
            if (fis!=null) {//避免空指针异常
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
