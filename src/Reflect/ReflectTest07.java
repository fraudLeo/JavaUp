package Reflect;

import Reflect.Service.UserService;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 重点: 通过反射机制怎么调用一个对象的方法?
 */
public class ReflectTest07{
    public static void main(String[] args) throws Exception {
        //不适用反射机制怎么调用方法L:
        UserService userService = new UserService();

        /**
         * 要素分析:
         *  要素一: 对象userSetvice
         *  要素二: login方法名
         *  要素三: 参数列表
         *  要素四: 返回值
         */
        boolean loginSucccess = userService.login("admin","123");
        System.out.println(loginSucccess?"登陆成功":"登陆失败");

        // 使用反射机制来调用一个对象的方法该怎么去做?
        Class userServiceClasss = Class.forName("Reflect.Service.UserServicer");
        //创建对象
        Object obj = userServiceClasss.newInstance();
        //获取method
        Method loginMethod = userServiceClasss.getDeclaredMethod("login",String.class,String.class);
        //调用方法
        //调用方法有几个要素?也需要四要素
        /*
        * loginMethod方法
        * obj对象
        * "admin","123" 实参
        * retValue 返回值
        * */
        //反射机制中最最最重要的一个方法就是invoke

        Object retValue = loginMethod.invoke(obj,"admin","123");
    }
}
