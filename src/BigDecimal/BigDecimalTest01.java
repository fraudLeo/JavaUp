package BigDecimal;

import java.math.BigDecimal;

/**
 * 1. bigDecimal是属于大数据,精度极高.不属于基本数据类型 属于java对象(引用数据类型
 * 是Sun提供的一个类,转么用在财务软件当中
 * 2. 注意: 财务软件中都变了是不够的
 */
public class BigDecimalTest01 {
    public static void main(String[] args) {
        BigDecimal v1 = new BigDecimal(100);
        BigDecimal v2 = new BigDecimal(200);
        //这个东西得调用方法来求和
        System.out.println(v1.add(v2));
    }

}
