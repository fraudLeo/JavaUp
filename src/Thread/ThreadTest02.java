package Thread;

/**
 * 实现线程的第二种方式,编写一个类实现Runnable接口
 * 一个线程有哪几种生命周期状态?
 *  新疆状态,就绪状态,运行状态,阻塞状态,死亡状态
 */
public class ThreadTest02 {
    public static void main(String[] args) {
        //创建一个可运行的对象
        MyRunnable r = new MyRunnable();
        //将可运行的对象封装成一个线程对象
        Thread thread = new Thread(r);
        //启动线程
        thread.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程-->"+i);
        }

    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("分支线程-->"+i);
        }
    }
}