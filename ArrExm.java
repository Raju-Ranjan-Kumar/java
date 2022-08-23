import java.util.*;
class ArrExm
{
    public static void main(String arg[])
    {
       int arr[]=new int[6];
       Scanner obj=new Scanner(System.in);
       System.out.println("Enter Six number: ");
       for(int i=0; i<=5; i++)
       arr[i]=obj.nextInt(); 
       for(int i=0; i<=5; i++)
       System.out.println("Array is: "+arr[i]);
    }
}