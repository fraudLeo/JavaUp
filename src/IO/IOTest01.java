package IO;

/**
 * IO流的分类:
 *      有多种分类方式:
 *          一种方式是按照流的方向进行分类:
 *              以内存作为参照物,
 *                  往内存中去,叫做输入,或者叫做读
 *                  从内存中出来,叫做输出或者叫做写
 *          一种方式是按照读取数据方式不同进行分类:
 *              有的流按照字节的方式读取数据,一次读取一个自己,等同于一次读取8个二进制位,
 *              这种流是万能的,什么文件类型都可以读取,包括:文本文件,图片,声音文件
 *               假设文件a.txt 采用的是字节流:
 *                  a中国bc张三fe
 *                  第一次读:一个字节,刚好到 'a'
 *                  第二次读:一个字节,刚好读到'中'字符的一半
 *                  第三次读:一个字节,刚好读到'中'字符的另外一半.
 *              (因为汉字占2-3个字节,英文字母占用1个字节)
 *              有的流是按照自符的方式读取的,一次读取一个字符,这种流是为了方便读取文本文件而存在的,这种六不能读取图片,声音,视频等文件,只能读取纯文本文件
 *              不可读取word文件
 *                   假设文件a.txt 采用的是字节流:
 *  *                  a中国bc张三fe
 *  *                  第一次读:'a'
 *  *                  第二次读:'中'字符
 *  *                  第三次读:'b'
 *
 *  综上所述:流的分类
 *      输入流,输出流
 *      字节流,字符流
 *
 * JAVA中的IO流都已经写好了,我们只需要调用就行了
 *      重点的四大IO流类(都是抽象类
 *      InputStream    字节输入
 *      OutputStream    字节输出
 *      Reader      字符输入
 *      Writer      字符输出
 *      只要以Stream结尾的就是字节流,只要一Reader,Writer结尾的就是字符流
 *
 *      当所有流都实现了之后,Closeable是可以关闭的,都是由close方法的,流毕竟是一个管道,会占用
 *      所以用完之后要关闭
 *      所有的输出流都实现了Flushable接口,都是可以刷新的,都有flush()方法
 *      在输出流最终输出后一定要flush()刷新一下,这个刷新表示将通道/管道当中剩余未输出的数据强行输出玩,刷新的作用就是清空数据
 *      如果没有flush()可能回到书数据丢失
 *
 *      IO包下需要掌握的流有六个
 *      文件专属
 *      FileInputStream
 *      FileOutputStream
 *      FileReader
 *      FileWriter
 *
 *      转换流:    将字节流转换成字符流
 *      InputStreamReader
 *      OutputStreamWriter
 *
 *      缓冲流专属:
 *      BufferedReader
 *      BufferedWriter
 *      BufferedInputStream
 *      BufferedOutputStream
 *
 *      数据流专属:
 *      DataInputStream
 *      DataOutputStream
 *
 *      标准输出流:
 *      PrintReader
 *      PrintWriter
 *
 *      对象专属流
 *      ObjectInputStream
 *      ObjectOutputStream
 *
 */
public class IOTest01 {
    public static void main(String[] args) {

    }
}
