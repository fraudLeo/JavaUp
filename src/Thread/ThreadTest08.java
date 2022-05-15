package Thread;

/**
 * 1 线程调度
 *  1.1 常见的线程调度模型有哪些?
 *      抢占式调度模型:
 *          哪个线程的优先级比较高,抢到的cpu时间片的概率就高一些(相对的)
 *          java采用的就是抢占式调度模型
 *      均分式调度模型
 *          平均分配cpu时间片,每个线程占有的cpu时间片时间成都一样.平均分配,一切平等.
 *          有些编程语言,线程调度模型采用的就是这种方式
 *  1.2 JAVA中哪些方法是和线程调度相关的?
 *
 *      实例方法:
 *          void setPriority(int newPriority)设置线程的优先级
 *          int getPriority()获取线程优先级
 *          最低为1
 *          最高为10
 *          默认为5
 *
 *      静态方法:
 *          static void yield()让位方法
 *          暂停当前正在执行的线程对象,并执行其他线程
 *          yield()方法不是阻塞方法,让当前线程让位,谈给其他线程使用
 *          yeild()方法的执行会让当前线程从"运行状态"回到"就绪状态"
 *
 *      实例方法:
 *          void join()
 *          合并线程
 *          class MyThread1 extends Thread {
 *              public void doSome() {
 *                  MyThread t = new MyThread();
 *                  t.join();//当前线程进入阻塞,直到t线程结束,当前线程才可以执行
 *              }
 *          }
 *
 */
public class ThreadTest08 {
    public static void main(String[] args) {

    }
}
