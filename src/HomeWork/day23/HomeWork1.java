package HomeWork.day23;

import java.util.Objects;

/**
 * 编写程序: 使用一维数组,模拟栈数据结构.
 * 要求:
 *  1. 这个栈可以储存java中的任何引用类型的数据
 *  2. 在栈中提供push方法模拟压栈(满了有提示信息)
 *  3. 在栈中提供pop方法模拟弹栈(空了也有提示信息)
 *  4. 编写测试程序,new栈对象,调用push pop方法来模拟动作
 */
public class HomeWork1 {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(new Object());
        myStack.pop();

    }
}

class MyStack {
    Object[] elements = new Object[100];
    //栈帧(永远指向栈顶部)
    //每加一个元素,栈帧+1
    //反之,-1
    int index = 0;
    public MyStack() {
    }

    public MyStack(Object[] elements) {
        this.elements = elements;

    }


    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }
    public void push(Object obj) {
        int indexTemp = index;
        if (indexTemp>=99) {
            System.out.println("栈满了,容不下了");
            return;
        }
        elements[index++] = obj;
        System.out.println("压栈成功,栈帧指向: "+obj.toString()+"现在栈里面还有"+(indexTemp+1)+"个元素");
    }
    public void pop() {
        int indexTemp = index;
        if (indexTemp<=0) {
            System.out.println("已经空栈了");
            return;
        }
        elements[index--] =null;
        System.out.println("弹栈成功,栈帧指向: "+elements[index].toString()+"现在栈里面还有"+(index+1)+"个元素");
    }
    public void showStack() {
        for (int i = index-1; i >=0 ; i--) {

            System.out.println(elements[i]);
        }
    }
}
