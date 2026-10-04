public class Compilepolymorphism {
    public static void main(String[]args){
        Com_poly o1= new Com_poly();
        System.out.println(Com_poly.mul(1.3,1.4));
        System.out.println(Com_poly.mul(1.3,1.4,4.5));
        System.out.println(Com_poly.mul(1,2));
    

    



    }
/*[polymorphism]
1.Compile Time polymorphism ==> nothing but function overloading 
functions with same name differs in Arguments types and number

2.Run time polymorphism ==>function overridding while inheritence we will use the diiferent instance for different methods wich involves inheitence
*/
}
class Com_poly{
    static double mul(double a , double b){
        return a*b;

    }
   static double mul(double a,double b,double c){
       return a*b*c;
   }
   static int mul(int a, int b){
    return a*b;
   }
}