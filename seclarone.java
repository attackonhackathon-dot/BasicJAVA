public class seclarone
{
    
    public static void main(String[]args)
    {
        int[]array={3,4,62,4,2,1,9};
        int max=array[0];
        int secondmax=array[0];
        for(int i=0;i<array.length;i++)
        {
            if(array[i]>max)
            {
                secondmax=max;
                max=array[i];
            }
            else if(array[i]>secondmax && array[i]!=max)
            {
                secondmax=array[i];
            }
        }
        System.out.println(secondmax);
    } 
}