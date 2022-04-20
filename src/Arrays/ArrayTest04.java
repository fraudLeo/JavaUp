package Arrays;

/**
 * 数组扩容效率低 因为涉及到拷贝问题所以在以后的开发中请注意:尽可能减少数组的拷贝
 * 可以创建数组对象的时候预估一下多长合适,这样可以减少扩容次数.提高效率
 */
public class ArrayTest04 {
    public static void main(String[] args) {
        //java数组的拷贝
        //因为数组创建了之后长度无法改变,所以当发现数组超额了就可以利用数组拷贝来进行数据的转移
        int[] arr = {1,11,22,3,4};
        int[] dest = new int[20];
        //               源   起始位置  目标数组   目标起始位置    长度
        System.arraycopy(arr,1,dest,3,       2);


        Object[] objs = {new Object(),new Object(),new Object()};
        Object[] newObjs = new Object[20];
        //这里拷贝的是地址,不会是新的对象
        //所以打印出来也是地址s
        System.arraycopy(objs,0,newObjs,0,objs.length);
    }
}
