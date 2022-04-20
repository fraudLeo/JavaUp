package temp;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * 获取两天的日期,计算这两天之间的周数
 */
public class temp2 {
    public static void main(String[] args) {
        Date afterDate = new Date(System.currentTimeMillis());
//        System.out.println(afterDate);
//        String[] arr = {"周一","周二","周三","周四","周五","周六","周日"};
//        String str_week = afterDate.
        ArrayList<String> sites = new ArrayList<>();

        sites.add("周一");
        sites.add("周二");
        sites.add("周三");
        sites.add("周四");
        sites.add("周五");
        sites.add("周六");
        sites.add("周日");

        SimpleDateFormat sDF = new SimpleDateFormat("EEE");
        String afterDate_str = sDF.format(afterDate);
        int operated_weekshow = sites.indexOf(afterDate_str);
        System.out.println(operated_weekshow);
//        System.out.println(afterDate_str);//获取测试 2022-4-16

        //输入时间
        Scanner sc = new Scanner(System.in);
        String beforeDate_str = sc.next();
        //感觉不需要
       /* Date beforeDate = null;
        try {
             beforeDate= sDF.parse(String.valueOf(beforeDate_str));
        } catch (ParseException e) {
            e.printStackTrace();
        }*/
        //共10个字符
        //先截取5-6  再是8-9  然后计算如果before>after ,则计算before-12月 after-1月     2002-08-19
        //false 计算before->12月 一月->after
        boolean flag= operation_month(beforeDate_str,afterDate_str);
        if (!flag) {
            operation_day(beforeDate_str,afterDate_str);
        }
    }

    private static void operation_day(String beforeDate_str, String afterDate_str) {
    }

    private static boolean operation_month(String beforeDate_str, String afterDate_str) {
        int before = Integer.valueOf((beforeDate_str.substring(5,7)));
        int after = Integer.valueOf((afterDate_str.substring(5,7)));
        
        
        if (before>after) {
            //准备加一年
            return false;
        } else{
            return true; //否则就算正的;
        }
        
    }
}
