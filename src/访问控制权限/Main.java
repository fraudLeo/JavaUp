package 访问控制权限;

/**
 * 1. 访问控制权限
 *      1.1 访问控制权限有哪些?
 *          4个
 *              private
 *              protected
 *              public
 *              (默认)
 *      1.2  以上的四个访问控制权限:控制的范围是什么?
 *          private  表示私有 只能在本类中访问
 *          public 表示公开的 任何位置都可以访问
 *          protected 表示只能在本类,同包,子类中访问
 *          默认 表示只能在奔雷以及同包下访问
 *
 *          访问控制修饰符         本类      同包      子类      任意位置
 *          --------------------------------------------------------
 *          public              可以      可以      可以      可以
 *          protected           可以      可以      可以      不可以
 *          private             可以      不可以     不可以     不可以
 *          默认                 可以      可以       不可以     不可以
 *
 * 类名不可以用protected,private 但是可以用 public 和 不写  但是使用场景不一样
 *
 */
public class Main {
    public static void main(String[] args) {
        User user = new User();
        //错误 :protected
        System.out.println(user.age);
        //错误 :默认
        System.out.println(user.name);
        //可以 :public
        System.out.println(user.weight);
        //访问不了 因为私有
        //System.out.println(user.id);
    }
}

class User {
    //私有的
    private int id;
    //受保护的
    protected int age;
    //公开的
    public int weight;
    //什么也没有
    String name;
}
