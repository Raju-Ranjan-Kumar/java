import java.util.Scanner;
public class SumAvg
{
    public static void main(String arg[])
    {
       int arr[]=new int[10];
       System.out.println("Enter ten number");
       Scanner obj=new Scanner(System.in);
       for(int i=0; i<10; i++)
       arr[i]=obj.nextInt();
   
       int sum=0;
       for(int i=0; i<10; i++)
       sum=sum+arr[i];
        System.out.println("Sum is"+sum);
        float avg;
        avg=sum/10;
        System.out.println("Avg is"+avg);
    }
}