package Soundcode;

/**
 * 关于Object类中的toString()方法
 *      1. 源代码长啥样?
 *      public String toString() {
 *          return this.getClass().getName()+"@"+Integer.toHexString(hashCode());
 *      }
 *      源代码上的toString()方法的默认实现是:
 *          类名@对象的内存地址转换为十六进制的形式
 *
 *      2.SUN设计toString的目的是什么?
 *          toString()方法的作用是什么?
 *              toString方法的设计目的是: 通过调用这个方法可以将一个java对象转换成字符串形式
 *        SUN公司开发java语言的时候 建议所有子类都去重写toString()方法
 *        所以设想中的toString方法应该是一个简单详实的方法  重写的时候应该往易阅读方面发展
 */
public class toStringTest {

}
