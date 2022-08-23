import java.util.*;
public class VectorSecond
{
    public static void main(String arg[])
    {
        Vector <String> obj=new Vector <String> ();
        obj.addElement("Raju");
        obj.addElement("Ranjan");
        obj.addElement("kumar");
        System.out.println("Vector elements are:");
        for(int i=0; i<obj.size(); i++)
        System.out.println(obj.get(i));
        System.out.println("Vector size are: "+obj.size()); 
        System.out.println("Vector capacity are: "+obj.capacity()); 
        obj.clear();
    }
}