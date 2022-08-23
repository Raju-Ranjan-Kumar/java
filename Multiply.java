import java.util.*;
class Multiply
{
    public static void main(String []arg)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter two number");
        int a=obj.nextInt();
        int b=obj.nextInt();
        int c;
        c=a*b;
        System.out.println("Multiply is "+c);
    }
}