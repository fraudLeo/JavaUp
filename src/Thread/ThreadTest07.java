package Thread;

/**
 * 怎么合理的终止一个线程的执行,这种方式是很常用的
 */
 public class ThreadTest07 {
    public static void main(String[] args) {
        MyRunnable4 myRunnable4 = new MyRunnable4();
        Thread thread = new Thread(myRunnable4);
        thread.setName("t");
        thread.start();
        //模拟5秒
        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //终止线程
        myRunnable4.run = false;
    }
}

class MyRunnable4 implements Runnable {
     boolean run = true;
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (run) {
                System.out.println(Thread.currentThread().getName()+"==>"+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                //终止当前线程
                return;
            }
        }
    }
}
