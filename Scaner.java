import java.util.Scanner;
public class Scaner
{
  public static void main(String[] args)
  {
    Scanner o1=new Scanner(System.in);
    System.out.println("enter the value ");
    int a=o1.nextInt(); 
    int b=o1.nextInt();
    int c=a+b;
      
    System.out.println("Sum is "+c);
  }
}