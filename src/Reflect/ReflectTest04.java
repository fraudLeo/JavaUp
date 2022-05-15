package Reflect;

import java.lang.reflect.Field;

/**
 * 必须掌握:
 *  怎么通过反射机制访问一个java对象的属性?
 *      给属性赋值set
 *      获取属性的值get
 *
 */
public class ReflectTest04 {
    public static void main(String[] args) throws Exception, InstantiationException, IllegalAccessException {
        Class studentClass = Class.forName("Reflect.Field.Student");
        Object obj = studentClass.newInstance();
        Field noField = studentClass.getDeclaredField("no");
        /**
         * 虽然使用了反射机制,但是三要素还是缺一不可
         * 要素一: obj对象
         * 要素二: no属性
         * 要素3: 2222值
         *
         * 要注意:反射代码让代码复杂了,单数为了一个灵活,也是值得的
         */
        noField.set(obj,2222);
        System.out.println(noField.get(obj));
        //可以访问私有属性吗?
        Field nameField = studentClass.getDeclaredField("name");
        //能,打破封装(反射机制的缺点:打破封装,可能会给不法分子留下机会
        nameField.setAccessible(true);
        nameField.set(obj,"jason");
        //获取name属性
        System.out.println(nameField.get(obj));
    }
}
