package Super;

import java.util.Scanner;

/**
 * 猜数字游戏
 *      一个类A有一个实例便来那个v 从键盘接收一个正整数作为实例变量v的初始值.
 *      另外再定义一个类B 对 A 的实例变量进行猜测.
 *          如果大了就提示大了
 *          小了就提示小了
 *          等于就是猜测成功
 */
public class GuessNumberGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BG bg = new BG(new AG(sc.nextInt()));

        bg.guess(sc.nextInt());

    }
}
class AG {
    private int v;
    public AG() {}
    public AG(int v) {this.v = v;}
    public void setV(int v) {this.v = v;}
    public int getV() {
        System.out.println(v);
        return v;}
}
class BG extends AG{
    //把AG作为BG的实例变量
    //通过BG来猜测AG对象的引用
    private AG ag;
    public BG() {}
    public BG(AG ag) {this.ag =ag;}
    public void setAg(AG ag) {
        this.ag = ag;
    }
    public AG getAg() {

        return ag;
    }

    //猜
    public void guess(int guessNum) {
//        System.out.println(ag);

        int v = this.getAg().getV();
        if (v==guessNum) {
            System.out.println("Success!");
        } else if (v>guessNum) {
            System.out.println("Try Bigger");
        } else {
            System.out.println("Try Smaller");
        }
    }
}
