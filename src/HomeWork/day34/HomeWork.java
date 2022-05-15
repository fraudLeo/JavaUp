package HomeWork.day34;

import java.util.ArrayList;
import java.util.List;

/**
 * 使用生产者和消费者模式实现交替输出
 * 假设只有两个线程,输出以下结果:
 *  t1-->1
 *  t2-->2
 *  t1-->3
 *  t2-->4
 *  ......
 */

/**
 * 出现的错误:
 *
 * 被synchronized的对象是Integer，而它内部的int值是不可改变的，所以导致该错误
 *
 *     private static Integer value =0;
 *
 *         synchronized (value)
 *         {
 *
 *            。。。。。。。。。。。。。
 *         }
 *
 * 这样的会出现错误“current thread not owner”
 * ————————————————
 * 版权声明：本文为CSDN博主「张伟灿」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
 * 原文链接：https://blog.csdn.net/flyfish778/article/details/8732652
 */
public class HomeWork {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add(0,1);
        Thread t1 = new ThreadHomeworkT1(list);
        Thread t2 = new ThreadHomeworkT2(list);

        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        t2.start();
    }
}

class ThreadHomeworkT1 extends Thread {
    private List list;

    public ThreadHomeworkT1(List list) {
        this.list = list;
    }
    @Override
    public void run() {
        while(true) {
            synchronized (list) {
                if ((int)list.get(0)%2==0) {
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(list.get(0));
                int num = (int) list.get(0);
                num += 1;
                list.set(0,num);
                list.notifyAll();
            }
        }
    }
}

class ThreadHomeworkT2 extends Thread {
    private List list;

    public ThreadHomeworkT2(List list) {
        this.list = list;
    }

    @Override
    public void run() {
        while(true) {
            synchronized (list) {
                if ((int)list.get(0)%2!=0) {
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(list.get(0));
                int num = (int) list.get(0);
                num += 1;
                list.set(0,num);
                list.notifyAll();
            }
        }
    }
}
