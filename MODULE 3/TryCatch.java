import java.util.Scanner;
public class TryCatch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
            int result = a/b;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Cant divide by 0");
        }
        sc.close();
    }
}
