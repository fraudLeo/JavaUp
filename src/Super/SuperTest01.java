package Super;

/**
 * 1. super是一个关键字 全部小写
 * 2. super 和 this对比着学
 *      this:
 *          this能出现在实例方法和构造方法中
 *          this的语法是:"this."/"this()"
 *          this不能使用在静态方法中
 *          this.大部分情况下是可以省略的
 *          在区分局部变量和实例变量的时候不能省略
 *          this()只能出现在构造方法的第一行,通过当前的构造方法去调用 本类
 *          中其他的构造目的是为了代码复用
 *    super 和 this差不多,除了
 *          1. 什么时候不能省略?
 *              如果父类和子类有同名属性,并且想要通过子类访问父类属性,则不能省略
 *          2.super() 只能出现在构造方法的第一行,通过当前的构造方法去调用那个 父类当中
 *          的构造方法,目的是创建子类对象的时候先初始化父类特征
 *
 *  3. super()
 *      表示通过子类的构造方法调用父亲的构造方法
 *      模拟现实世界的这种场景: 想要有儿子就需要现有父亲
 *  4.重要的结论:
 *      当一个构造方法第一行:
 *          既没有this(),又没有super()的时候,就会默认有一个super
 *          这个时候会调用弗雷德构造方法,所以必须保证弗雷德无参构造函数方法是存在的
 *
 */
public class SuperTest01 {

    public static void main(String[] args) {
        //床架子类对象
        /**
         * @output
         * A类的无参数构造方法!
         * B类的无参数构造方法!
         */
        new B();
    }


}

class A{
    public A(){
        System.out.println("A类的无参数构造方法!");
    }
}

class B extends A {
    public B() {
        System.out.println("B类的无参数构造方法!");
    }
}
