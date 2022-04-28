package Generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * JDK5.0之后推出的新特性:泛型
 * 放心这种语法机制,只在程序编译阶段起作用,只是给编译器参考的(运行阶段 泛型没用!)
 * 使用了泛型有什么好处?
 *      1. 集合中存储的元素类型统一了
 *      2. 从集合中去除的元素类型是指定的类型,不需要进行大量的"向下转型"
 *  放心的缺点是什么?
 *      1. 导致集合中的元素缺乏多样性
 *      2. 大多数业务中,集合中的元素类型都是统一的,所以泛型的用处还是挺多的
 *
 */
public class GenericTest01 {
    public static void main(String[] args) {
        //不使用泛型,分析程序执行存在的缺点
        List myList = new ArrayList<>();
        //准备对象
        Cat c = new Cat();
        Bird b = new Bird();
        myList.add(c);
        myList.add(b);

        //遍历集合,取出Cat让他抓老鼠,取出Bird让他飞
        Iterator it = myList.iterator();
        while(it.hasNext()) {
            Object obj = it.next();
            if (obj instanceof Cat) {
                ((Cat) obj).catchMouse();
            }
            if (obj instanceof Bird) {
                ((Bird) obj).fly();
            }
        }
        //使用泛型之后,表示List集合中只允许存储Animal类型的数据
        //用泛型来指定集合中储存的数据类型吗,指定list集合中只能储存Animal,储存String或者其他就编译报错了
        //泛型能够减少向下转型的写入
        System.out.println("=========使用泛型=========");
        List<Animal> myList2 = new ArrayList<Animal>();
        myList2.add(c);
        myList2.add(b);
        Iterator it2 = myList2.iterator();
        while(it2.hasNext()) {
            //这里就可以直接获取了
            Animal a = (Animal) it2.next();
            a.move();

        }


    }
}

class Animal {
    public void move() {
        System.out.println("动物在移动");
    }

}

class Cat extends Animal {
    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }
}

class Bird extends Animal {
    public void fly() {
        System.out.println("鸟儿在飞翔");
    }
}