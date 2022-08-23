import java.util.Scanner;
public class AvgofArray
{
    public static void main(String []arg)
    {
        int arr[]=new int[10];
          System.out.println("Enter ten values");
        Scanner obj=new Scanner(System.in);
        for(int i=0; i<10;i++)
           arr[i]=obj.nextInt();
        int sum=0;
        for(int i=0; i<10;i++)
          sum=sum+arr[i];
          System.out.println("sum is "+sum);
        float avg=sum/10;
         System.out.println("Avg is "+avg);
        
    }
}