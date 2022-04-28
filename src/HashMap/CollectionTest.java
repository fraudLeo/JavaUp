package HashMap;

import java.util.*;

/**
 * Collection 接口工具
 * Collections 集合工具类,方便集合的操作
 *
 */
public class CollectionTest {
    public static void main(String[] args) {
        //ArrayList集合不是线程安全的.
        List<String> list = new ArrayList<>();
        //变成线程安全的
        Collections.synchronizedList(list);
        //排序
        list.add("abc");
        list.add("abx");
        list.add("abf");
        list.add("abe");
        Collections.sort(list);
        for (String li:list) {
            System.out.println(li);
        }


       List<Turtle> list2 = new ArrayList<>();
        list2.add(new Turtle(1000));
        list2.add(new Turtle(8000));
        //注意: 对list集合中的元素排序,需要保证list集合中的元素实现了Comparable接口!!!!!!!!
        Collections.sort(list2);
        for(Turtle t : list2) {
            System.out.println(t);
        }

        //对Set集合怎么排序呢?
        Set<String> set = new HashSet<>();
        set.add("asd");
        set.add("asdqwe");
        set.add("asd123");
        set.add("asd312");


        List<String> myList = new ArrayList<>(set);
        //这里不能直接把set放进去,因为sort()方法里面只能方list,所以得想办法把set变成list
        Collections.sort(myList);
        for (String s:myList) {
            System.out.println(s);
        }
        //这种方式也能排序
//        Collections.sort(List集合,比较器对象);




    }
}
