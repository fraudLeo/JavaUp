package Reflect.Field;

import java.lang.reflect.Field;

public class ReflectTest {
    public static void main(String[] args) throws Exception {
        //获取整个类
        Class studentClass = Class.forName("Reflect.Field.Student");
        //获取类中所有的field
        Field[] fields = studentClass.getFields();
        System.out.println(fields.length);//这里就一个元素
        Field f = fields[0];
        //取出这个field的名字
        String fieldName = f.getName();
        System.out.println(fieldName);
    }
}
