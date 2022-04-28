package HomeWork.day24;

public class Fighter extends Weapen implements Moveable,Attackable{
    @Override
    public void attack() {
        System.out.println("战斗机开炮");
    }

    @Override
    public void move() {
        System.out.println("战斗机移动");
    }
}
