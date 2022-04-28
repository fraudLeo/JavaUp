package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Map集合的遍历 非常重要
 */
public class MapTest02 {
    public static void main(String[] args) {
        //第一种方式: 获取所有的key 通过遍历key 来遍历value
        Map<Integer,String> map = new HashMap();
        map.put(1,"zhangsan");
        map.put(2,"lisi");
        map.put(3,"wangwu");
        map.put(4,"zhaoliu");
        //遍历Map集合
        //获取所有的Key,所有的key都是Set集合
        Set<Integer> keys = map.keySet();
        //遍历key,通过key获取value
        Iterator<Integer> it = keys.iterator();
        while(it.hasNext()) {
            Integer key = it.next();
            String value = map.get(key);
            System.out.println(key+"="+value);
        }
        System.out.println("===================");
        //迭代器可以用 fereach也可以
        for(Integer key:keys) {
            System.out.println(key+"="+map.get(key));
        }

        System.out.println("======第二种方式======");
        //第二种方式:Set<Map.Entry<K,V>> entrySet()
        //将Map集合全部转换成Set集合
        Set<Map.Entry<Integer, String>> set = map.entrySet();
        Iterator<Map.Entry<Integer, String>> it2 = set.iterator();
        while(it2.hasNext()) {
            Map.Entry<Integer, String> node = it2.next();
            Integer key = node.getKey();
            String value = node.getValue();
            System.out.println(key+"="+value);
        }
        System.out.println("============");
        //这种方式效率高,因为获取key和value都是直接从node对象中获取属性值
        //这种方式比较适合于大数据量
        for(Map.Entry<Integer,String> node:set) {
            System.out.println(node.getKey()+"--->"+node.getValue());
        }
    }
}
