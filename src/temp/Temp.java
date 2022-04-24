package temp;

/**
 * 这是一个临时文件,存放我已不知道该放在哪里的代码
 */


import java.util.Random;

/**
 * 1. JDK类库的根类: Object
 *      1.1 这个老祖宗库的方法是所有子类都通用的,任何一个类都默认继承Object,就算没有直接继承,最终也会间接继承
 *      1.2 Object类中有哪些常用方法?
 *       目前会这几种给你就可以了:
 *       clone equals finalize hashcode notify toString
 *          我们去哪里寻找代码呢?
 *              第一种方法:去源代码中找 (但是这种方法比较麻烦,源代码也比较难)
 *              第二种方法: 去查阅java类库的帮助文档
 *          什么是API?
 *          应用程序编写接口
 *          整个JDK的类库就是一个JavaSE的API
 *          每一个API都会配置一套API帮助文档
 *
 */
public class Temp {
    public static void main(String[] args) {
        Random random = new Random();
        int[] ints = new int[5];
        int index = 0;
        while(index<ints.length) {
            //创建变量接受random值
            int a = random.nextInt(50);
            if(!ints.toString().contains(String.valueOf(a))) {
                ints[index++] = a;
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(ints[i]);
        }
    }


}
