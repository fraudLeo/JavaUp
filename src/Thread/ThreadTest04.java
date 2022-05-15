package Thread;

/**
 * 关于线程的sleep方法
 *  1. 静态方法:Thread.sleep(1000);
 *  2. 参数是毫秒为单位
 *  3. 作用:让当前线程进入休眠,进入"阻塞状态" 放弃占有CPU的时间片,让给其他线程使用
 */
public class ThreadTest04 {
    public static void main(String[] args) {
        //让当前线程进入休眠,睡眠时间是5s
        System.out.println("hello!");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("hello Again");


        Thread t = new MyThread3();
        t.setName("t");
        t.start();


        try {
            t.sleep(1000*5);//这里运行的时候还是会将t变为当前的Thread.所以sleep是无用的,sleep只会作用于写的当前文件下使用
                                  //无论当前对象是什么,这行代码的目的始终只有一个:让当前线程进入休眠,也就是说main线程进入休眠
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("HE");
    }
}

class MyThread3 extends Thread {
    @Override
    public void run() {
        System.out.println("hello");
    }
}
