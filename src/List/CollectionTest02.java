package List;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * 关于集合遍历、迭代
 *
 * contains方法是用来判断集合中是否包含某个元素的方法，那么他在底层是怎么判断
 * 集合中是否包含某个元素的呢？
 *  调用了equals方法进行比对 ，比较的是内容，
 */
public class CollectionTest02 {
    public static void main(String[] args) {
        //注意：一下讲解的遍历方式、迭代方式，是所有Collection通用的一种方式。
        //在Map集合中不能用，在所有的Collection以及子类中使用。
        //如果想一次性将想添加的所有元素add，可以先将想要添加的元素变成一个集合
        //创建集合对象
        Collection c = new HashSet();
        c.add("asd");
        c.add("asd");
        c.add("qwe");
        c.add("qwe");
        c.add("zxc");
        c.add("zxc");
        c.add("rty");
        c.add("rty");
        //对Collection进行迭代
        //第一步：获取集合对象的迭代器对象Iterator
        Iterator it = c.iterator();//底层调用了new Iterator()
        //通过以上获取的迭代器的对象开始迭代、遍历集合
        /*
        boolean hasNext() 如果人有元素可以迭代，则返回true
        Object next() 返回迭代的下一个元素
         */
        while(it.hasNext()) {
            System.out.println(it.next()); //乱序的
        }

    }
}
