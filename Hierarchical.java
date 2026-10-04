public class Hierarchical {
    public static void main (String[]args){
        Cat3 c= new Cat3();
        c.meow();
        c.eat();
        

    }



}
class Animal3{
    void eat(){
        System.out.println("Eating");
    }
}
class Dog3 extends Animal3{
    void bark(){
        System.out.println("Barking");
    }
}
class Cat3 extends Animal3{
    void meow(){
        System.out.println("meowing");
    }

}