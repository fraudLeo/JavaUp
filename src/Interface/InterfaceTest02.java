package Interface;

/**
 *接口基础语法:
 *  1. 类和类之间叫做继承,类和接口之间叫做实现
 *      别多想:你任然可以将实现看作继承
 *  2. 继承使用extends关键字
 *      实现使用implements
 *  3. 五颗星: 当一个非抽象类实现接口的话,必须将接口中所有的抽象方法 且方法权限重写的时候不能比重写前更低
 */
public class InterfaceTest02 {
    public static void main(String[] args) {

        //能使用多态吗?
        //接口是无法创建对象的,所以 new MyMath 是用不了的
        //面向接口编程
         MyMath myMath = new MyMathImpl();
         myMath.sub(1,2);//编译的时候 找的是接口里面的代码,运行的时候 就看底层对象 ,就是编译看前面  运行看后面
    }
}

//编写一个类,这个类非抽象
//名字是随意的
//前面添加abstract也是可以的,但是仅仅用于没有重写方法
//如果重写了方法就不应该加
class MyMathImpl implements MyMath{
    @Override
    public int sum(int a, int b) {
        return a+b;
    }

    @Override
    public int sub(int a, int b) {
        return a-b;
    }
}


//这里调用01里面的MyMath
//特殊的抽象类,完全抽象的,叫做接口
/*interface MyMath {
    double PI = 3.1415926;
    int sum
}*/
