package Date;

/**
 * 获取自1970年1月1日到当前系统时间的总毫秒数
 */
public class DateTest02 {
    public static void main(String[] args) {
        //获取自1970年00:00:00 000 到当前系统时间的总毫秒数 系统默认从1970年开始
        long begin = System.currentTimeMillis();
//        System.out.println(l);
        print();
        long end = System.currentTimeMillis();
        System.out.println(end-begin);


    }

    //需求:统计一个方法执行所耗费的市场
    public static void print() {
        for (int i = 0; i < 1000000000; i++) {
//            System.out.println(i);
        }
    }
}
