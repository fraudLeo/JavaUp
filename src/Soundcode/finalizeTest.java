package Soundcode;
//@废弃(since 9)
/**
 * 关于Object类中的finalize()的方法
 *  1. 在Object类中的源代码:
 *      protected void finalize() throws Throwable {}
 *      GC来进行调用
 *  2. finalize() 方法只有一个方法体,里面没有代码,而且这个方法是protected修饰的
 *  3. 这个方法不需要程序员手动调用,JVM的垃圾回收器负责调用这个方法
 *  4. 执行时机:
 *      当一个java对象即将被垃圾回收器回收的时候,垃圾回收器负责调用finalize()方法.
 *  5. 这个方法实际上是SUN公司为程序员准备的一个时机,垃圾销毁时机.
 *      如果希望在对象销毁的实际执行与段代码的话,这段代码要写到finalize()里面
 *  6. 类似于static()静态代码块
 */
public class finalizeTest {
    public static void main(String[] args) {
        //创建对象
        Person person = new Person();
        //怎么把Person变为垃圾?
        person = null;
    }
}

class Person {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("即将被销毁!");
    }
}
