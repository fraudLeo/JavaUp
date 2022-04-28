package Map;

/**
 * Map接口中常用的方法:
 *      1. Map和Collection没有继承关系
 *      2. Map集合以Key和Value的方式存储数据: 键值对
 *          key和value都是引用数据类型
 *          key和value都是存储对象的内存地址.
 *          key起到主导的地位,value是key的一个附属品
 *
 *      3. 常用方法:
 *          V put(K key , V value)  向Map集合中添加键值对
 *          V get(Object key)       通过key获取value
 *          void clear()            清空Map集合
 *          boolean containsKey(Object key) 判断Map中是否包含某个key
 *          boolean containsValue(Object value) 判断Map中是否被高喊某个Value
 *
 *          boolean isEmpty()       判断是否为空
 *          Set<K> keySet()         获取Map集合中所有的key
 *
 *          V remove(Object key)
 *          int size()
 *          Collection<V> values()  获取Map集合中所有的Value,返回一个Collection
 *          Set<Map.Entry<K,V>> entrySet()      将Map集合转换陈Set集合
 *
 */
public class MapTest01 {
    private static class InnerClass {
        //
        public static void m1() {
            System.out.println("m1方法执行");
        }
        public void m2() {
            System.out.println("静态内部类中的实例方法执行!");
        }
    }
    public static void main(String[] args) {
        //创建内部对象
        InnerClass innerClass = new InnerClass();
        innerClass.m2();
    }
}
