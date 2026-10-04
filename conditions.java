public class conditions {
    int num;
    conditions(){
        this.num=0;
    }
    conditions(int n){
        this.num=n;

    }
    public void check(){
        if(this.num>0){
            System.out.println("POSITIVE");
        }
        else if(this.num==0){
            System.out.println("ZERO");
        }
        else{
            System.out.println("NEGATIVE ");
        }
    }
    public static void main(String[]args){
        conditions obj1=new conditions(5);
        conditions obj2 =new conditions(-3);
        conditions obj3 =new conditions(0);
        obj1.check();
        obj2.check();
        obj3.check();

    }

}
