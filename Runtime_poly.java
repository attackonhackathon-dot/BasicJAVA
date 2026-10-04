public class Runtime_poly {
    public static void main(String[] args) {
        System.out.println("all from child");
        Parent a= new Child();
        a.print();
        System.out.println("call from parent");
        Parent b = new Parent();
        b.print();
        System.out.println("call from child");
        Child c= new Child();
        c.print();
        
    }/*
    runtime polymorphism
    Dynamic method dispatch
    achieved by method overriding
    method overriding is when derived class has a defenition for one of the member function of base class
 */



}
class Parent{
    void print(){
        System.out.println("Parent");
    }

}
class Child extends Parent{
    void print(){
        System.out.println("child");
    }

}