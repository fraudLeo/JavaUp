package Reflect;

import java.lang.reflect.Constructor;

public class ReflectTest08 {
    public static void main(String[] args) throws Exception {
        //不使用反射机制怎么创建
        VIP v1 = new VIP();
        VIP v2 = new VIP(110,"zhangsan","2002--10-11",true);

        //使用但设计值怎么创建呢?
        Class c = Class.forName("Reflect.VIP");
        //调用无参数构造方法
        Object obj = c.newInstance();
        //有参数的构造方法怎么办?
        Constructor declaredConstructor = c.getDeclaredConstructor(int.class, String.class, String.class, boolean.class);
        //第二步:调用构造方法new对象
        Object newObj = declaredConstructor.newInstance(110, "jake", "1990-10-11", true);
        System.out.println(newObj);

        //获取无参构造方法
        Constructor con2 = c.getDeclaredConstructor();
        Object objects = con2.newInstance();
        System.out.println(objects);
    }
}
