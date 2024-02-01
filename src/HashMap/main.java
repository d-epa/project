package HashMap;

import fashion.User;

import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        User u1=new User("kani");
        User u2=new User("jeni");
        User u3=new User("divi");
        HashMap<Integer,User>list=new HashMap<>();
        list.put(1,u1);
        list.put(2,u2);
        list.put(3,u3);
        for (Map.Entry<Integer,User>User: list.entrySet()) {
            User Userdata=User.getValue();
            Userdata.printer();
        }
    }
}
