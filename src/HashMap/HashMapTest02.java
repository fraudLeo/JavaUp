package HashMap;

/**
 * 终极结论:
 *  放在HashMap集合中的key部分以及放在HashSet集合中的元素,需要同时重写HashCode方法和equals方法
 *
 * 对于哈希表数据结构来说
 *  如果o1和o2的hash值相同,一定是放到同一个单向链表上面
 *  当然如果o1和o2的hash值不同但是由于哈希算法执行结束之后转换的数组下标可能相同,此时会发生 哈希碰撞
 */
public class HashMapTest02 {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan");
        Student s2 = new Student("zhangsan");

        //重写equals方法之前是false
        //System.out.println(s1.equals(s2));

        //重写equals方法之后
        System.out.println("s1:"+s1.hashCode());
        System.out.println("s2:"+s2.hashCode());
    }
}
