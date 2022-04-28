package HomeWork.day24;

public class Army {
    private Weapen[] weapens;

    public Army() {
    }

    /**
     * 创建军队的构造方法
     * @param count
     */
    public Army(int count) {
        //动态初始化数组中的每一个元素默认值是null
        //武器数组是有了，但是这里面没有武器
        weapens = new Weapen[count];
    }

    public void addWeapen(Weapen wa) throws AddWeapenIndexOutofBoundException {
        for (int i = 0; i < weapens.length; i++) {
            if (null ==weapens[i]) {
                 weapens[i] = wa;
                 return;
            }
        }
        //如果程序执行到这里，就说明武器没有添加成功
        throw new AddWeapenIndexOutofBoundException("武器以达到上限！");
    }
    public void arrackAll() {
        for (int i = 0; i < weapens.length; i++) {
            if (weapens[i] instanceof Attackable) {
                Attackable attackable = (Attackable) weapens[i];
                attackable.attack();
            }
        }
    }
    public void moveAll() {
        for (int i = 0; i < weapens.length; i++) {
            if (weapens[i] instanceof Moveable) {
                Moveable moveable = (Moveable) weapens[i];
                moveable.move();
            }
        }
    }
}
