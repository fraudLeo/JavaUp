package Reflect;

/**
 * 可变长度参数
 *  int... args 就是可变长参数
 *  语法是:类型... (注意:一代那个是三个点)
 *
 *  1. 可变长度参数要求的参数个数是0-N个
 *  2. 可变长度参数在参数列表中必须在最后一个位置上,而且可变长度参数只能有一个
 *  3. 可变长度参数可以看作一个数组来看待
 *  4. 也可以直接传一个数组进去
 *
 */
public class ArgsTest {
    public static void main(String[] args) {
        //都是可以执行的.
        m();
        m(10);
        m(10,20,30);

        m3("asd");
        m3("asd","qwe");
        m3("asd","zxc","cvb");
    }
    public static void m(int... args) {
        System.out.println("m方法执行了");
        System.out.println(args);
    }
    //Vararg parameter must be the last in the list
//    public static void m2(/*String... args1*/,int... args2) {
//
//    }
    public static void m3(String... args) {
        for (String s:
             args) {
            System.out.println(s);
        }
    }


}
