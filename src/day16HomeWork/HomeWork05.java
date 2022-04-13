package day16HomeWork;

/**
 * 在程序中经常要对事件进行操作但是没有时间类型的数据
 * 那么我们可以自己实现一个时间类来满足程序中的需要
 * 定义名为MyTime的类其中应该有三个整形成员 hour minute second
 * 为了保证安全性,应该使用private
 * 为MyTime类定义构造方法以方便创建对象时初始化成员变量
 * 在定义display方法用于将时间信息打印出来
 * 为MyTime定义以下方法
 *
 *  addSecond(int sec)
 *  addMinute(int min)
 *  addHour(int hou)
 *  subSecond(int sec)
 *  subMinute(int min)
 *  subMinute(int hou)
 *
    分别对时分秒进行运算呢
 */
public class HomeWork05 {
    public static void main(String[] args) {

        MyTime t1 = new MyTime();
        t1.setHour(13);
        t1.addSecond(121);
        System.out.println(t1.toString());

    }
}
class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime() {
    }

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "MyTime{" +
                "hour=" + hour +
                ", minute=" + minute +
                ", second=" + second +
                '}';
    }

    public void addSecond(int sec) {
        int newSecond =this.second+sec;
        if (newSecond<60) {
            this.setSecond(newSecond);
        } /*else if (newSecond == 60){
            this.setSecond(0);
            this.addMinute(this.minute+1);
        } */else {
            int newSec = newSecond%60;
            int newMin = newSecond/60;
            this.setSecond(newSec);
            this.setMinute(this.minute+newMin);
        }
    }
    public void addMinute(int min) {

    }
    public void addHour(int hou) {}
    public void subSecond(int sec) {}
    public void subMinute(int min) {}
    public void subHour(int hou) {}
}
