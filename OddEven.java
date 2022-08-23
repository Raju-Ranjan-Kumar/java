import java.util.Scanner;
public class OddEven
{
  public static void main(String[] args)
  {
    Scanner o1=new Scanner(System.in);
      System.out.println("enter the value ");
       int a=o1.nextInt(); 
      if(a%2==0)
        System.out.println("even number");
      else
        System.out.println("odd number");
  }
}