import java.util.Scanner;
public class David {

   
 public static void main(String[]args){
 System.out.println("hello this is my first program");
 int[]arr=new int[5];
 arr[0]=1;
 arr[1]=2;
 arr[2]=3;
 arr[3]=4;
 arr[4]=5;
 for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]);

 }
 int a[][]={{1,5,8},{2,4,5},{8,8,9}};
 for(int j=0;j<3;j++){
    for(int k=0;k<3;k++){
        System.out.print(a[j][k]+" ");
        

    }
    System.out.println();
 }
 String demo="Hello World";
 System.out.println(demo);
 String fan="goku";
 String star="alpha";
 System.out.println(fan.concat(star));
 System.out.println(demo.length());
 System.out.println(demo.charAt(0));
 

    }

    
}
