package Abstract;

/**
 * 类的对象实例化.对象到类是抽象
 * 抽象类:
 *      1. 什么是抽象类?
 *      类和类之间具有共同特征,将这些共同特征提取出来,形成的就是抽象类
 *      类本身是不存在的,所以抽象类无法创建对象
 *      2. 抽象类是属于什么类型?
 *          抽象类也属于引用数据类型
 *      3. 抽象类怎么定义
 *      语法:
 *          [修饰符列表] abstract class 类名 {
 *
 *          }
 *      4. 抽象类是无法实例化的,无法创建对象所以抽象类是用来被子类继承的
 *      5. 抽象类定义的时候无法添加final 因为final就是不会继承,二抽象类却又需要继承
 *      6. 抽象类虽然无法实例化,但是抽象类有构造方法,这个构造方法是供子类使用的
 *      7. 抽象类关联到一个概念: 抽象方法.什么是抽象方法?
 *              抽象方法表示没有实现的方法,没有方法体的方法
 *              public abstract void doSome();
 *              抽象方法的特点是:
 *                  1. 没有方法体 以分号结尾
 *                  2. 前面修饰符列表里面有abstract关键字
 *      8. 抽象类中不一定有抽象方法 但是抽象方法一定出现在抽象类中
 *          但是抽象方法或不抽象方法都可以在抽象类中.
 */
public class AbstractTest01 {
    public static void main(String[] args) {
        //错误:Account是抽象的,无法实例化
        //Account acc = new Account();
    }
}
//银行账户类
//
abstract class Account {
    public abstract void withdraw();

    public void doOther() {

    }
}
//子类继承抽象类,子类可以实例化对象
//抽象类的子类也可以是抽象类
class Credit extends Account {
    @Override
    public void withdraw() {

    }
}


