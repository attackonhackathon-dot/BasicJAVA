import java .util.Scanner;
public class arraytask {
    void operations(){
        int[]entry;
        entry=new int[5];
        Scanner arr= new Scanner(System.in);
        for(int i=0;i<5;i++){
            entry[i]=arr.nextInt();
        }
        for(int j=0;j<entry.length;j++){
            System.out.println(entry[j]);
        }

    }
    public static void main(String[]args){
        arraytask obj1=new arraytask();
        obj1.operations();
        



    }

}
