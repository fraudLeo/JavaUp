package HomeWork.day27;

import java.util.Scanner;

/**
 * 编写程序模拟用户注册
 *  1. 程序开始执行时,提示用户输入"用户名" 和 "密码" 信息
 *  2. 输入信息之后,后台java程序模拟用户注册
 *  3. 注册时用户名要求长度再[6-14]之间,小于或大于都要显示异常.
 *
*  注意:  完成注册的方法放到一个单独的类中
 *      异常类自定义即可.
 *
 *      class UserService {
 *          public void register (String username,String password) {
 *              //这个方法中国你完成注册
 *          }
 *      }
 *
 *      编写main方法 再main方法中接受用户输入的信息,再main方法里面调用UserService的register方法完成注册
 */
public class HomeWork01 {
    public static void main(String[] args) {
        System.out.println("请输入用户名和密码信息:");
        Scanner sc = new Scanner(System.in);
        UserService userService = new UserService();
        try {
            userService.register(sc.next(), sc.next());
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }

    }
}

class UserService {
    public void register(String username,String password) throws MyException {
        int username_len = username.length();
        int password_len = password.length();
        boolean username_bool = judgeBool(username_len);
        boolean passowrd_bool = judgeBool(password_len);
        if (!username_bool||!passowrd_bool) {
            throw new MyException("用户名密码不符合条件");
        }

        System.out.println("注册成功！");

    }
    public boolean judgeBool(int len) {
        if (len>=6&&len<=14) {
            return true;
        } else {
            return false;
        }
    }
}

//自定义
class MyException extends Exception{

    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }

}