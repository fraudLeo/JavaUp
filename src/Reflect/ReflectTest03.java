package Reflect;

/**
 * 研究下 Clas.forName()方法到底发生了什么?
 * 重点:
 *  如果你只想出发一个类的静态代码块执行,其他代码一律不执行,
 *  你可以使用Class.forName()
 */
public class ReflectTest03 {
    public static void main(String[] args) throws Exception {
        //在执行forName()这个方法的时候,会触发静态代码执行,即触发类加载
        Class.forName("Reflect.MyClass");
    }
}

class MyClass {

    //static静态代码块在类加载时执行,并且只执行一次
    static {
        System.out.println("MyClass类的静态代码块执行了");
    }
}
