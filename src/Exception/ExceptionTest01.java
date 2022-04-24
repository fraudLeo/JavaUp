package Exception;

/**
 * 什么是异常,异常机制有什么用?
 *  以下程序执行过程中发生了不正常的情况,所以叫做异常
 *  使用try catch 获取异常 对程序进行修改 更加健壮
 */
public class ExceptionTest01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = a/b;//JVM运行到这里的时候会new一个ArithmeticException的对象
        System.out.println(c);
    }
}
