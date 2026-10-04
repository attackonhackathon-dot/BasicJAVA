public class multilev {
    public static void main(String[] args) {
        Babydog b=new Babydog();
        b.weep();
        b.bark();
        b.eat();
        

        
    }

}
class Animal2{
    void eat(){
        System.out.println("Eating");
    }

}
class Dog2 extends Animal2{
    void bark(){
        System.out.println("Barking");
    }

}
class Babydog extends Dog2{
    void weep(){
        System.out.println("Weeping");
    }


}