package Final;

/**
 * final 所修饰的实例变量
 * final修饰的实例变量一般添加static 修饰
 * static final 合在一起修饰的变量称为常量,常量名建议全部大写,每个单词之间用下划线衔接
 *
 * 常量实际上和静态变量是一样的,区别在于常量的值不能变
 * 常量和静态变量,都是存储在方法去,并且都是在类加载的时候初始化
 */
public class FinalTest03 {
    public static void main(String[] args) {

    }
}

class Chinese {
    //身份证号 每个人都不一样 对象级别
    String idCard;
    //姓名,对象不同姓名不一样
    String name;
    //国家的只是一个固定值
    //实例变量在堆中储存,一个对象一份
    //实例变量既然使用final修饰,说明该实例变量值不会随着对象的变化而变化
    final String country = "中国";

    //i永远都是10,创建100个对象,i也是10
    //既然这样 没必要声明为实例变量,最好是静态的,节省内存
    final int i = 10;//每次new的时候都会重新开辟空间,里面都是重复的值
    static final int k = 20;//当这样的时候无论new了多少次,他都只会执行一次
}


class MyMath {
    //常量一般都是公开的,因为公开了也不怕
    public static final double PI = 3.1415926;
}

/**
 * 1.final关键字:
 *      1.1 final 修饰的类无法继承覆盖.
 *      1.2 final修饰的方法无法覆盖
 *      1.3 final修饰的变量只能赋一次值
 *      1.4 final修饰的引用一旦指向某个对象,就不能重新指向其他对象
 *      1.5 final修饰的实例变量必须手动初始化,不能采用系统默认值
 *      1.6 final修饰的实例变量一般和static联合使用,成为常量
 */