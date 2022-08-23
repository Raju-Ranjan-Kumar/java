import java.util.Scanner;
public class LargestNoArray
{
    public static void main(String []arg)
    {
       
        Scanner o1=new Scanner(System.in);
        System.out.println("Enter five numbers ");
      
        int a=o1.nextInt(); 
        int b=o1.nextInt(); 
        int c=o1.nextInt(); 
        int d=o1.nextInt(); 
        int e=o1.nextInt(); 
        if(a>b && a>c && a>d && a>e )
        {
            System.out.println("Grater no is "+a);
        }
        else if(b>a && b>c && b>d && b>e)
        {
            System.out.println("Grater no is "+b);
        }
         else if(c>a && c>b && c>d && c>e)
        {
            System.out.println("Grater no is "+c);
        }
         else if(d>a && d>b && d>c && d>e)
        {
            System.out.println("Grater no is "+d);
        }
         else if(e>a && e>b && e>c && e>d)
        {
            System.out.println("Grater no is "+e);
        }
        else 
        {
            System.out.println("Please re-run the code");
        }
    }
}