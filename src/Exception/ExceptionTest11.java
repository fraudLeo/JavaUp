package Exception;

public class ExceptionTest11 {
    public static void main(String[] args) {
        //创建异常对象
        MyExceptionTest01 myExceptionTest01 = new MyExceptionTest01("用户信息不能为空");
        //打印堆栈信息
        myExceptionTest01.printStackTrace();
        //获取简单描述信息
        String s = myExceptionTest01.getMessage();

    }
}
