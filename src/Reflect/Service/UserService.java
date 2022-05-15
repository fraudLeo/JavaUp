package Reflect.Service;

public class UserService {
    public boolean login(String name,String password) {
        if ("admin".equals(name)&&"123".equals(password)) {
            return true;
        }else {
            return false;
        }
    }

    public void loginOut() {
        System.out.println("系统已退出!");
    }
}
