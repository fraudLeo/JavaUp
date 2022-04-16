package Interface;

/**
 * 一个类可以同时实现多个接口
 * 这种机制弥补了java类和类之间只支持单继承,现实世界中存在多继承,java中的接口弥补了单继承带来的缺陷
 *
 * 在程序编写的时候,接口A和接口B之间虽然没有继承关系,但是写代码的时候可以互转
 * 编译器没意见但是运行时可能会出现:异常:ClassCastException异常
 */
public class InterfaceTest03 {
    public static void main(String[] args) {
        TestA a = new TestD();
        TestB b = new TestD();
        TestC c = new TestD();
        //经过测试 接口和接口之间在进行强制类型转换的时候,没有继承关系,也可以强转
        //但是一定要注意:运行时可能会出现ClassCastException异常
        //这里的意义就是调用其他接口中的方法,你需要接口转型
        TestB b2 = (TestB) a;
        b2.m2();

    }
}

interface TestA {
    void m1();
}

interface TestB {
    void m2();
}

interface TestC {
    void m3();
}

class TestD implements TestA,TestB,TestC {
    @Override
    public void m1() {

    }

    @Override
    public void m2() {
        System.out.println("m2....");
    }

    @Override
    public void m3() {

    }
}
