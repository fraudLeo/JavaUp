package WrapperClasses;

/**
 * 8种基本数据类型
 * Byte Short Integer Long Float Boolean Double Character
 *
 * 八种包装类中国你,六个都是数字对应的包装类 他们的父类都是Number 其他的对应学习
 */
public class WrapperClass02 {
    public static void main(String[] args) {
        //将123这个数据类型通过构造方法的包装类达到了: 基本数据类型向引用数据类型的转换
        //(装箱)
        Integer i = new Integer(123);
        //将引用数据类型转换为基本数据类型
        //(拆箱)
        float f = i.floatValue();
        System.out.println(f);
        Integer asd = new Integer("111");
        int dd = asd;

        //JDK1.5 之后就会自动拆装箱了,有了这个之后,Number里面的方法就用不到了
        Integer x = 100;
        int y = x;

        /**
         * java为了提高程序执行效率,将[-128到127]之间的所有包装类提前创建好,放到了一个方法区的整数型常量池中了,目的是这个区间的数据不需要再new了
         * 直接从常量池中取出来
         * 所以下面的代码128是new出来的 == 比较的是地址值
         * Cache 就是池子的意思,就是缓存机制 缓存优点是效率高,缺点是耗费内存
         * 缓存机制要重视,大型项目中的重要优化手段就是Cache缓存机制
         */
        Integer a1 = 128;
        Integer a2 = 128;

        Integer b1 = 127;
        Integer b2 = 127;

        System.out.print((a1==a2)  +" " +(b1==b2));

        //通过访问包装类的常量,来获取最大值和最小值
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
    }
}
