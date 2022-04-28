package List;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * 链表的优点：
 *      由于链表上的元素在空间储存上内存地址不连续
 *      所以随即增删元素的时候就不会有大量的元素位移，因此随机增删效率高
 *      在以后的开发中，如果遇到随即增删集合中元素的业务较多时没建议使用LInkedList
 *
 * 链表的缺点：
 *      不能通过数学表达式计算被查找元素的内存地址，每一次查找都是从头结点开始遍历啊，直到找到位置，所以LinkedList集合检索、查找效率较低
 *      Array'List
 *
 */
public class LinkedListTest01 {
    public static void main(String[] args) {
        //LinkedList集合底层也是有下标的。
        //注意：ArrayList之所以检索效率比较高，不是单纯因为下标的原因，是因为底层数组发挥的作用
        //LinkedList集合照样有下标，但是检索/查找某个元素的时候效率较低，因为只能从头节点开始
        List list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //LinkedList集合中有初始化容量吗? 没有
        //最初这个链表没有任何元素
        //不管我们是LinkedList还是ArrayList,以后写代码时不需要具体关心是那个集合
        //因为我们要面向接口编程 调用的方法都是接口中的方法
        //如何变成线程安全的?
        Collections.synchronizedList(list);//变成了线程安全的了
    }
}
