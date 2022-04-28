package HashMap;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * HashMap集合key部分允许null嘛?
 *  允许
 *  但是要注意,key的值为null只能有一个
 *  但是hashTable就不会允许key为null 会报空指针异常
 *
 * Hashtable方法带有synchronized 是线程安全的
 * 线程安全有其他的方案,这个hashTable对现成的处理导致了效率的降低使用较少
 * hashtable和hashMap一样底层都是哈希表数据结构
 * 哈希table的初始化容量是11,默认加载因子是0.75
 * hashTable的扩容方法是:原容量*2+1
 */
public class HashMapTest03 {
    public static void main(String[] args) {
        Map map = new HashMap<>();

        //HashMap集合允许key为null
        map.put(null,null);

        //key重复的话value是覆盖
        map.put(null,100);

        //通过key获取value
        System.out.println(map.get(null));
        //hashTable的时候 key为null就行不通
        Map table = new Hashtable<>();
        table.put(null,100);
        System.out.println(table.get(null));
    }
}
