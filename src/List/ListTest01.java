package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 集合当中给你不能直接存储基本数据类型，也不能直接存储java对象，集合当中存储的都是java对象的内存地址，
 * 或者可以说，集合中储存的是引用
 * list.add(100) 会自动装箱
 * 注意：
 *   集合在java中本身就是一个容器，是一个对象
 *   集合中任何时候存储的都是“引用”
 *
 *
 * 在java中，每一个不同的集合，底层都会对应不同的数据结构，往不同的集合中存储元素 等于将数据放到了不同的数据结构当中。
 *  ArrayList：：底层是数组
 *  LinkedList：底层是链表
 *  TreeSet： 底层是二叉树
 *  集合都集成在util.*包下
 *
 *  背出集合的继承结构图
 *
 *
 *   在java中集合分为两大类：
 *   一个是以单个方式存储元素
 *      这一类集合中的超级父接口是java.util.Collection
 *   另一个是以键值对的方式储存
 *      以键值对的方式存储元素，超级父类是java.util.Map
 *
 *
 *      Map：
 *          1. Map集合和Collection集合没有关系。
 *          2. Map集合以Key和Value这种键值对的方式存储元素
 *          3. Key和Value都是存储java对象的内存地址
 *          4. 所有Map集合的key特点：无需不可重复的
 *          5. Map集合的key和Set
 *        Map里面有两个实现类：
 *          HashMap 和 Hashtable  前者是非线程安全  后者是线程安全的
 *          HashMap底层是哈希表数据结构，
 *          Hashtable底层也是哈希表，其中所有的方法都带有synchronized关键字，效率极低，现在使用较少了，因为控制线程安全有其他更好的方案
 *              里面有一个Properties子类，是线程安全的 因为继承Hashtable另外Properties存储元素的时候也是采用的key和value的形式存储，并且key
 *              和value支支持String类型，不支持其他类型
 *          Map里面还有一个接口：SortedMap 里面还有个实现类：TreeMap 底层数据结构是一个二叉树
 *              这里面存储数据的结构：
 *                  无需不可重复，在SortedMap集合Key部分的元素会自动按照大小顺序排序，称为可排序的集合
 *
 *      List集合存储元素的特点：
 *          有序可重复 储存的元素有下表 有序实际上是说存进去是这个顺序，取出来还是这个顺序
 *          ，并不是指大小顺序
 *      Set集合存储元素特点：无序不可重复。
 *          无需表示存进去的是这个顺序 取出来就不一定是这个顺序了，另外set集合中元素没有下表，
 *          Set集合中的元素还不能重复
 *
 *      List的实现类：
 *          ArrayList  数组   非线程安全
 *          LinkedList  双向链表
 *          Vector      数组 线程安全 但是效率较低 现在保证线程安全有其他的方法，所以Vector很少用
 *
 *
 *     Set的实现类
 *          HashSet   new的时候实际上底层是new了一个HashMap集合象HashSet存储数据实际上是往HashMap存储
 *                      是一个哈希表数据结构
 *
 *          SotredSet
 *              由于继承了Set，所以她也是无序不可重复，但是放在SrotedSet集合中的元素可以自动排序，我们称之为可排序集合
 *
 *              TreeSet是他的实现类 底层实际上是一个TreeMap
 *              所以new TreeSet集合的时候 底层实际上new了一个TreeMap集合 往TreeSet集合中放数据的时候实际上是将数据放到了Tree Map中了
 *
 *
 *    总结：（所有的实现类）
 *    Arraylist: 底层是数组
 *    LinkedList: 底层是双向链表
 *    Vector: 底层是数组 线程安全的 效率较低 使用较少
 *    HashSet:底层是HashMap 放到Hash Set集合中的元素等同于放到HashMap 集合key部分
 *    TreeSet: 底层是TreeMap 放到TreeSet集合中的元素等同于放到TreeMap集合key部分了
 *    HashMap: 底层是hash表
 *    Hashtable: 底层是hash表 只不过线程安全 效率低
 *    Properties:线程安全的 key和value只能存储字符串String
 *    TreeMap: 底层是二叉树 TreeMap集合的key可以自动按照大小自动排序
 *
 *
 * List集合存储元素的特点：
 *  有序可重复
 *  有序： 存进去的顺序和取出来的顺序相同，每一个元素都有下标。
 *  可重复：存进去1，可以再存储一个1.
 *
 * Set集合存储数据的特点：
 *  无序不可重复
 *  无需：存进去的顺序和去除的顺序不一定相同，另外Set集合中元素没有下标。
 *  不可重复：存进去1，不能再存储1了
 *
 * SortedSet集合存储元素的特点：
 *  首先是无序不可重复的，但是SortedSet集合中的元素是可排序的
 *  无需：存进去的顺序和取出的顺序不一定相同，另外Set集合中元素没有下表
 *  不可重复：存进去1，不能在存储1了。
 *  可排序：可以按照大小顺序排序
 *
 *
 *  Map集合的key，就是一个Set集合，往Set集合中方数据，实际上方法到了Map集合的Key部分
 */


/*
* 测试list及口中常用的方法
*   1. list集合储存元素的特点：有序可重复
*   2. List既然是Collection接口的子接口，那么肯定List接口有自己”特点“的特点：
*       void add(int index,Object obj)
*       Object set(int index,Object obj)
*       Object get(int index)
*       int indexOf(Object o)
*       int lastIndexOf(Object o)
*       Object remove(int index)
*
* */
public class ListTest01 {
    public static void main(String[] args) {
        List myList = new ArrayList<>();

        myList.add("A");
        myList.add("B");
        myList.add("C");
        myList.add("D");
        //这个一般不用，因为效率低
        myList.add(1,"E");
        Iterator it = myList.iterator();

        while (it.hasNext()) {
            Object elt = it.next();
            System.out.println(elt);
        }

        //根据下标获取元素
        Object firstObj = myList.get(0);
        System.out.println(firstObj);

        System.out.println(myList.indexOf("E"));
        System.out.println(myList.lastIndexOf("D"));

        //修改指定位置的元素
        myList.set(2,"Soft");
        System.out.println(myList.get(2));
     }
}
