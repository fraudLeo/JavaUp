package HashMap;

import java.util.TreeSet;

/**
 * 1. TreeSet底层是加上是一个TreeMap
 * 2. TreeMap集合底层是一个二叉树
 * 3. 放到TreeSet集合中的元素,等同于放到TreeMap集合的key部分了
 * 4. TreeSet集合中的元素:不可重复,但是可以按照元素的大小自动排序.
 *      称为可排序集合
 *
 */
public class TreeSetTest01 {
    public static void main(String[] args) {
        //创建一个TreeSet集合
        TreeSet<Object> ts = new TreeSet<>();
        //添加String
        ts.add("zhangsan");
        ts.add("lisi");
        ts.add("wangwu");
        ts.add("zhaoliu");
        for(Object obj:ts) {
            //按照字典升序
            System.out.println(obj);
        }

        TreeSet<Object> ts2 = new TreeSet<>();
        ts2.add(1100);
        ts2.add(2100);
        ts2.add(3010);
        ts2.add(1800);
        ts2.add(900);
        for (Object obj:ts2) {
            System.out.println(obj);
        }

    }
}
