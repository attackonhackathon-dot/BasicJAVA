/*Arrays
* 55,86,98,100,250,? 
* 0  1  2  3   4   5
* type:int
* size: 5
* syntax: int marks[5];
*/
import java.io.*;
import java.util.Scanner;
public class array {
   public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int[] marks;
    marks = new int[5];
    System.out.println("enter the marks ");
    
    for (int i=0; i<5; i++){
        marks[i]= sc.nextInt();
    }

    
    for (int i=0; i<5; i++){
        System.out.println(marks[i]+" ");

        }    }


}
