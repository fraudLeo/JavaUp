package HomeWork.day22;

/**
 * 开放性题目:
 *      设计一个笔记本电脑类 属性随意 并且进行属性私有化 对外提供公开set get方法
 *      设计一个可插拔的接口: InsertDrawable  该接口有什么方法 自行定义
 *
 *      设计一个鼠标类
 *      设计一个键盘类
 *      设计一个显示器类
 *      设计一个打印机类
 *
 *      在"笔记本电脑类" 中有一个InsertDrawable接口属性 可以让笔记本电脑可拔插 鼠标 键盘 显示器 打印机等
 *
 *      编写程序 创建多个对象,演示接口作用
 */
public class HomeWork01 {
    public static void main(String[] args) {

        InsertDrawable device1 = new Mouse();
        Computer d1 = new Computer(device1);
        d1.link_statue(false);
        d1.use_statue(false);

        InsertDrawable device2 = new Keyboard();
        Computer d2 = new Computer(device2);
        d2.link_statue(true);
        d2.use_statue(false);
    }
}

class Computer {
    InsertDrawable id;

    public Computer() {
    }

    public Computer(InsertDrawable id) {
        this.id = id;
    }

    public InsertDrawable getId() {
        return id;
    }

    public void setId(InsertDrawable id) {
        this.id = id;
    }

    public void link_statue(boolean statue) {
        id.Linked(statue);

    }
    public void use_statue(boolean statue) {
        id.Useing(statue);
    }

}
interface InsertDrawable {
    void Linked(boolean statue);
    void Useing(boolean statue);
}

class Mouse implements InsertDrawable {

    @Override
    public void Linked(boolean link_statue) {
        if (link_statue) {
            System.out.println("Mouse is Linked!");
        } else {
            System.out.println("Mouse is disconnected!");
        }
    }

    @Override
    public void Useing(boolean use_statue) {
        if (use_statue) {
            System.out.println("Mouse is using!");
        } else {
            System.out.println("Mouse is free!");
        }
    }
}

class Keyboard implements InsertDrawable {
    @Override
    public void Linked(boolean link_statue) {
        if (link_statue) {
            System.out.println("Keyboard is Linked!");
        } else {
            System.out.println("Keyboard is disconnected!");
        }
    }

    @Override
    public void Useing(boolean use_statue) {
        if (use_statue) {
            System.out.println("Keyboard is using!");
        } else {
            System.out.println("Keyboard is free!");
        }
    }
}