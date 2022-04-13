package Super;

/*
    在java语言中,不管new什么对象,最后 Object类的无参数构造方法一定会执行
 */
public class SuperTest02 {
    public static void main(String[] args) {
        new C1();
    }
}
class A1 {
    public A1() {
        System.out.println("A的无参构造函数执行");                           //1
    }
}

class B1 extends A1 {
    public B1() {
        System.out.println("B的无参构造方法执行");
    }
    public B1(String name) {
        //这里会默认有super()
        System.out.println("B类的有参数构造执行(String)");                   //2
    }
}

class C1 extends B1 {
    public C1() {
        this("zhangsan");
        System.out.println("C的无参构造函数方法!");                          //5
    }
    public C1(String name) {
        this("zhangsan",2);
        System.out.println("C的有参构造函数(String)");                        //4
    }
    public C1(String name,int id) {
        super(name);
        System.out.println("C的有参构造函数(String,int)");                    //3
        //这边执行完准备执行无参构造的时候,发现无参构造里面还调用了有参构造.
    }
}


