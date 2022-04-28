package List;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 关于collection接口中常用的方法
 *  1. Collection中能存放什么元素？
 *      没有使用“泛型”之前，Collection中可以存储Object中所有的子类型。
 *      使用了泛型之后，Collection中只能储存某个具体的类型
 *      集合后期学习泛型 目前只要是Object类型的子类型就行（集合中不能直接存储基本数据类型，也不能村java对象
 *      只有地址）
 *  2. Collection的常用方法
 *  boolean add（）
 *  void size()
 *  void clear()
 *  boolean contains()  比较的是内容
 *  void remove()
 *  boolean isEmpty()
 *  Iterator iterator() 通过这个方法获得迭代器
 *  Object[] toArray（）
 */
public class CollectionTest01 {
    public static void main(String[] args) {
        //创建一个集合对象,但因为接口是抽象的，集合对象是一个接口，所以需要他具体的实现类
        //父类型的引用指向子类型的引用
         Collection c = new ArrayList<>();
         c.add(1200);
    }
}
