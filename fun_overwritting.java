import java.util.Scanner;
class Base{
    void call(){
        System.out.println("calling from base");
    }
    void print(){
        System.out.println("Printing from Base");
    }

}
class Derived extends Base{
    void call(){
        System.out.println("calling from derived");
    }
    void print(){
        System.out.println("Printing from derived");
    }
    void sleep(){
        System.out.println("Sleeping is derived");
    }
}
public class fun_overwritting {
    public static void main(String[]args){
        Derived obj1=new Derived();
        Base    obj2=new Base();
        Base    obj3=new Derived();
        obj1.call();
        obj2.call();
        obj3.call();
        obj1.sleep();

    }

}
