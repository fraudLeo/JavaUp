package Exception;

/**
 * finally 面试题
 */
public class ExceptionTest09 {
    public static void main(String[] args) {
        int result = m();
        System.out.println(result);//返回的就是100
    }

    /**
     *  java语法规则(有一些语法是不能被破坏的)
     *      方法体中的代码,必须遵循自上而下的顺序执行!
     *  所以返回的必须就是100
     *      return语句一定是是最后一个执行的,一旦执行,整个方法就必须结束
     *
     */
    public static int m() {
        int i = 100;
        try {
            return i;
        } finally {
            i++;
        }
//        return i;
    }
}
/*
反编译之后的效果:
    public static int m() {
    int i = 100;
    int j = i;
    i++;
    return j;
    这里返回的是j而不是i
 */