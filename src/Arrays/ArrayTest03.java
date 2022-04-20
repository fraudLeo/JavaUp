package Arrays;
/*
        数组操作对象
 */
public class ArrayTest03 {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Animal();
        Cat cat = new Cat();
        //子类可以塞里面
        a2 = cat;
        Animal[] arr = {a1,a2};

        for (int i = 0; i < arr.length; i++) {
            //这个取出来的肯定是一个父类为Animal的对象
            //如果调用的是父类存在的方法,就不需要向下转型,直接使用父类型调用即可
            //arr[i].move();

            //如果父类不存在,那么就进行判断
            if (arr[i] instanceof Cat) {
                //那么就进行强转
                Cat c = (Cat)arr[i];
                c.catchMouse();
            } else {
                arr[i].move();
            }

        }

    }
}
class Animal {
    public void move() {
        System.out.println("move!");
    }
}
class Cat extends Animal {
    public void move() {
        System.out.println("Cat move!");
    }
    public void catchMouse() {
        System.out.println(
                "毛在抓老鼠"
        );
    }
}


