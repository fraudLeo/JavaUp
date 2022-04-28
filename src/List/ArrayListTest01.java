package List;

import java.util.ArrayList;
import java.util.List;

/**
 * ArarayList集合：
 *      1. 默认初始化容量10
 *      2. 集合底层是一个Object[]数组。
 *      3. 构造方法：
 *          new ArrayList()
 *          new ArrayList(20)
 *      4. ArrayList数组扩容，增长原来的1.5
 *      5. 数组优点：
 *          检索效率高
 *      6. 数组缺点：
 *          随机增删元素效率较低
 *          无法存储大数据量（很难找到一块大的连续的空间
 *      7. 向数组末尾添加元素效率效率高，不受影响
 *      8. 面试官经常问：
 *          这么多集合中 你用那个集合最多？
 *              答：Array List集合
 */
public class ArrayListTest01 {
    public static void main(String[] args) {
        //size()是获取元素个数，而不是元素容量
        //默认初始化容量是10
        List list1 = new ArrayList<>();
        System.out.println(list1.size());
        //指定初始化容量
        List list2 = new ArrayList<>(20);
        System.out.println(list2.size());
        //每次扩容都是在当前基础上加上当前基础的1/2

    }
}
