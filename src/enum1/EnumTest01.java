package enum1;

/**
 * 分析一下程序在设计方面有什么缺陷?
 *
 */
public class EnumTest01 {
    public static void main(String[] args) {
        System.out.println(divide(1,2));
        Result r = divide1(1,2);
        System.out.println(r== Result.SUCCESS?"计算成功":"计算失败");
    }

    //以下程序 计算两个int类型的数据 计算成功返回1,失败返回0  例如被0除的时候
    public static boolean divide(int a, int b) {
        try {
            int c = a/b;
            return true;
        } catch (Exception e){
            return false;
        }
    }
    /*
    * 思考:   以上的这个方法设计没有问题,返回true和false表示两种情况 但是在以后的开发中有可能遇到
    * 一个方法的执行结果可能包括三种情况 等 但是每一个都是可数情况的 所以就可以枚举出来 boolean就无法满足了
    * 这个时候就要使用java语言中的枚举类型
    *
    * */
    //使用枚举
    public static Result divide1(int a, int b) {
        try {
            int c = a/b;
            return Result.SUCCESS;
        } catch (Exception e){
            return Result.FAIL;
        }
    }
}

//编译之后也是生成class文件
//也是一种数据引用类型
//枚举中的每一个值都可以看作是一个常量
enum Result {
    SUCCESS,FAIL;


}
