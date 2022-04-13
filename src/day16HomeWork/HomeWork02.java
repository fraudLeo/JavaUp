package day16HomeWork;

/**
 * 请定义一个交通工具(Vehicle) 类
 * 其中有属性:
 *      速度(speed)
 *      体积(size)等
 *      方法:
 *      移动(move)
 *      设置速度(setSpeed)
 *      加速(speedUp)
 *      减速speedDown
 *
 *      最后在测试类Vehcle中的main中实例化一个交通工具对象
 *      并通过方法给他初始化speed size的值打印出来
 *      另外调用加减速的方法对苏的进行改变
 *
 */
public class HomeWork02 {
    public static void main(String[] args) {
        //以下两种方法都可以使用
        //无参数构造方法
        Vehicle v1 = new Vehicle();
        v1.setSpeed(10);
        v1.setSize(20);
        v1.setDistance(0);

        //有参构造方法
        Vehicle v2 = new Vehicle(10, 20,0);

        v1.speedDown(10);
        v2.move(20);
        System.out.println(v1.toString());
        System.out.println(v2.toString());
    }
}


//交通工具
class Vehicle {
    private int speed;
    private int size;
    private int distance;

    public Vehicle() {
    }

    public Vehicle(int speed, int size, int distance) {
        this.speed = speed;
        this.size = size;
        this.distance = distance;
    }

    public int getSpeed() {
        return speed;
    }
    //设置速度
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "speed=" + speed +
                ", size=" + size +
                ", distance=" + distance +
                '}';
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    //交通工具的移动
    public void move(int vatiate) {
        distance+=vatiate;
    }
    /*加速*/
    public void speedUp(int variate) {
        this.speed +=variate;
    }
    /*减速*/
    public void speedDown(int variate) {
        this.speed -=variate;
    }
}