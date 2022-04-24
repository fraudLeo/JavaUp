package Exception;

/**
 * 深入tryCatch:
 *   1. catch后面的小括号中的类型可以是具体的异常类型,也可以是该类型的父类型,但是不可以object
 *   2. 可以和ifelse一样写并列的很多层 一个一个精准处理 有利于程序的调式
 *   3. catch写多个对象的时候,从上到下,必须从小到大
 *   4. jdk8的新特性 :catch()里面可以写:  catch(FileNotFoundException | ArithmeticException | NullPointException e) 代表任意都会触发
 */
public class ExceptionTest05 {
    public static void main(String[] args) {
        try {
            m1();
        } catch (Exception e) {
            System.out.println("m1异常");
        }

    }

    private static void m1() throws Exception{
        m2();
        System.out.println("m1 begin");
    }

    private static void m2() throws Exception{
    }
}
