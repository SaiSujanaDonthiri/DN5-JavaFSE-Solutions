import java.util.Random;
import java.util.Scanner;
;public class Numberguessing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random r=new Random();          //creates random object 
        int randomnumber=r.nextInt(100)+1;
        int guess;
        while (true) { 
            System.out.println("Guess a number between 1 and 100: ");
            guess=sc.nextInt();
            if(guess>randomnumber){
                System.out.println("Too High");
            }
            else if(guess<randomnumber){
                System.out.println("Too Low");
            }
            else{
                System.out.println("Correct Guess");
                break;
            }
        }
        sc.close();

    }
}
