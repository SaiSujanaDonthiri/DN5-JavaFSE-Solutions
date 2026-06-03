import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FileReading {
    public static void main(String[] args){
        try {
            File f = new File("filewriting.txt");
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
