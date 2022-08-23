import java.util.Scanner;
public class PositiveNegative
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter The Number");
        int num=obj.nextInt();
        if(num>0)
          System.out.println("number is positive");
        else
          System.out.println("number is negative");
    }
}