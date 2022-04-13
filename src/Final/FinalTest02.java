package Final;

/**
 * final修饰的变量 如果变量是一个 "引用"会怎样?
 * <重点> fianl修饰的变量只能赋值一次</重点>(万变不离其宗)
 *      引用也是一个变量
 *      final修饰的引用:
 *          该引用只能指向一个对象,并且它只能永远指向该对象
 *          不能重新赋值,也不能用null来切断
 *
 *          虽然final的引用指向对象指向A后不能修改,但是可以修改对象A内部的数据
 */
public class FinalTest02 {
    public static void main(String[] args) {
        Person p1 = new Person(20);
        System.out.println(p1.age);
        //-----------------
        final Person p = new Person(30);
//        p = new Person(10);//会报错
    }
}
class Person {
    int age;
    public Person() {
    }

    public Person(int age) {
        this.age = age;
    }
}