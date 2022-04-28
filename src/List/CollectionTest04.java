package List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 关于集合元素的remove
 * 在迭代集合元素的过程中，不能调用集合对象的remove方法删除元素
 * 因为这样改变了数据结构，然而在迭代的时候，不能改变数据结构，否则会报异常
 */
public class CollectionTest04 {
    public static void main(String[] args) {
        //创建集合
        Collection c = new ArrayList<>();
        /*为什么不把迭代器放在这里：
        *   因为此时获取的迭代器，指向的是集合中没有元素状态下的迭代器
        *   只要几何结构发生了变化，迭代器必须重新获取*/
        //Iterator it = c.iterator();
        //添加元素
        c.add(1);
        c.add(2);
        c.add(3);
        //获取迭代器，迭代器用来遍历集合，此时相当于对当前集合的状态拍了一个快照
        //迭代器迭代的时候会参照这个快照进行迭代
        Iterator it = c.iterator();
        Collection c2 = new ArrayList();
        c2.add("asd");
        c2.add("qwe");
        c2.add("zxc");

        Iterator it2 = c2.iterator();

        while(it2.hasNext()) {
            //编写代码时next()返回值类型必须是Object
            //Integer i = it.next();
            Object o = it2.next();
            //删除元素
            //删除元素之后，集合的数据结构发生了变化，应该重新去获取迭代器
            //但是 循环 下一次的时候并没有重新获取迭代器，所以会出现异常：java.util.ConcurrentModificationException
//            c2.remove(o);//直接通过集合删去元素，没有通知迭代器（导致迭代器的快照和原集合的状态不同）
            //迭代器去删除时，会自动更新迭代器，并且更新集合
            it2.remove();//删除的一定是迭代器指向的当前元素
            System.out.println(o);
        }
    }
}
