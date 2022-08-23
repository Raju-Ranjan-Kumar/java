import java.util.Scanner;
public class Array
{
    public static void main(String []args)
    {
        int arr[]=new int[5];
        Scanner obj=new Scanner(System.in);
          System.out.println("Enter five elements");
        for(int i=0; i<5; i++)
        arr[i]=obj.nextInt();
          System.out.println("Array elements are");
        for(int i=0; i<5; i++)
          System.out.println(arr[i]);
    }
}