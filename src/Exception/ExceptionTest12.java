package Exception;
/*
    之前在讲解方法覆盖的时候 遗留了一个问题
        重写之后的方法不能比重写前的方法抛出更多(更宽泛)的异常,但是可以更少
        RunTimeException除外

    throws 用在声明位置上 表示上报异常信息给调用者
    throw 手动抛出异常
 */
public class ExceptionTest12 {
}


class Animal {
    public void doSome() {

    }

    public void doOther() throws Exception {

    }
}

class Cat extends Animal {
    //java不允许子类比父类多
    //RunTimeException除外
    /*public void doSome() Exception {

    }*/

    //但是可以比doOther少,也可以小
    //比如父类是Exception 子类是NullPointException
    public void doOther() {

    }
}