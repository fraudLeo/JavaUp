package Generic;

import java.util.ArrayList;
import java.util.List;

/**
 * JDK 之后引入了:自动类型推断机制.(又称钻石表达式)
 *
 */
public class GenericTest02 {
    public static void main(String[] args) {
        //ArrayList<这里的类型会自动推断>() JDK8之后才允许
        //自动类型推断  < >
        List<Animal> myList = new ArrayList<>();
    }
}
