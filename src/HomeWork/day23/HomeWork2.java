package HomeWork.day23;

import java.util.Objects;
import java.util.Stack;

/**
 * 第二题:
 *  为某个酒店编写程序:酒店管理系统,模拟定房,退房,打印所有房间状态等功能.
 *  1. 该系统的用户是酒店前台
 *  2. 酒店中所有的房间使用二维数组类模拟
 *  3. 酒店中的每一个房间都应该是一个java对象:Room
 *  4. 每一个房间应该有: 房间编号,房间属性,房间是否空闲
 *  5.
 */
public class HomeWork2 {
    public static void main(String[] args) {
        Room r1 = new Room(12, "单人间", true);
        //因为println是一个引用,所以使用的时候会自动调用toString()
        //System.out.println(r1.toString());
        System.out.println(r1);
        Hotel hotel = new Hotel();
        hotel.print();
    }
}

//酒店里面有二维数组,二维数组模拟大厦
class Hotel {

    private Room[][] rooms;
    //通过构造方法来盖楼
    public Hotel() {
        //一共有几层?每层房间类型是什么?房间编号是什么?
        //我们可以先写死.一共写三层,一层单人间,二层标准间,三层总统套房
        rooms = new Room[3][10];


        //创建30个Room对象,放到数组中
        //怎么放?
        for (int i = 0; i < rooms.length; i++) {
            String status;
            if (i==0) {
                status = "单人间";
            } else if (i==1) {
               status = "标准间";
            } else {
                status = "总统套房";
            }
            for (int j = 0; j < rooms[i].length; j++) {
                 rooms[i][j] = new Room(i*100+j,status,true);
            }
        }

    }

    //打印房间状态
    public void print() {
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                System.out.print(rooms[i][j]+" ");
            }
            System.out.println();
        }
    }

}
//房间内部类
class Room {
    //编号
    private int number;
    //房间类型
    private String type;
    //房间状态
    private boolean status;

    public Room() {
    }

    public Room(int number, String status, boolean free) {
        this.number = number;
        this.type = status;
        this.status = free;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Room)) return false;
        Room room = (Room) o;
        return getNumber() == room.getNumber() && isStatus() == room.isStatus() && getType().equals(room.getType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumber(), getType(), isStatus());
    }

    @Override
    public String toString() {
        return "房间号: " + number +
                ", 房间种类: " + type +
                ", 房间状态: " + (status?"空闲":"占用");
    }
}