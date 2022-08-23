import java.util.Scanner;
public class LargestNo
{
    public static void main(String []arg)
    {
        Scanner o1=new Scanner(System.in);
        System.out.println("Enter two number ");
        int a=o1.nextInt(); 
        int b=o1.nextInt(); 
        if(a>b)
        {
            System.out.println( a+" is grater than "+b);
        }
        else
        {
            System.out.println(b+" is grater than "+a);
        }
    }
}