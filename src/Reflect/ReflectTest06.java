package Reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectTest06 {
    public static void main(String[] args) throws Exception {
        StringBuilder stringBuilder = new StringBuilder();
        Class userServiceClass = Class.forName("Reflect.Service.UserService");
        stringBuilder.append(Modifier.toString(userServiceClass.getModifiers()) + " class " + userServiceClass.getSimpleName() + "{");

        Method[] methods = userServiceClass.getMethods();
        stringBuilder.append("\n");
        for (Method method:methods) {
            stringBuilder.append("\t");
            stringBuilder.append(Modifier.toString(method.getModifiers()));
            stringBuilder.append(" ");
            stringBuilder.append(method.getReturnType().getSimpleName());
            stringBuilder.append(" ");
            stringBuilder.append(method.getName());
            stringBuilder.append("(");
            //参数列表
            Class[] parameterTypes = method.getParameterTypes();
            for (Class parameterYype:
                 parameterTypes) {
                stringBuilder.append(parameterYype.getSimpleName());
                stringBuilder.append(",");
            }
            //删除指定下表上的字符
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
            stringBuilder.append("){}\n");

        }
        stringBuilder.append("}");
        System.out.println(stringBuilder);
    }
}
