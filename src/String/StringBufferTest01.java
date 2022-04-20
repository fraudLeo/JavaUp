package String;

/**
 * 思考: 我们在实际开发的时候,如果需要进行字符串的频繁凭借,会有什么问题?
 *      因为java中的字符串是不可变的,每一次拼接都会产生新的字符串
 *      这样会占用大量的的方法去内存,造成内存的空间浪费
 *      例如:
 *      String s = "asc";
 *      s+="hello";
 *      就以上两行代码,就导致在方法区字符串常量池中创建了三个对象
 */

/**
 * StringBuffer底层实际上是一个byte[]数组,初始容量为16
 * 往sb中放字符串实际上是往字节数组里面添加数据
 *
 *
 *
 * StringBuffer 和 StringBuilder 的区别:
 *   StringBuffer中的方法都有  synchronized  表示线程安全,说明在多线程情况下,是线程安全的,其他都是一样的
 */
public class StringBufferTest01 {
    public static void main(String[] args) {
        //创建一个初始化容量为16byte[] 的数组  (字符串缓冲区对象
        StringBuffer sb = new StringBuffer();
        //每次添加的时候都会进行扩容
        sb.append("a");
        sb.append("b");
        sb.append("c");

    }
}
