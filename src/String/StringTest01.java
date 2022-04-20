package String;
/**
 * 总结:
 * 1、面试题: String为什么是不可变的?
 * 我看过源代码，String类中有一个byte[ ]数组，这个byte[]数组采用了final修饰因为数组一旦创建长度不可变。
 * 并且披inal修饰的引用一旦指向某个对象之后，不可再指向其它对象，所以string是不可变的!
 * "abc”无法变成"abcd"
 * 2、StringBuiLder/ StringBuffer为什么是可变的呢?
 * 我看过源代码，StringBuffer/StringBuilder内部实际上是一个byte[]数组，
 * 这个byte[ ]数组没有被final修饰，StringBuffer/StringBuilder的初始化容量我记得应该是16，
 * 当存满之后会进行扩容，底层调用了数组拷贝的方法System. arraycopy()...是这样扩容的。
 * 所以stringBuilder/StringBuffer适合于使用字符串的频檠拼接操作。
 */



/**
 * 关于java内置的String类
 * String表示字符串类型,引用数据类型
 *  被双引号圈起来的就是String对象,例如 "STRING" 就是一个对象
 *      从创建开始到回收不可变   重新赋值的时候只是更改一下地址的位置,并没有更改对象本身
 *      在JDK当中双引号括起来的 字符串 都是 直接存储在 方法区的字符串常量池中(为什么呢?
 *          因为字符串在实际开发中使用的太频繁,为了执行效率,所以把字符串放到了常量池里面
 */
public class StringTest01 {
    public static void main(String[] args) {
        //这两行代码表示底层创建了3个字符串对象,都在字符串常量池中.
        String s1 = "asd";
        String s2 = "asd"+"xy";

        //分析: 这是使用new的方式创建的字符串对象 这个代码中的"xy"从哪里来?\
        //凡是双引号摞起来的都在字符串常量池中有一份
        String s3 = new String("xy");

        String a1 = "aaaa";
        String a2 = "aaaa";
        System.out.println(a1==a2);//true

        /*这里一共产生了三个对象:
        *   方法区常量池中有一个qwe
        *   b1,b2 又是两个String类型的对象*/
        String b1 = new String("qwe");
        String b2 = new String("qwe");
        System.out.println(b1==b2);//false

        //将数组转换成字符串
        char[] char_arr = {'我','是','中','国','人'};
        String s4 = new String(char_arr);
        System.out.println(s4);
        String s5 = new String(char_arr,2,3);
        System.out.println(s5);

    }

}
