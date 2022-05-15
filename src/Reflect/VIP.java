package Reflect;

public class VIP {
    int no;
    String name;
    String birth;
    boolean sex;

    public VIP() {
    }

    public VIP(int no) {
        this.no = no;
    }

    public VIP(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public VIP(int no, String name, String birth) {
        this.no = no;
        this.name = name;
        this.birth = birth;
    }

    public VIP(int no, String name, String birth, boolean sex) {
        this.no = no;
        this.name = name;
        this.birth = birth;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "VIP{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", birth='" + birth + '\'' +
                ", sex=" + sex +
                '}';
    }
}
