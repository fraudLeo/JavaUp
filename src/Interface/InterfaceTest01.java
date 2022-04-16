package Interface;

/**
 * 接口
 *  1. 接口也是种数据引用类型   编译之后也是一个字节码文件
 *  2. 接口是完全抽象的.(抽象类是半抽象的.) 或者可以说接口是特殊的抽象类
 *  3. 接口怎么定义?
 *      [修饰符列表] interface 接口名 {
 *
 *      }
 *
 *      [修饰符列表] class 类名 {
 *
 *      }
 *
 *      [修饰符列表] abstract class 类名 {
 *
 *      }
 *   4. 接口支持多继承,一个接口可以继承多个接口
 *   5. 接口中只包含两部分内容 一部分是: 常量 一部分是抽象方法. 接口中没有其他内容了
 *   6. 接口中所有元素都是public修饰的,都是公开的
 *   7. 接口中的抽象方法大定义时,public abstract修饰符可以省略
 *   8. 接口中的方法都是抽象方法,所以接口中的方法不能有方法体
 *   9.接口中的public static final可以省略
 *   10. 接口中方法不能有方法体
 */
public class InterfaceTest01 {
    public static void main(String[] args) {

    }
}
// 定义接口 A
interface A {

}
//定义接口 B
interface B {

}
//定义接口 C 继承 A,支持多继承
interface C extends A,B {
}
interface MyMath {
    //接口里面都是抽象方法
    public abstract int sum(int a , int b );
    //接口当中既然都是抽象方法,那么在编写代码的时候   ,public abstract 可以省略吗?
    int sub(int a,int b);
    //常量可以省略public abstract final
    double PI = 3.1415926;
    //接口中的方法可以有方法体吗?
    //错误: 接口抽象方法不能带有主题


}