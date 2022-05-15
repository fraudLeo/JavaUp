package Thread;

/**
 * 多线程:
 *  什么是进程? 什么是线程?
 *    县城是一个进程中的执行场景/执行单元
 *    一个进程可以启动很多线程
 *
 *    现在的java至少有两个并发,一个是gc还有一个是main启动
 *    进程A和进程B的内存独立不共享.
 *    线程A和线程B
 *      在java语言中,线程A和线程B,对内存和方法区内存共享
 *      但是栈内存独立,一个线程一个栈
 *      java语言中之所以有多线程机制,就是为了提高程序的执行效率
 *
 *      使用了多线程机制之后,main方法结束了,hi不是有可能程序也不会结束.
 *      main方法结束只是主程序结束了,主栈空了,其他的线程可能还在压栈,弹栈
 *
 *      可以暂时这么理解:一个栈就是一个线程
 *
 *
 *      java中实现线程有两种方式,那两种方式呢?
 *          第一种: 编写一个类,直接继承Thread 重写run方法
 *
 */


/**
 * 实现线程的第一种方式:
 *  编写一个类 直接继承Thread 重写run方法
 *  怎么创建线程对象?
 *  怎么启动线程呢?
 */
public class ThreadTest01 {
    public static void main(String[] args) {
        //这里是main方法 这里的代码属于主线程 在主栈中运行
        //新建一个分支线程对象
        MyThread myThread = new MyThread();
        //启动线程
        //start()方法的作用是:启动一个分支线程,在JVM中开辟一块新的栈空间,这一段代码瞬间就结束了.
        //启动成功的线程会自动调用run方法,并且run方法在分支栈的栈底部(压栈)
        //run方法在分支栈的栈底部,main方法在主栈的栈底部,run和main是平级的
        //如果不执行start方法,而是选择了run方法,那么就不会启动线程,不会分配新的分支栈
        myThread.start();
        //这里的代码还是运行在主线程当中
        for (int i = 0;i<1000;i++) {
            System.out.println("主线程--->"+i);
        }
    }
}

class MyThread extends Thread {
    //这里的run是不需要手动调用的,是由JVM线程调用机制来运作的
    @Override
    public void run() {
         //编写程序,这段程序运行在分支线程中(分支栈)
        for (int i = 0;i<1000;i++) {
            System.out.println("分支线程--->"+i);
        }
    }
}
