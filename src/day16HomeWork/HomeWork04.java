package day16HomeWork;

/**
 * 编写java程序用于显示人的年龄和姓名
 * 定义一个人类Person该类中应该又来你哥哥四i有属性 name age
 * 定义构造方法来初始化成员数据,在定义显示display方法将姓名和年龄打印出来
 * 在main方法中创建人类的实例然后将信息显示
 */
public class HomeWork04 {
    public static void main(String[] args) {
        Person person = new Person("王磊",15);
        System.out.println(person.toString());
    }
}

class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
