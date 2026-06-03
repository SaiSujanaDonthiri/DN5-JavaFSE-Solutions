import java.io.FileWriter;
import java.util.Scanner;
public class FileWriting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        try {
            FileWriter f = new FileWriter("filewriting.txt");
            f.write(s);
            f.close();
            System.out.println("Data written successfully");
        } catch (Exception e) {
            System.out.println("Error writing in file.");
        }
        sc.close();
    }
}
