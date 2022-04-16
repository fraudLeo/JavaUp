package Interface;
/**
    分析:
           *      中午去饭馆吃饭 这个过程有接口吗?
           *          接口是抽象的.
           *          菜单是一个接口 (菜单上有一个抽象的照片: 西红柿炒鸡蛋)
           *          谁面向接口调用 (顾客面向菜单点菜,调用接口)
           *          谁负责实现这个接口 (后台的初始负责把西红柿鸡蛋做好 是接口的实现这)
           *          这个接口有什么用的?
           *              这个饭馆的 菜单 让 顾客 和 后厨 解耦了
           *              -->顾客不用找后厨 后厨不用找顾客 他们之间完全依赖这个抽象的菜单沟通
 *
 *
 *   总结一句话:
 *      面向接口编程仍,可以降低程序的耦合度,提高程序的扩展能力,符合OCP开发原则
 *      接口 捆绑于多态
 *
 *      任何一个接口都有调用者和实现者
 *      接口可以将调用者和实现者解耦合
 *      调用者面向接口调用
 *      实现者面向接口编写
 */


/**
 * 类型和类型之间的关系
 *  is a . has a . like a
 *      is a:
 *          Cat is an Animal
 *          凡是能够满足is a 的表示"继承关系"
 *      has a:
 *          I have a pen
 *          凡是能够满足has a 关系的 表示存在 "关联关系"
 *          关联关系通常以 "属性" 的形式存在
 *      like a:
 *          Cooker like a FoodMenu
 *          凡是能够满足like a 关系的表示 "实现关系"
 *          实现关系通常是: 类实现接口
 *
 *
 *   抽象类和接口有什么区别?
 *
 *          抽象类是半抽象的
 *          接口是完全抽象的
 *
 *          抽象类中有构造方法
 *          接口中没有构造方法
 *
 *          接口和接口之间支持多继承
 *          类和类之间只能单继承
 *
 *          一个类可以同时实现多个接口
 *          一个抽象类只能继承一个类(单继承
 *
 *          接口中只允许出现常量和抽象方法
 *
 *          以后接口使用的比抽象类多,一般抽象类使用的还是少
 *          接口一般都是对 "行为" 的抽象
 *
 */
public class InterfaceTest05 {
    public static void main(String[] args) {
        //创建厨师对象
        FoodMenu cooker1 = new ChinaCooker();
        //创建顾客对象
        Customer customer = new Customer(cooker1);

        //顾客点菜
        customer.order();
    }
}
//接口:菜单,抽象的
interface FoodMenu{
    //
    void food1();
    void food2();
}
//顾客
class Customer {
    //顾客手里有一个菜单
    //Customer has a FoodMenu!
    //记住: 以后凡是能够用has a 描述的 统一以属性的方式存在
    //实例变量 属性
//    FoodMenu foodMenu = new    ;//后面的内容随便写
    FoodMenu foodMenu;
    //如果以下这样写,就表示写死了(焊接)
    //中餐厨师
    //ChinaCooker cc;
    //西餐厨师
    //WesternCooker wc;


    public Customer() {
    }

    public Customer(FoodMenu foodMenu) {
        this.foodMenu = foodMenu;
    }

    public FoodMenu getFoodMenu() {
        return foodMenu;
    }

    public void setFoodMenu(FoodMenu foodMenu) {
        this.foodMenu = foodMenu;
    }
    //点菜的方法
    public void order() {
        //先拿到菜单
        //FoodMenu foodMenu = this.getFoodMenu();//也可以直接foodMenu
        foodMenu.food1();
        foodMenu.food2();

    }
}

//中国厨师
//实现菜单上的菜
//厨师是实现者
class ChinaCooker implements FoodMenu{
    @Override
    public void food1() {
        System.out.println("中国厨师做的西红柿炒鸡蛋");
    }

    @Override
    public void food2() {
        System.out.println("中国厨师做的西冷牛排");
    }
}

//外国厨师
class WesternCooker implements FoodMenu{
    @Override
    public void food1() {
        System.out.println("西餐师傅做的西红柿炒鸡蛋");
    }

    @Override
    public void food2() {
        System.out.println("西餐师傅做的西冷牛排");
    }
}