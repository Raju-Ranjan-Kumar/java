import java.util.*;
public class VectorClas
{
    public static void main(String []arg)
    {
        Vector <String> obj=new Vector <String> ();
        obj.addElement("Raju");
        obj.addElement("Ranjan");
        obj.addElement("Kumar");
        System.out.println("Vector elements are: "+obj);
        System.out.println("Vector size are: "+obj.size());
         //bydefault capacity is 10, when full the capacity then automatically 20 means double the capacity 
        System.out.println("Vector capacity are: "+obj.capacity());   
    }
}