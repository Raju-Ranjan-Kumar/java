import java.util.*;
class ScannerString
{
    public static void main(String arg[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter your Name and Roll no: ");
        String name=obj.next();
        System.out.println("Your Name is: "+name);
        int rollno=obj.nextInt();
        System.out.println("Your Rollno is: "+rollno);
    }
}