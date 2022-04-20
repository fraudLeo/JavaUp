package String;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class StringTest02 {
    public static void main(String[] args) {

        System.out.println("abc".compareTo("abc"));//0
        System.out.println("abcd".compareTo("abce"));//-1前小后大
        System.out.println("abce".compareTo("abcd"));//1前大后小
        //拿字符串第一个字母和后面的字符串的第一个字母作比较,倘若能分出胜负就不再比较了
        System.out.println("xyz".compareTo("yxz"));//-1


        //contains
        System.out.println("hello world.java".contains(".java"));//返回是否包含元素

        //endsWith,判断字符串是否以...结尾
        System.out.println("hello world.java".endsWith("a"));
        System.out.println("hello world.java".endsWith("va"));
        System.out.println("hello world.java".endsWith("ava"));

        //判断来两个字符串是否相等,并且同时忽略大小写
        System.out.println("ABc".equalsIgnoreCase("abC"));

        //将字符串转化为字节数组
        byte[] bytes = "abcdef".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

        //indexOf 判断某个字符串在当前字符串第一次出现的位置
        System.out.println("asdasdtddde".indexOf("dt"));

        //isEmpty 判断是否为空
        System.out.println("asda".isEmpty());

        //LastIndexOf 判断某个字符串在当前字符串最后一次出现的位置
        System.out.println("oraclejavac++javac#phppython".lastIndexOf("java"));

        //replace    replace(CharSequence target, CharSequence replacement) 将原字符串中的某个元素固定替换成后面的,可以替换多个
        //String 的父类就是CharSequence
        String newString = "http://www.baidu.com".replace("http:","https");
        System.out.println(newString);


        //split 拆分字符串
        String[] ymd = "1990-10-11".split("-");
        for (int i = 0; i < ymd.length; i++) {
            System.out.print(ymd[i]+" ");
        }
        System.out.println("\n");


        //startsWith 判断某个字符串是否以某个字符串开头
        System.out.println("wlasdads".startsWith("wl"));

        //subString  截取字符串  包括起始索引,不包括结束索引
        System.out.println("http://www.baidu.com".substring(7,10));

        //toCharArray 将字符串转化为字符数组
        char[] arr_toCharArray = "asdasdadsasdasda".toCharArray();
        for (int i = 0; i < arr_toCharArray.length; i++) {
            System.out.print(arr_toCharArray[i]+" ");
        }
        System.out.println(" ");

        //tolowerCase 将字符串全部转换成小写
        System.out.println("asdaASDASD".toLowerCase(Locale.ROOT));

        //toUpperCase 将字符串全部转换成大写
        System.out.println("asdaASDASD".toUpperCase(Locale.ROOT));


        //trim  去除字符串前后空格
        System.out.println("       asdad  asda       ".trim());

        //String 中只有一个方法是静态的,不需要new对象  叫做 valueOf 将非字符串转换为字符串
        String str_valueOf = String.valueOf(12312);
        System.out.println(str_valueOf);
        //这个静态的valueOf能否调用里面的toString?
        String s = String.valueOf(new Customer());
        System.out.println(s);//不会,任然是object里面的原始toString 因为没有重写覆盖
        //本质上sout 这个方法在输出任何数据的时候都是先转换成字符串再进行输出,所以输出一个引用的时候,会调用toString(0方法
    }
}
class Customer {

}