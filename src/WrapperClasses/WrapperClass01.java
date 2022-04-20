package WrapperClasses;




/**
 * 1. java中为8种基本数据类型有准备了八种包装类,8中包装类属于属于数据引用类型 父类是Object
 * 2. 思考: 为什么要再提供8种包装类?
 *
 */
public class WrapperClass01 {
    public static void main(String[] args) {
        //有没有这种需求: 调用doSome方法的时候需要穿一个数字近期
        //但是数字属于基本数字类型,而doSome方法参数的数据类型是Object
        //可见doSome方法是无法接受基本数据类型的,这时,就可以穿一个包装类了
        MyInt myInt = new MyInt(3);
        //可以穿一个对象进去 因为任何对象的父类都是Object
        doSome(myInt);
    }
    public static void doSome(Object obj) {
        System.out.println(obj);
    }
}
//包装类
class MyInt {
    int INT;

    public MyInt() {
    }

    public MyInt(int INT) {
        this.INT = INT;
    }

    public int getINT() {
        return INT;
    }

    public void setINT(int INT) {
        this.INT = INT;
    }

    @Override
    public String toString() {
        return String.valueOf(INT);
    }
}