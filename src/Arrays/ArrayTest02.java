package Arrays;

//模拟用户系统,必须输入账号和密码
public class ArrayTest02 {
    public static void main(String[] args) {
        if (args.length!=2) {
            System.out.println("使用该系统请输入程序参数,参数中包括用户信息和密码信息!");
            return;
        }

        //程序运行到这里说明用户确实提供了用户名和密码
        //接下来你该判断用户名和密码是否正确
        //取出用户名
        String username = args[0];
        //取出密码
        String password = args[1];

        //判断账号和密码
        if (username.equals("admin")&&password.equals("123")) {
            System.out.println("登录成功!");
        } else {
            System.out.println("登陆失败!");
        }
    }
}
