package Super;

/**
 *
 */
public class SuperTest04 {


    //静态方法 主方法
    public static void main(String[] args) {
        SuperTest04 st = new SuperTest04();
        st.doSome();
    }
    //实例方法
    private void doSome() {

        //output:Super.SuperTest04@119d7047
        System.out.println(this);
//        //输出引用的时候 会自动调用引用的toString方法
//        System.out.println(this.toString());

        //编译错误:需要'.',没有这种语法
//        System.out.println(super);

    }
}
class A4 {
    public void empty() {

    }
}