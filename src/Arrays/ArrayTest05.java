package Arrays;

/**
 * 关于java数组中的二维数组
 *  1. 二维数组其实是一个特殊的一维数组,特殊在这个一维数组当中的每一个元素都是一副个一维数组
 *  2. 三维数组就是一个特殊的二维数组
 *  3. 二维数组静态初始化
 */
public class ArrayTest05 {
    public static void main(String[] args) {
        //一维数组
        int[] array = {100,200,300};

        //二维数组,一维数组里面的元素村方法是一维数组
        int[][] twoArray = {{100,200,300},
                            {10,20,30},
                            {1,2,3}
                            };
    }
}
