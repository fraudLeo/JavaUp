package Soundcode;

/**
 * hashCode方法:
 *  在Object中的hashCode方法是什么样子的?
 *      public native int hashCode();
 *      这个方法不是抽象方法,带有native关键字,底层调用c++程序
 *
 *  hashCode方法返回的是哈希码:
 *      实际上就是一个java对象的内存地址.经过哈希算法,得出的一个值
 *      所以hashCode()方法的执行结构可以等同看作一个java对象的内存地址.
 *
 */
public class hashCodeTest {
    public static void main(String[] args) {
        Object o = new Object();
        int hashCodeValue = o.hashCode();

        //对象内存地址经过hash算法转换的一个数字,可以等同看作内存地址
        System.out.println(hashCodeValue);

        Myclass myclass = new Myclass();
        int myclassHashCode = myclass.hashCode();
        System.out.println(myclassHashCode);
    }
}
class Myclass {

}