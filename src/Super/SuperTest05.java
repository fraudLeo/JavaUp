package Super;

public class SuperTest05 {
    public static void main(String[] args) {

    }
}
class Animal {
    public void move() {
        System.out.println("Animal move!");
    }
}

class Cat extends Animal{
    public void move() {
        System.out.println("Cat Move!");
    }
    public void yiDong() {
        this.move();
        move();
        // super.不仅可以访问属性,也可以访问方法
        super.move();
    }
}
