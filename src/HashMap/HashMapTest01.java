package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
HashMap集合:
    1. HashMap集合底层是哈希表/散列表的数据结构
    2. 哈希表是一个怎样的数据结构呢?
        哈希表是一个数组和单向链表的结合体
        数组:在查询方面效率很高,随机增删元素方面效率很低
        单向列表:在随机增删方面效率较高,在查询方面效率很低
        哈希表将上面两种数据结构融合在一起,充分发挥他们各自的优点
    3.  HashMap集合底层的源代码
        public class HashMap {
            //HashMap 底层实际上就是一个数组.
            Node<K,V>[] table;

            //静态的内部类
            static clas Node<K,V> implements Map.Entry<K,V> {
                    final int hash;//哈希值(哈希值是key的hashCoed()方法的执行结果,哈希值通过哈希函数,可以转换成数组的下表)
                    final K key;//存储到Map集合中的那个key
                    V value;//存储到Map集合中的那个Value
                    Node<K,V> next;//下一个结点的内存地址
            }
        }
        哈希表/散列表: 一维数组,这个数组中每一个元素都是一个单向列表

   4. 最主要掌握的方法:
        put(k,v)实现原理:
                第一步: 详见k,v封装到Node对象中
                第二步: 底层会调用k的hashCode()方法得出hash值,然后通过hash函数,将hash值转换陈数组下标.
                        如果下标位置上没有任何元素,那么就把Node添加到这个位置上了,如果说下标对应的位置上油量表,此时会拿着k和链表上每一个节点中的k进行equals
                        如果所有的equals返回都是false 那么这个新节点就会添加到链表的末尾,如果有一个返回true,就会将value改成新的value
        get(k)实现原理:
                第一步:像调用hashCode()方法得出哈希值,通过哈希算法转换成数组下标,通过数组下标快速定位到某个位置上,如果这个位置上什么也没有 返回null
                      如果这个位置上有单向链表,那么会拿着参数k和单向链表上的每一个节点中的k进行equals,如果所有的equals都返回false
                      get方法就返回null,只要其中有一个节点和k和参数k equals 返回true 那么此时这个节点的value就是我们要找的value
    5. hashMap集合的key部分特点:
        无序,不可重复.为什么无需?与i那位不一定挂到哪个单向链表上.
        不可重复是怎么保证的?equals方法来保证HashMap集合的key不可重复.
        如果key重复了,value会覆盖掉

        放在hashmap集合部分的 key部分的元素实际上就是放到了HashSet中
        所以HashSet集合中的元素也需要同时重写hashCode()+equals()
    6. 哈希表HashMap使用不当时无法发挥性能!
        假设所有的hashCode()方法返回固定为某个值.那么会导致底层哈希表变成了纯单向列表,这种情况我们
        称为散列分布不均匀
       假设将所有的hashCode()方法返回值都设定为不一样的值,可以吗?有什么问题?
       这样的话导致底层哈希表就成了一维数组了,没有链表的概念了
       也是散列分布不均匀

    7. 重点: 放在hashMao集合中key部分的元素,以及放在hashSet集合中的元素,需要同时重写hashCode和equals方法
    8. hashMap集合的默认初始化容量是16,默认加载因子是0.75
        这个默认加载因子适当HashMao集合底层数组容量道道75%的时候,数组会开始扩容
        重点:,记住:hashMap集合初始化容量必须是2的倍数,这也是官方推荐的,
        只是因为达到散列均匀为了提高hashmao集合的存取效率,所必需的
* */
public class HashMapTest01 {
    public static void main(String[] args) {
        //测试仪hashMap集合key部分元素的特点
        //Integer是Key,他的hashCode和equals都重写了
        Map<Integer, String> map = new HashMap<>();
        map.put(1111,"zhangsan");
        map.put(6666,"lisi");
        map.put(7777,"wangwu");
        map.put(2222,"zhaoliu");
        map.put(2222,"king");
        System.out.println(map.size());//key重读的时候value会进行覆盖

        //遍历Map集合
        Set<Map.Entry<Integer,String>> set = map.entrySet();
        for (Map.Entry<Integer,String> entry:set) {
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }
}
