package List;

import java.util.ArrayList;
import java.util.Objects;

/**
 * 测试cotains方法
 * 结论： 存放在一个集合中的类型，一定要重写equals方法
 */
public class CollectionTest03 {
    public static void main(String[] args) {

        User u1 = new User("wl");
        User u2 = new User("wl");
        User u3 = new User("wl");
        ArrayList<Object> list = new ArrayList<>();
        list.add(u1);
        list.add(u2);

        String s1 = new String("leo");
        String s2 = new String("leo");
        String s3 = new String("leo");
        list.add(s1);
        list.add(s2);
        System.out.println(list.contains(u3));//false  因为没有重写equals方法 ，所以比较地址值
        System.out.println(list.contains(s3));//true   因为String重写了equals方法，所以是比较的内容


        //如果remove？
        list.add(new Integer(10000));
        System.out.println(list.contains(10000));
        list.remove(new Integer(10000));
        System.out.println(list.contains(10000));


    }
}

class User {
    private String neme;

    public User() {
    }

    public User(String neme) {
        this.neme = neme;
    }

    //原理：只要姓名是一样的就返回true
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return neme.equals(user.neme);
    }

    @Override
    public int hashCode() {
        return Objects.hash(neme);
    }
}
