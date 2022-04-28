package HomeWork.day24;

/**
 * 坦克是武器，可移动 可射击
 */
public class Tank extends Weapen implements Moveable,Attackable{

    @Override
    public void attack() {
        System.out.println("坦克开炮");
    }

    @Override
    public void move() {
        System.out.println("坦克移动");
    }
}
