package Abstract;
/**
 * 抽象类
 *  1. 抽象类中不一定由抽象方法,抽象方法必须出现在抽象类中
 *
 *  2. 重要结论:
 *      一个非抽象的类继承抽象类 不许将抽象类中的抽象方法实现了
 *
 *
 *      面试题:
 *          如果一个方法没有方法体,那这个方法就是抽象方法  ×
 *          会调用C++底层原理
 *          还有一个用native修饰的方法,表示调用JVM本地程序,
 */
public class AbstraTest02 {
    public static void main(String[] args) {
        //能不能使用多态?
        //父类型引用指向子类型
        Animal bird = new Bird();//面向抽象编程
        //像这样new了一个对象之后,调用的都是bird.XXXX
        //bird的类型 是Animal ,是抽象的
        //面向抽象编程,不要面向具体编程,降低程序耦合度,提高程序扩展都
        //这种编程思想符合ocp原则
        /*
            分析一下:
                编译的时候move()方法是谁的?
                运行的时候这个move()方法又是谁的
         */
        bird.move();

         Animal cat = new Cat();
         cat.move();
    }
}

//动物类
abstract class Animal {
    //抽象方法
    abstract public void move();
}

//子类 (非抽象类
class Bird extends Animal {

    @Override
    public void move() {
        System.out.println("鸟儿在飞翔!");
    }
}

class Cat extends Animal {
    @Override
    public void move() {
        System.out.println("猫在走路!");
    }
}