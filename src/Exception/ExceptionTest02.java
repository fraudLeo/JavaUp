package Exception;

/**
 * java语言中异常是以什么形式存在的呢?
 *      1.异常再java中以类的形式存在,每一个异常类都可以创建异常对象
 *      2.异常对应的现实生活中是怎样的?
 *          火灾(异常类) :
 *              小明家着火了(异常对象)
 *              小刚家着火了(异常对象)
 *              小红家着火了(异常对象)
 *          类是模板
 *          对象是实际存在的个体
 */
public class ExceptionTest02 {
    public static void main(String[] args) {

        //通过异常类实例化异常对象
        NumberFormatException nfe = new NumberFormatException("数字格式化异常");
        System.out.println(nfe);
        NullPointerException npe = new NullPointerException("空指针异常");
        System.out.println(npe);
    }

}
