import java.util.Scanner;
public class application1 {
    public static void main(String[]args){
        int i=0;
        Scanner inp= new Scanner(System.in);
        int n=inp.nextInt();
        System.out.println("the number given is: "+n);
        while(n>0){
            int t= n%10;
            i=i+t;
            n=n/10;
        }
        System.out.println("the sum of the digits:"+i);

        
    }

}
