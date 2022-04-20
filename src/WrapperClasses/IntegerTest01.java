package WrapperClasses;

public class IntegerTest01 {
    public static void main(String[] args) {
        //Integer的重点方法:  praseInt
        //静态方法 传参String 返回int
        int retValue = Integer.parseInt("123");
        System.out.println(retValue);


        /**
         * String-->int: Integer.parseInt()
         * int-->String: String.valueOf()
         *
         * int-->Integer:装箱 Integer.valueOf()
         * Integer-->int:拆箱intValue()
         *
         * String-->Integer: Integer.valueOf()
         * Integer-->String: String.ValueOf()
         */
    }
}
