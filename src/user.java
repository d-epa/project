import java.util.ArrayList;
import java.util.Scanner;

public class user {
    public static int count=0;
    public String userName;
    public ArrayList<String>medicineList=new ArrayList<>();
    Scanner scanner=new Scanner(System.in);
    public user(String userName){
        count++;
        this.userName=userName;
        getmedicineList();
         printmedicineList();
    }
    public void getmedicineList(){
        String medicine,count;
        while (true){
        System.out.println("Enter the medicine");
        medicine=scanner.nextLine();
        medicineList.add(medicine);
        System.out.println("Do you want to add another medicine?y/n");
        count=scanner.next();
        if (count.equals("no")){
            break;
        }scanner.nextLine();
        }
    }
public void printmedicineList() {
    System.out.println("Name:" + this.userName);
    System.out.println("=======================");
    System.out.println("medicineList");
    System.out.println("========================");
}
}


