package DecimalFormat;

import java.text.DecimalFormat;

public class DecimalFormatTest01 {
    public static void main(String[] args) {
        //负责数字格式化
        /*
        *   # 代表的任意数字
        *   , 代表的千分位
        *   . 代表的小数点
        *   0 代表不够的时候补0
        */
        DecimalFormat decimalFormat = new DecimalFormat("###,###.000");//表示加入千分位,并保留两个小数
        System.out.println(decimalFormat.format(1234.56));

    }
}
