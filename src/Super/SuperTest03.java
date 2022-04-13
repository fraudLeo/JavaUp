package Super;

public class SuperTest03 {
    public static void main(String[] args) {

    }

}
class Customer{
    String name;
    public Customer() {}
    public Customer(String name) {
        super();
        this.name = name;
    }
}

class Vip extends Customer{
    public Vip(){}
    public Vip(String name) {
        super(name);
    }

    //java是怎么来区分子类和父类的同名属性的
    /*
        this.name: 当前对象的name属性
        super.name: 当前对象的父类型特征中的name属性
        在子类当中,如果没有加this. 系统会默认加上this.表示当前子类当中的变量
     */
    public void shopping() {
        //this表示当前对象
        System.out.println(this.name + "正在购物");
        //super表示的是当前对象的父类型特征,(super是this指向的那个对象中的一块啊空间.
        System.out.println(super.name+"正在购物!");
        System.out.println(name+"正在购物!");
    }
}