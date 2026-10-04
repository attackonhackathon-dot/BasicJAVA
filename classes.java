public class classes {
    public static void main(String[]args){
        Animal obj1= new Animal();
        Dog obj2=new Dog();
        Cat obj3=new Cat();
        obj1.Eat();
        obj2.Sleep();
        obj3.Sleep();
        obj2.Eat();
        obj3.Eat();
        obj2.bark();
        obj3.meow();



    }


}
class Animal{

    void Sleep(){
        System.out.println("It Will Sleep");
    }
    void Eat(){
        System.out.println("it will sleep");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("bow bow bow");
    
    super.Eat();
    super.Sleep();}


}
class Cat extends Animal{
    void meow(){
        System.out.println("meow meow");
    
    
    super.Eat();
    super.Sleep();}
}

