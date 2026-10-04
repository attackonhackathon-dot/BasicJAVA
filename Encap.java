public class Encap {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.setName("My Captain");
        System.out.println(obj.getName());
    }/*
    why encapsulation?
    1.security
    2.control class attributes
    3.access private attributes through get and set methods
    4.flexibility */

}
class Demo{
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String newName){
        this.name=newName;
    }

}


