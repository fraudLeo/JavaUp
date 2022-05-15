package Thread;

/**
 * 关于Object类中的wait方法和notify方法(生产者和消费者模式!)
 *  第一: wait和notify方法不是线程对象的方法,是java中任何一个java对象都有的方法,因为这两个方式是Object类中自带的.
 *       wait方法和notify方法不是通过线程对象调用
 *  第二: wait()方法的作用?
 *      Object o = new Object;
 *      o.wait();
 *      表示让正在o对象上活动的线程进入等待状态,无期限等待 直到被唤醒位置
 *      o.wait(); 方法的调用,会让当前线程(正在o对象上活动的线程)进入等待状态
 *  第三: notify()方法的作用?
 *        O.notify();
 *        表示正在唤醒o对象上等待的线程
 *        还有一个notifyAll方法,这个方法是唤醒o对象上处于等待的所有线程
 *
 *      生产者和消费者模式是为了专门解决某个特定需求的
 *      一个线程负责生产,一个线程负责消费,最终达到生产和消费必须均衡,
 *          例如 生产满了,就不能再生产了,必须让消费线程进行消费,同理反过来
 *
 *仓库是多线程共享,所以需要考虑仓库的线程安全问题,仓库对象最终调用wait和notify方法
 * wait方法和notify方法建立在synchronized线程同步的基础上
 * 重点:
 *      o.wait()方法会让正在对象o上的当前线程进入等待状态.兵器人释放之前占有o对象的锁
 *      o.notify()方法只会通知,不会释放之前占有的o对象的锁
 *      */

import java.util.ArrayList;
import java.util.List;

/**
 * 使用wait和notify方法实现生产者和消费者模式
 *
 * wait方法和notify方法建立在线程同步的基础上,因为多线程要同时操作一个仓库,有线程安全问题
 * wait
 */
public class Wait_Notify {
    public static void main(String[] args) {
        //创建1个仓库对象,共享的
        List list = new ArrayList<>();
        //创建两个线程对象
        //生产者
        Thread t1 = new Thread(new Producer(list));
        // 消费者线程
        Thread t2 = new Thread(new Consumer(list));

        t1.setName("生产者线程");
        t2.setName("消费者线程");

        t1.start();
        t2.start();


    }
}

//生产线程
class Producer implements Runnable {
    //仓库
    private List list;
    public Producer(List list) {
        this.list = list;
    }
    @Override
    public void run() {
        //一直生产
        while(true)
            //给仓库对象list加锁
            synchronized (list) {
                if (list.size()>10) {
                    //当前线程进入等待状态
                    try {
                        System.out.println("当前仓库剩余:"+list.size());
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //到这里说明仓库是空的,可以生产
                Object o = new Object();
                list.add(o);
                System.out.println(Thread.currentThread().getName()+"-->"+o);
                list.notifyAll();
            }
        }
    }
//消费线程
class Consumer implements Runnable {
    private List list;

    public Consumer(List list) {
        this.list = list;
    }

    @Override
    public void run() {
        //一直消费
        while(true) {
            synchronized (list) {
                if (list.size()==0 ) {
                    try {
                        System.out.println("当前仓库剩余:"+list.size());
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                for (int i = 0; i < list.size(); i++) {
                    Object o = list.remove(i);
                    System.out.println(Thread.currentThread().getName()+"-->"+o);
                }


                //这里生产者应该进行消费
                list.notifyAll();
            }
        }
    }
}
