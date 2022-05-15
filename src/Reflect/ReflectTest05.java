package Reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * 反射方法
 */
public class ReflectTest05 {
    public static void main(String[] args) throws Exception{
        //获取类
        Class userService = Class.forName("Reflect.Service.UserService");
        //获取所有的method(包括私有的)
        Method[] methods = userService.getDeclaredMethods();
        System.out.println(methods.length);//2
        //遍历method
        for(Method method:methods) {
            //获取修饰符列表
            String modifiersName = Modifier.toString(method.getModifiers());
            //获取方法的返回值类型
            String returnName = method.getReturnType().getSimpleName();
            //获去方法名
            String methodName = method.getName();
            //获取参数列表(数据类型)
            Class[] parameterTypes = method.getParameterTypes();
            //获取参数参数名

            System.out.print(modifiersName+" "+returnName+" "+methodName);

            System.out.println("("+parameterTypes[0]+" "+"..."+","+
                    parameterTypes[1]+" "+"..."+") {");
            System.out.println("}");
        }
    }
}
