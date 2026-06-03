import java.util.Scanner;
class Invalidexception extends Exception{
    Invalidexception(String message) {
        super(message);
    }
}
public class CustomException{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        try {
            if(age<18){
                throw new Invalidexception("Age must be 18 or above");
            }
            System.out.println("Eligible");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
