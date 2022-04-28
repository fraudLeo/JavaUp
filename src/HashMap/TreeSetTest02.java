package HashMap;

import java.util.TreeSet;

/**
 * 对自定义的类型来说,TreSet可以排序吗?
 *      下面的程序对于Person来说 无法排序,因为没有指定Person对象之间的比较规则(修改前
 *      谁打谁小并没有说明
 */
//public class TreeSetTest02 {
//    public static void main(String[] args) {
//        Person p1 = new Person(23);
//        Person p2 = new Person(9);
//        Person p3 = new Person(100);
//        Person p4 = new Person(1);
//
//        TreeSet<Person> ts = new TreeSet<>();
//        ts.add(p1);
//        ts.add(p2);
//        ts.add(p3);
//        ts.add(p4);
//
//        for (Person p : ts) {
//            System.out.println(p);
//        }
//
//    }
//}
//
//class Person {
//    int age;
//    public Person(int age) {
//        this.age = age;
//    }
//
//    @Override
//    public String toString() {
//        return "Person{" +
//                "age=" + age +
//                '}';
//    }
//}
//
//对下面程序进行修改
public class TreeSetTest02 {
    public static void main(String[] args) {
        Person p1 = new Person(23);
        Person p2 = new Person(9);
        Person p3 = new Person(100);
        Person p4 = new Person(1);

        TreeSet<Person> ts = new TreeSet<>();
        ts.add(p1);
        ts.add(p2);
        ts.add(p3);
        ts.add(p4);

        for (Person p : ts) {
            System.out.println(p);
        }

    }
}

class Person implements Comparable<Person>{
    int age;
    public Person(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }

    //需要在这个方法中编写比较逻辑,或者说比较规则,按照什么进行比较 !
    //k.compareTo(t.key)
    //拿着参数k和集合中每一个k进行比较,返回值可能是>0 <0 =0
    //最终规则还是我们来指定
    @Override
    public int compareTo(Person o) {//o1.compareTo(o2)

        //this是o1
        //o是o2
        //o1 ,o2比较的时候,就是this和o比较
        int age1 = this.age;
        int age2 = o.age;
        if (age1 ==age2) {
            return 0;
        } else if(age1 > age2) {
            return 1;
        } else {
            return -1;
        }
    }
}

