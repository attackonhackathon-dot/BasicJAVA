public class functions {

     public static void main(String[]args){
        A a = new A();
        B b = new B("David",78787);
        System.out.println("Name:"+" "+b.name+" "+"ID:"+" "+b.id);

    }

}
class A{
    A(){
        System.out.println("constructor called");
    }
}
class B{
   String name;
   int id;
    B(String name,int id){
        this.name=name;
        this.id=id;

    }
}