import java.util.Scanner;
class Person
{
    public void sum()
    {
      int a,b,c;
      Scanner obj=new Scanner(System.in);
      System.out.println("Enter two number");
      a=obj.nextInt();
      b=obj.nextInt();
      c=a+b;
      System.out.println("sum of"+" "+a+" "+"and"+" "+b+" "+"is"+" "+c);
    }
}
class SingleInh extends Person
{
    public static void main(String []args)
    {
      SingleInh obj=new SingleInh();
      obj.sum();
    }
}