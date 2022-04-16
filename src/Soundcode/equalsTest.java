package Soundcode;

/**
 * 关于Object类中给你的equals方法
 *  1. equals方法的源代码
 *      public boolean equals(Object obj) {
 *          return (this == obj);
 *      }
 *  2. 设计目的:
 *      通过equals方法来判断两个对象是否相等
 *
 *  3. String 这个类已经重写过equals了,所以String这个引用类型不需要使用重写覆盖
 *
 *  4. 大结论:
 *      java中什么类型的数据可以使用==判断?
 *          基本数据类型
 *      java中什么类型的数据需要使用equals判断呢?
 *          所有的引用数据类型
 *
 */
public class equalsTest {
    public static void main(String[] args) {
        int a = 100;
        int b = 100;
        //判断两个基本数据类型的数据是否相等用 == 就够用了
        //因为 == 是判断a中保存的100和b中保存的100是否相等
        System.out.println(a==b);//true

        //判断两个java对象是否相等能用==吗?
        MyTime myTime = new MyTime(2002,8,8);
        MyTime myTime1 = new MyTime(2002, 8, 8);
        //测试一下,比较两个对象是否相等,能不能用==?
        //这里的==判断的是两者的内存地址是否一样
        System.out.println(myTime1==myTime);//false
        System.out.println(myTime1.equals(myTime));
    }
}

class MyTime {
    int year;
    int month;
    int day;

    public MyTime() {
    }

    public MyTime(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    //假如我传过来了一个空值怎么办?
    /*public boolean equals(Object obj) {
        //当年相同,月相同,并且日也相同的时候,表示两个日期相同.两个对象相等
        //获取第一个日期的年月日
        int year = this.year;
        int month = this.month;
        int day = this.day;
        //获取第二个日期的年月日
        *//*int year2 ==obj.year;
        * .....这种写法不可以,因为类型不匹配
        * *//*
        //所以这边判断是否类型相等
        if (obj instanceof MyTime) {
            MyTime mt2 = (MyTime)obj;
            int year2 = mt2.year;
            int month2 = mt2.month;
            int day2 = mt2.day;
            //开始比对
            if (year==year2&&day2==day&&month==month2) {
                return true;
            }

        }
        return false;
    }*/
    //改良
    public boolean equals(Object obj) {
        if (obj==null||!(obj instanceof MyTime)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        //程序到这边,才说明obj不是null obj是MyTime类型
        //向下转型
        MyTime t = (MyTime) obj;
        return (this.year ==t.year&&this.month==t.month&&this.day==t.day) ;
    }
}
