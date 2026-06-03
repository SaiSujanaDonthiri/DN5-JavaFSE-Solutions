import java.util.HashMap;
import java.util.Scanner;
public class Hashmap{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> students = new HashMap<>();
        System.out.println("How many students?");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            System.out.println("Enter ID:");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Name:");
            String name = sc.nextLine();
            students.put(id, name);
        }
        System.out.println("Enter ID to search:");
        int searchId = sc.nextInt();
        String result = students.get(searchId);
        System.out.println("Name: " + result);
        sc.close();
    }
}