import fashion.User;

import java.util.ArrayList;
import java.util.Scanner;

public class userList {
    public int totalUsers = user.count;
    public ArrayList<user> users = new ArrayList<>();

    public userList() {

    }

    public void runProgram() {
        String count=null,name;
        System.out.println("Enter the customer name");
        while (true) {
            System.out.println("Do you want to continue?yes/no");
            if (count.equals("no")){
                break;
            }
        }
    }

    public void printAllUser() {
        System.out.println("All User");
        for (user user:users){
            System.out.println(user);
        }
    }
}
