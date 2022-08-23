import java.util.*;
class Students implements Runnable
{
    public void run()
    {
        int i;
        for(i=0; i<=10; i++)
        System.out.println("Thread is run class Students "+i);
    }
}
class Person implements Runnable
{
    public void run()
    {
        int j;
        for(j=0; j<=10; j++)
        System.out.println("Thread is run class Person "+j);
    }
}
public class Runnabl
{
    public static void main(String arg[])
    {
        Thread obj1=new Thread(new Students());
        Thread obj2=new Thread(new Person());
        obj1.start();
        obj2.start();
        
        // obj1.stop();
    }
}