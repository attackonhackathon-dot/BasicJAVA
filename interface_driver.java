import java.util.Scanner;
/*
data abstraction
interface: consist of function prototype or declaration,not definition
ABC:
    call:function ,tkae 2 int inputs and return 1 int output
    max:function,takes 2 double input and return 1 double output  */
interface ABC {
    int just_for_fun(int a,int b);
    double just_for_fun_2(double a, double b);
}
class interface1 implements ABC{
    public int just_for_fun(int a,int b){
        //ADD
        return a+b;

    }
    public double just_for_fun_2(double a,double b){
        //SUB
        return (a>b)?a-b:b-a;
        
    }
class interface2 implements ABC{
    public int just_for_fun (int a,int b){
        return a*b;
    }
    public double just_for_fun_2(double a,double b){
        //DIV
        return a/b;
    
}

}
 public class interface_driver {

    public static void main(String[]args){
        interface1 obj1 = new interface1();
       System.out.println(obj1.just_for_fun(2, 5));
       System.out.println(obj1.just_for_fun_2(2.5,3.5));
       
       interface2 obj2= new interface2();
        System.out.println(obj2.just_for_fun(2, 5));
        System.out.println(obj2.just_for_fun_2(2.5,3.5));

    }


}
}