package Thread;

/**
 * 怎么叫醒一个正在睡觉的线程?
 *      注意: 这个不是中断线程的执行,而是中断线程的睡眠
 */
public class ThreadTest05 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable1());
        t.setName("t");
        t.start();
        //倘若5秒之后,t线程醒来
        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //终止t线程的睡眠
        t.interrupt();//干扰.这种方式依靠了JAVA的异常处理机制
    }
}

class MyRunnable1 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"--->begin");
        //睡眠一年
        //为什么这里的trycatch不能替代成Throw Exception?
        //因为子类不能比父类抛出更多的异常,对子类其他特有的方法可以Throws
        try {
            Thread.sleep(1000*60*60*24*265);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"--->end");
    }
}
