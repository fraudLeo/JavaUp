package Thread;

/**
 * 1. 怎么获取当前的线程对象
 *      static Thread currentThread()
 * 2. 获取线程对象的名字
 *      String name = 线程对象.getName();
 * 3. 修改线程对象的名字
 *      线程对象.setName(name)
 * 4. 单线程没有设置名字的时候,默认的名字有什么规律?
 *      Thread-01
 *      Thread-02
 *      Thread-03
 *      Thread-04
 *      Thread-05
 */
public class ThreadTest03 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        //创建线程对象
        MyThread2 myThread2 = new MyThread2();
        //设置线程名字
        myThread2.setName("ttt");//默认Thread-0
        //获取线程名字
        String name = myThread2.getName();
        System.out.println(name);
        //启动线程
        myThread2.start();

    }
}

class MyThread2 extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("分支线程-->"+i);
        }
    }
}