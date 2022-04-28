package Exception;

/**
 * 1. SUN提供的JDK内置一场坑定是不够用的,在实际的开发中,有恒多业务,这些业务在出现异常之后,JDK都是没有的 和业务挂钩
 *      那么我们可以自己定义异常类吗?
 *          可以
 *  2. Java中国你怎么定义异常呢?
 *      两步:
 *          第一步: 编写一个类继承Exception或者RuntimeException.
 *          第二步:
 */
public class MyExceptionTest01 extends Exception{
    public MyExceptionTest01() {

    }
    public MyExceptionTest01(String s) {
        super(s);//调用父类方法
    }
}
