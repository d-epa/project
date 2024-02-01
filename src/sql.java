import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;


public class sql {
    public static void main(String[] args) throws  Exception{
        String url="jdbc:mysql:/localhost:3307/student";
        String Username="root";
        String password="root";
        String query="select * from student";
        Class.forName( "com.mysql.cj.jdbc.Driver");
                Connection connection= DriverManager.getConnection(url,Username,password);
        System.out.println("Connection Established Successfully");
        String qu="create table User_student(\n"+"id int,\n"+"name varchar(200));";
        Statement Statement= connection.createStatement();
        Statement.execute(qu);
        connection.close();
        System.out.println("Connection closed....");
        }
    }

