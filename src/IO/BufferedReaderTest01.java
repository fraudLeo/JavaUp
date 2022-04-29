package IO;

import java.io.*;

/*
*BufferedReader:
*   带有缓冲区的字符输入流
*   使用这个六的时候不需要自定义char数组,或者说不需要自定义byte数组,自带缓冲
*
*
* */
public class BufferedReaderTest01 {
    public static void main(String[] args) throws Exception {
        //当一个流的构造方法中需要一个流的时候,被传进来的流叫做:节点流
        //外部负责包装的这个流叫做:包装流,还有一个名字叫做:处理流
        //对于当前这个程序,FileReader就是一个节点流,BufferedReader就是包装六/处理流
        //字符流
        FileReader reader = new FileReader("E:\\JavaUp\\src\\IO\\BufferedReaderTest01.java");
        //字节流
        FileInputStream fis = new FileInputStream("E:\\JavaUp\\src\\IO\\BufferedReaderTest01.java");
        //这个时候就可以用上转换流了
        InputStreamReader inputStreamReader = new InputStreamReader(fis);

        BufferedReader br = new BufferedReader(reader);//这里只能传字符流
        //因为Reader是一个抽象类,所以括号里面不能直接添加Reader
        BufferedReader br2 = new BufferedReader(inputStreamReader);//这里只能传字符流
       /* //读一行:
        String firstLine = br.readLine();
        System.out.println(firstLine);*/
        //更快捷
        String s = null;
        while((s = br2.readLine())!=null) {
            //
            System.out.print(s);
        }


        //只需要关闭外面的BufferedReader流,因为再关闭的同时,里面的流也是会关闭的,
        //因为构造方法里面对节点赋了值,对于包装流来说,只要关闭外面的
        br.close();
    }
}
