package AnnoymousInnerClass;

/**
 * 匿名内部类:
 *  1. 什么是内部类?
 *      内部类:在类的内部有定义了一个新的类,被称为内部类.
 *  2. 内部类的分类:
 *      静态内部类:类似静态变量
 *      实例内部类:类似实例变量
 *      局部内部类:类似局部变量
 *  3. 匿名内部类术语局部便来那个
 */
public class AnnoymousInnerClass {
    //该类在类的内部,所以称为内部类
    //静态内部类,因为加了static
    static class Inner1 {

    }
    //该类在类的内部,所以称为内部类
    //实例内部类
    class Inner2 {

    }
    public void doSome() {
        //该类在类的内部,所以称为内部类
        //局部内部类
        class Inner3 {

        }
    }

    public static void main(String[] args) {
        //调用MyMath
        MyMath myMath = new MyMath();
        //正常
        myMath.sum( new CalculateImpl(),100,200);
        //匿名内部类
        myMath.sum(new Calculate() {
            @Override
            public int sum(int a, int b) {
                return a+b;
            }
        },100,200);
    }
}

//负责计算的接口
interface Calculate {
    //抽象方法
    int sum(int a,int b);
}

//数学类
class MyMath {
    //数学球和方法
    public void sum(Calculate c,int x,int y) {
        int res = c.sum(x,y);
        System.out.printf("%d+%d=%d\n",x,y,res);
    }
}
//Calculate 的实现类
class CalculateImpl implements Calculate {
    //对方法的实现
    public int sum(int x,int y) {
        return x+y;
    }
}
