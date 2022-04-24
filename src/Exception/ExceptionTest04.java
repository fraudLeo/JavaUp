package Exception;

public class ExceptionTest04 {
    public static void main(String[] args) throws ClassNotFoundException {
        //报错的原因: 因为doSome()方法声明位置上使用了抛出, 必须编写代码时处理 否则会报错
        //可以继续上抛或者tryCatch
        doSome();

    }

    /**
     * doSome 方法在申明的位置上使用了throw 这个代码表示doSome() 方法在执行过程中 有可能会出现ClassNotFoundException异常
     * 这个异常直接父类是Exception 所以是属于编译时异常
     */
    public static void doSome() throws ClassNotFoundException {
        System.out.println("doSome!");
    }
}

