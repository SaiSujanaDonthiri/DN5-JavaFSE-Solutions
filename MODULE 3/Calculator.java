import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        char operation=sc.next().charAt(0);
        if(operation == '+'){
            System.out.println("Addition: "+ (a+b));
        }
        else if(operation == '-'){
            System.out.println("Subtraction: " + (a-b));
        }
        else if(operation == '*'){
            System.out.println("Multiplication: "+ (a*b));
        }
        else if(operation == '/'){
            if(b!=0){
                System.out.println("Division: " + (a/b));
            }
            else{
                System.out.println("Division by zero is not possible");
            }
        }
        else{
            System.out.println("Invalid Operator");
        }
        sc.close();
    }
}
