import java.util.Scanner;
public class Forloop
{
    public static void main(String[] args)
    {
        Scanner object=new Scanner(System.in);
         System.out.println("Enter the number");
        int var=object.nextInt();
        int num=var;
        for(num=var; num>0; num--)
        System.out.print(" "+num);
    }
}