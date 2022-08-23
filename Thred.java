class First extends Thread
{
    public void run()
    {
        int i;
        for(i=0; i<=10; i++)
        System.out.println("i= " +i+"Thread first");
    }
}
class Second extends Thread
{
    public void run()
    {
        int i;
        for(i=0; i<=10; i++)
        System.out.println("i= " +i+"Thread second");
    }
}
public class Thred
{
    public static void main(String arg[])
    {
        First obj1=new First();
        Second obj2=new Second();
        obj1.start();
        obj2.start();
    }
}