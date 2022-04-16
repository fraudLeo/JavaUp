package Interface;

/**
 * 继承和实现都存在的话代码应该怎么写?
 *  extends在前
 *  implements在后
 *
 *  接口在开发中的作用:
 *      接口在开发中的作用,类似于多态在开发中的作用
 *      多态: 面向抽象编程,不要面向具体编程.降低程序的耦合度,提高程序的扩展力
 *      public class Master{
 *          public void feed(Dog d) {}
 *          public void feed(Cat c) {}
 *          //假设要养其他宠物,那么这个时候需要再加一个方法.需要修改代码
 *          //这样扩展力太差,违背了OCP原则(对扩展开放,对修改关闭.)
 *      }
 *
 *      public class Master {
 *          public void feed(Animal a) {
 *              //面对Animal 父类编程 父类是比子类更加抽象的
 *              //所以我们叫做面向抽象编程,不要面向具体编程
 *              //这样程序的扩展里就强.
 *          }
 *      }
 *
 *      接口在开发中的作用:
 *          接口是不是完全抽象的?     是
 *          而我们以后正好要求,面向抽象编程
 *          面向抽象编程这句话以后可以修改为面向接口编程.
 *          这样的扩展力很强(低耦合)
 *
 *
 *
 */
public class InterfaceTest04 {
    public static void main(String[] args) {
        //创建对象(表面看Animal类没起作用!)
        Flyable f = new Cat();//多态.
        f.fly();
        Flyable p = new Pig();
        p.fly();
    }
}

//父类动 物类
class Animal {

}

//可飞翔的接口
//能查把的就是接口
//接口通常模拟的是行为动作
interface Flyable {
    void fly();
}

//动物类子类: 猫类
//Flyable 是一个接口 是一对翅膀 通过接口插到猫身上,让猫可以变得飞翔
class Cat extends Animal implements Flyable{
    public void fly() {
        System.out.println("肥猫起飞,翱翔太空的一只猫,很神奇!");
    }
}

//蛇类,如果你不想让它飞可以不事先Flyable接口
class Snake extends Animal {

}

//猪类
class Pig extends Animal implements Flyable {
    public void fly() {
        System.out.println("我是一只会飞的猪!");
    }
}

//鱼类 没写继承默认继承Object类
class Fish implements Flyable {
    @Override
    public void fly() {
        System.out.println("我是流言蜚语!");
    }
}