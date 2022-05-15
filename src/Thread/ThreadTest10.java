package Thread;

/**
 * 守护线程:
 *  java语言中线程中分为两大类
 *  一类是用户线程
 *  另一类是守护线程那个
 *  其中具有代表性的是:垃圾回收线程(守护线程)
 *
 *  守护线程的特点:一般守护线程是一个死循环,所有的用户线程只要结束,守护线程自动结束
 *  主线程main就是一个用户线程,守护线程用在什么地方呢?
 *          偏向于后台,每天0:00的时候,系统自动备份,将定时器设置为守护线程
 *
 */
public class ThreadTest10 {
    public static void main(String[] args) {
        BakDataThread t = new BakDataThread();
        t.setName("备份数据的线程");
        //启动线程之前,将线程设置为守护线程
        //那么就会出现这样的情况:只有当用户线程存在的时候才会执行线程,否则t这个线程是不会停止的
        //当用户线程消失的时候,他才会消失
        t.setDaemon(true);
        t.start();

        //主线程
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"--->"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class BakDataThread extends Thread {
    @Override
    public void run() {
        int i = 0;
        while(true) {
            System.out.println(Thread.currentThread().getName()+"--->"+(++i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}