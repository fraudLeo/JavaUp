package Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;//属于Java的并发包.老版JDK中并没有这个包.新特性

/**
 * 实现线程的第三种方式:
 *  实现Callable接口
 */
public class ThreadTest11 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //第一步:创建一个"未来人物类"对象
        //参数非常重要,需要给一个callable的实现对象
        FutureTask task = new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception {//call()方法就相当于run方法,只不过有一个返回值
                //线程执行一个任务,执行之后可能会有一个执行结果
                //模拟执行
                System.out.println("call method begin");
                Thread.sleep(1000*10);
                System.out.println("call method end");
                int a = 100;
                int b = 200;
                return a+b;//自动装箱(300结果编程Integer)
            }
        });

        //创建线程对象
        Thread thread = new Thread(task);
        thread.start();
        //这里是main方法,这是在主线程中,
        //在主线程中,怎么获取t线程返回的结果?
        //当执行获取返回值的时候,会造成main线程的阻塞,main方法想要执行,就必须等待get()方法的结束
        Object obj = task.get();
    }
}
