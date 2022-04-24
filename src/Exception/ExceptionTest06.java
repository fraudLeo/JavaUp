package Exception;

/**
 * 异常对象有两个非常重要的方法
 *      获取一场简单的描述信息
 *       String msg = exception.getMessage();
 *      打印一场追踪的堆栈信息:
 *       exception.printStackTrance();
 *
 *
 * 异常的好处是捕捉了之后程序不会停,而会继续执行程序,参考百度服务器,所以程序很健壮
 *
 */
public class ExceptionTest06 {
    public static void main(String[] args) {
        //这里只是为了测试getMessage() 方法和printStackTrance() 方法
        //这里只是new了异常对象,但并未抛出 JVM认为这只是一个普通的对象,这里并不是异常,而是new了对象
        NullPointerException nullPointerException = new NullPointerException("空指针异常");

        //获取异常简单描述信息:这个信息实际上就是构造方法上面的String参数
        String msg = nullPointerException.getMessage();//空指针异常
        System.out.println(msg);

        //打印异常堆栈信息
        //这个是异步信息,会在不同线程里面执行
        nullPointerException.printStackTrace();

        System.out.println("hello world");
    }
}
