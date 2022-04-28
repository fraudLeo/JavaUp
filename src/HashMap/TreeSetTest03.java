package HashMap;

import java.util.Comparator;
import java.util.TreeSet;

/*
* TreeSet集合中元素可排序的第二种方式: 使用比较器
*
*   最终的结论:
*       放到TreeSet或者Key部分的元素想要做到排序 包括两种方法:
*           第一种: 放在集合中的元素实现Comparable接口
*           第二种: 在构造TreeSet或者TreeMap集合的时候给他们传一个比较器对象.
*
*   两种方法该如何选择呢?
*       但比较规则不会发生改变的时候,或者收单比较规则只有一个的时候,建议是想Comparable接口
*       如果比较规则有多个,并且需要多个比较规则之间频繁七日换,建议使用Comparator接口
* */
public class TreeSetTest03 {
    public static void main(String[] args) {
        //创建TreeSet集合的时候,需要使用这个比较器
        //TreeSet<Object> set = new TreeSet<>();//这样不行,没有通过构造方法传递一个比较起进去
        TreeSet<Animal> set = new TreeSet<>(new AnimalComparator());
        set.add(new Animal(1000));
        set.add(new Animal(20));
        set.add(new Animal(800));

        for (Animal s : set) {
            System.out.println(s);
        }
    }
}

class Animal {
    int age;

    public Animal(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                '}';
    }
}

//单独写一个比较器
//比较器实现Comparator接口(Comparable是lang包下的,Comparator是util包下的
class AnimalComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        //指定比较规则
        //按照年龄排序
        return o1.age-o2.age;
    }
}