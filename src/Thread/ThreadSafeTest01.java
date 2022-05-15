package Thread;

/**
 * 什么时候数据在多线程并发的环境下会存在安全问题呢?
 *      三个条件:
 *          1. 多线程并发
 *          2. 有数据共享
 *          3. 共享数据有修改的行为
 *
 *      怎么解决线程安全问题呢?
 *          但多线程并发的环境下,有共享数据,并且这个数据还会被修改,此时就存在线程安全我呢提,怎么解决这个问题?
 *              线程排队执行.(不能并发)
 *              用排队执行解决线程安全问题
 *              这种机制被称为:线程同步机制(专业术语)
 *
 *           怎么解决线程安全机制?
 *              使用线程同步机制
 *
 *            线程同步就是线程排队了,线程排队了就会牺牲一部分的效率,没办法,数据安全第一位
 *
 *            说到线程同步这块,涉及到这两个专业术语:
 *
 *            异步编程模型:
 *              线程t1和线程t2,各自执行各自的,互不干扰,谁也不需要等谁.
 *              这种编程模型就叫做:异步编程模型
 *              其实就是:多线程并发(效率较高)
 *
 *            同步编程模型:
 *              线程t1和线程t2 在执行t1的时候,必须等待t2线程执行结束,或者说在t2线程执行的时候,必须等待t1线程执行结束.两个线程之间发生了等待关系
 *              效率较低,线程排队执行.
 *              同步就是排队,异步就是并发
 */
public class ThreadSafeTest01 {
    public static void main(String[] args) {
        //创建账户对象(只创建一个)
        Account1 act = new Account1("act-001",10000);
        //创建两个线程,两个线程共享同一个账户啊
        Thread t1 = new AccountThread1(act);
        Thread t2 = new AccountThread1(act);
        //命名线程name
        t1.setName("t1");
        t2.setName("t2");
        //启动线程取款
        t1.start();

        t2.start();


    }
}

class AccountThread1 extends Thread {
    //两个线程陈必须共享同一个账户对象
    private Account1 act;

    public AccountThread1(Account1 act) {
        this.act = act;
    }
    public void run() {
        //run执行方法表示取款
        //取钱
        double money = 5000;
        act.withdraw(money);
        System.out.println("对账户:"+act.getActno()+"取款成功,余额:"+act.getBalance());
    }
}


class Account1 {
    //账号
    private String actno;
    //余额
    private double balance;

    public Account1() {
    }

    public Account1(String actno, double balance) {
        this.actno = actno;
        this.balance = balance;
    }

    public String getActno() {
        return actno;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //取款的方法
    public void withdraw(double money) {
        //取款之前的余额
        double before = this.getBalance();
        //取款之后的余额
        double after = before-money;
        //在这边模拟下网络延迟,百分百会出问题
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //更新余额
        this.setBalance(after);
    }
}
