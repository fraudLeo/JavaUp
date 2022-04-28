package HomeWork.day24;

/**
 * 开放性题目 随意发挥
 *  写一个类Army 代表一支军队 这个类有一个属性Weapon数组w（用来储存该军队所拥有的所有的武器—）
 *  该类还提供一个构造方法，在构造方法里面通过传一个int类型的参数来限定该类所能拥有的最大武器数量
 *  并用这一大小来初始化数组w
 *
 *  这个类还提供一个方法addWeapon（Weapon wa） 代表把参数wa所代表的武器加入到数组w中，在这个类
 *  中还定义两个方法attackAll() 让所有武器都进行攻击
 *  以及一个moveAll（让w数组中的所有可移动武器移动
 *  写一个主方法去测试以上程序。
 *
 *  提示：
 *  Weapon是一个父类，应该有很多子武器
 *  这些子武器应该是有一些可移动的，有一些是可以攻击的
 */
public class HomeWork01 {
    public static void main(String[] args) {
        Army army = new Army(3);
        //创建武器对象
        Tank tank = new Tank();
        Fighter fighter = new Fighter();
        GaoShePao gaoShePao = new GaoShePao();
        //添加武器
        try {
            army.addWeapen(tank);
            army.addWeapen(fighter);
            army.addWeapen(gaoShePao);
        } catch (AddWeapenIndexOutofBoundException e) {
            e.getMessage();
        }

        //让所有可移动的移动
        army.moveAll();
        //让所有可攻击的攻击
        army.arrackAll();
    }
}


