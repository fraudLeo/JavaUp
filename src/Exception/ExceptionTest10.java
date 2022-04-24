package Exception;

/**
 * final finally finalize 有什么区别
 */
public class ExceptionTest10 {
    public static void main(String[] args) {
        //finally 是一个关键字 表示最终的不变的
        final int i = 100;
        //i = 200//改不了

        //finally也是一个关键字,和try联合使用,使用在异常处理机制中
        //finally语句块中的代吗是一定会执行的
        try {
            System.out.println("try...");
        } finally {
            System.out.println("finally...");
        }

        //finalize()是object类中的一个方法.作为方法名出现
        //所以finalize是标识符//而且since9已过时
        //是垃圾回收器进行调用
        Object obj;
    }
}
