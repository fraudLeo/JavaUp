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
public class ThreadSafeTest02 {
    public static void main(String[] args) {
        //创建账户对象(只创建一个)
        Account act = new Account("act-001",10000);
        //创建两个线程,两个线程共享同一个账户啊
        Thread t1 = new AccountThread(act);
        Thread t2 = new AccountThread(act);
        //命名线程name
        t1.setName("t1");
        t2.setName("t2");
        //启动线程取款
        t1.start();

        t2.start();


    }
}

class AccountThread extends Thread {
    //两个线程陈必须共享同一个账户对象
    private Account act;

    public AccountThread(Account act) {
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


class Account {
    //账号
    private String actno;
    //余额
    private double balance;

    public Account() {
    }

    public Account(String actno, double balance) {
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

        // 一下这几行代码必须是线程排队的,不能是并发.
        // 执行完毕了才能让另一个线程进来
        /*
        * 这里就要用到线程同步机制,
        * synchronized()括号里面传的参数数据是相当关键的,必须是多线程共享的数据,才能达到多线程排队
        * ()里面些什么?
        *   那要看想要让哪些线程同步,假设t1,t2,t3,t4,t5
        *   只希望1,2,3 排队,不需要4,5排队,一定要在()中写一个1,2,3共享的对象.而这个对象对于
        * 4,5不是共享的
        *   synchronized(){
        *       //线程同步代码块
        *   }
        *
        *   这道题的共享对象是账户对象,那么即使this.
        * java语言中,任何一个对象都有一把锁,这把锁就是标记,只是把它叫做锁,
        *       一个对象一把锁,这是不会变得
        *
        * 以下代码的执行原理
        *   1. 假设t1和t2线程并发,开始执行以下代码的时候,一定有一个先后顺序
        *   2. 假设t1先执行了,遇到了synchronized 这个时候自动找"后面共享对象"的对象锁,
        *       找到之后,并占有这把锁,然后执行同步代码块中的程序,在执行过程中一直都是占有这把锁的.值到同步代码块中的代码结束,这把锁才会释放,
        *   3. 假设t1已经占有了这把锁,此时t2也遇到了synchronized关键字,也会去占有后面共享对象的这把锁,结果这把锁被t1占有,t2只能在同步代码块外等待t1结束.值到t1吧同步代码块之行结束了,
        *       t1才会归还这把锁,t2终于等到这把锁.然后t2占有这把锁之后,进图同步代码块执行程序
        *
        *       这样就达到了线程排队执行.
        *       这里需要注意的是,这里的共享对象一定要选好了,一定是你需要排队执行的这些线程对象所共享的
        *
        * java中有三大变量:
        *   实例变量
        *   静态变量
        *   局部变量
        *   以上三大变量中局部变量永远都不会存在线程安全问题.
        *   因为局部变量不共享.(一个线程一个栈)局部变量在栈中,永远都不会共享
        *   实例变量在堆中,对只有一个,静态变量在方法区中,方法去只有一个.
        * 堆和方法区都是多线程共享的,所以可能存在线程安全问题
        *
        * 在实例方法上可以使用synchronized()一定锁的是this,没得挑.不可能是其他对象了.
        * 还有一个缺点:synchronized出现在实例方法上,表示整个方法体都需要同步,可能会无辜扩大同步的范围,导致执行效率变低,所以这种方式不常用
        * 但是也有优点:代码写得少,节俭了.
        * 所以如果共享的对象就是this,并且需要同步的代码块就是整个方法体,建议使用这种方法体
        *
        *
        *
        * 总结:
        *   synchronized一共有三种写法:
        *       第一种:同步代码块
        *           灵活
        *             synchronized(线程共享对象) {
        *                   同步代码块
        *           }
        *       第二种:在实例方法上使用synchronized
        *           表示共享对象一定是this,并且同步代码块是整个方法体
        *
        *       第三种:
        *           在静态方法上使用synchronized
        *           表示找类锁
        *           类锁永远只有一把,就算创建了100个对象,那类锁也只有一把锁,
        * */
        synchronized (this) {
            double before = this.getBalance();
            double after = before-money;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.setBalance(after);
        }

    }
}
