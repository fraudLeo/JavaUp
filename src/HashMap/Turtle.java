package HashMap;

public class Turtle implements Comparable<Turtle>{
    int age;

    public Turtle(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Turtle o) {
        return this.age-o.age;
    }

    @Override
    public String toString() {
        return "Turtle{" +
                "age=" + age +
                '}';
    }
}
