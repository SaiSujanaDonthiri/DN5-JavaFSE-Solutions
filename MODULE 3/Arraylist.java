import java.util.ArrayList;
import java.util.Scanner;
public class Arraylist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        System.out.println("How many names?");
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0; i<n; i++){
            System.out.println("Enter name:");
            String name=sc.nextLine();
            names.add(name);
        }
        System.out.println("Students names:");
        for(String name : names){
            System.out.println(name);
        }
        sc.close();
    }
}
