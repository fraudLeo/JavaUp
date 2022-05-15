package Thread;

/**
 * 强制终止线程
 *      stop();
 *      这种方式存在很大的缺点,容易丢失数据,因为一旦丢失数据就无法挽回
 */
public class ThreadTest06 {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable3());
        thread.setName("t");
        thread.start();
        //模拟五秒
        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //5秒之后终止t线程
        thread.stop();//废弃的原因是因为会丢失数据
    }
}
class MyRunnable3 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"==>"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
