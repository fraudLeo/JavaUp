package Arrays;

/**
 * 数组这种数据结构的优缺点是什么?
 *  优点:
 *      查询/查找/检索某个下标上的元素是效率极高.可以说是查询效率最高的数据结构
 *      为什么检索效率高?
 *          1. 每个元素的内存地址在空间储存上是连续的
 *          2. 每个元素类型相同,所以占用空间大小一样
 *          3. 知道第一个元素地址,知道每一个元素占用的空间大小,又知道下标,所以通过一个数学表达式可以计算出某个下标上的内存地址.
 *          直接通过内存地址定位元素,所以数组的检索效率是最高的.
 *
 *          数组中存储100个元素,或者存储100万个元素,在元素查询/检索方面,效率是相同的,因为数组中元素查找的时候不会一个一个去寻找,
 *          是通过数学表达式算出来的,直接定位
 *
 *  缺点:
 *      1. 不方便修改
 *          由于为了保证数组中每个元素的内存地址连续,所以在数组上随即删除或者增加元素的时候,效率较低,因为会涉及到位移操作
 *      2. 不能储存大容量数据
 *          因为很难在内存空间上找到一块特别大的连续的内存空间
 *
 *
 * 在main方法里面会有String[] args
 *
 */
public class ArrayTest01 {
    //这个方法程序员负责写出来,JVM负责调用,JVM调用的时候一定会传来一个String数组过来
    public static void main(String[] args) {
        //JVM默认传递过来的这个数组对象长度默认为0
        //通过测试的出:args不是null
        System.out.println("JVM传递过来的数组长度是:"+args.length);

        //以下这一行代码表示的含义: 数组对象创建了,但是数组中没有任何数据
        //String[] strs = new String[0];
        //String[] strs = {};
        //printLength(strs);

        //args数组是什么时候才会有值呢?
        //其实这个数组是留给用户的,用户可以在控制台上输入参数,这个参数会被自动转换为String[] args
        //例如这样运行程序:(cmd里面) java ArrayTest01 abc def xyz
        //那么这个时候JVM就会自动将abc def xyz 通过空格的方式进行分离,自动方法哦args里面
        //所以main方法上面得数组主要是用来接收用户输入参数的

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
    public static void printLength(String[] args) {
        System.out.println(args.length);
    }
}
