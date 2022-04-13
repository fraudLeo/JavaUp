package Final;

/*
* final:
*   1. final 是java语言中的一个关键字
*   2. final 是表示最终的,不可变的
*   3. final 可以修饰变量以及方法 还有类
*               不可被重写或者覆盖
*   4. final可以修饰的类
*               final修饰的类无法继承
*   5. final控制不了能不能调用的问题 final管的是
*       表示最后后不能变,不能改
* */
public class FinalTest01 {
    public static void main(String[] args) {
        //局部变量
        int i = 100;
        //重新赋值
        i = 200;

        final int k = 200;
//        k = 2;//会报错
    }
}

/*final*/ class A{
    public /*final*/ void doSome() {
        System.out.println("s");
    }
}

//B类继承A类 相当于对A类的功能进行扩展 如果你不希望别人对A类型进行扩展
//就可以给A类加final关键字 这样就无法继承了
class B extends A {
    //如果方法被添加final 方法也就不能覆盖了
    public void doSome() {
        System.out.println("asd");
    }
}