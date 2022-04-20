package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 数组元素查找的两种方式:
 *   第一种方式:一个一个爱着寻找,直到找到为止
 *   第二种方式: 二分法查找,这个效率很高
 *
 *   数组工具类是自己写的,并不是sun公司的
 *   倘若受用二分法,那么就一定要确保数组是有序的,这是保障
 *   关于二分查找:
 *      10(下标为0) 11 12 13 14 ....20(下标为10)
 *      通过二分查找找到元素下标:
 *      (0+10)/2--> 中间元素的下标:5
 *      拿着中间这个元素和,目标要查找的元素进行对比
 *      被查找元素18在目前中间元素的右边,所以开始的元素下标从0变成了5+1
 *      在重新计算一个中间元素的下标
 *      (6+10)/2 -->8
 *
 *
 */
public class ArrayTest06 {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,9,10,11,12,13,14};
        int arr_length = arr.length;
        Scanner sc = new Scanner(System.in);
        int search_num = sc.nextInt();
        int first = 0;
        int last = arr_length-1;
        while(true) {
            if (search_num>arr[last]) {
                first = (last+first)/2+1;
                last = last;
            } else if (search_num<arr[last]) {
                first = first;
                last = (last+first)/2;
            }else if(search_num==arr[last]){
                System.out.println(last);
                break;
            }else {
                System.out.println(first);
                break;
            }
        }


        //需求:找到87的小标,如果没有就返回 -1
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        arr1.add(4);
        arr1.add(5);
        arr1.add(6);
        arr1.add(7);
        arr1.add(88);
        System.out.println(arr1.indexOf(8));

    }
}
