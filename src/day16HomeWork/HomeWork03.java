package day16HomeWork;

/**
 * 编写java程序模拟简单的计算器
 * 定义名为Number的类其中有两个整形数据成员n1和n2 应声明为私有
 * 编写构造方法赋予n1 n2初始值
 * 再为该类定义   加addition()  减multiplication()   除division()等公有实例方法
 *
 * 在main方法里面创建number类的对象调用各个刚发并显示计算结果
 *
 */
public class HomeWork03 {
    public static void main(String[] args) {
        Number number = new Number(14, 2);
        System.out.println(number.addition());
    }
}

class Number {
    private int n1;
    private int n2;

    public Number() {
    }

    public Number(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    @Override
    public String toString() {
        return "Number{" +
                "n1=" + n1 +
                ", n2=" + n2 +
                '}';
    }

    public int addition() {
        int res;
        res = n1+n2;
        return res;
    }

    public int subtration() {
        return n1-n2;
    }

    public int multiplication() {
        return n1*n2;
    }

    public double division() {
        return n1*1.0/n2*1.0;
    }


}
