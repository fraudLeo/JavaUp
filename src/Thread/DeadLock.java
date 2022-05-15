package Thread;

/**
 * 死锁代码要求会写,有的面试官会让你写出来
 *
 *      思索很难调试,
 *      所以在开发中少用synchronized嵌套,防止锁住
 *
 *      在开发中我们应该怎么解决线程安全问题?
 *          并不是一上来就使用线程同步synchronized
 *          这样会使得程序执行效率变低,用户体验不好,吞吐量降低,在不得已的情况下在选择线程同步机制
 *
 *          第一种方案:选择方法尽量使用局部变量来代替实例变量和静态变量.
 *          第二种方案:如果必须是实例变量,那么可以考虑创建多个对象,一个线程对应一个对象,这样就不会发生内存共享了
 *          第三种方案:如果不能使用局部变量,对象也不能创建多个,这个时候就只能synchronized.线程同步机制
 */
public class DeadLock {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();

        Thread t1 = new MyThread10(o1, o2);
        Thread t2 = new MyThread11(o1, o2);

        t1.start();
        t2.start();
    }
}

class MyThread10 extends Thread {

    Object o1;
    Object o2;
    public MyThread10(Object o1,Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    @Override
    public void run() {
        synchronized (o1) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (o2) {
                System.out.println("o1嵌套o2");
            }
        }
    }
}

class MyThread11 extends Thread {
    Object o1;
    Object o2;
    public MyThread11(Object o1,Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    @Override
    public void run() {
        synchronized (o2) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (o1) {
                System.out.println("o2嵌套o1");
            }
        }
    }
}