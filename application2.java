import java.util.Scanner;
public class application2 {
    public static void main(String[]args){
        Scanner data = new Scanner(System.in);
        int Age = data.nextInt();
        if(Age>=18){
            System.out.println("Eligible for voting");
     }
        else if(Age<18){
            System.out.println("Not Eligible to vote");
            System.out.println("you have to wait for "+(18-Age)+" Years");
        
 
        }
        else{
            System.out.println("Invalid Input");
        }
        
           }

}
