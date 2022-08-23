class StringCompTo
{
    public static void main(String arg[])
    {
        String s1=new String("Raju");
        String s2=new String("raju");

 //isme pahle string ka unicode se dusre string ka unicode subtract karenge or tb compare karenge
        int i=s1.compareTo(s2);         
        if(i==0)
        System.out.println("String are same");
        else if(i>0)
        System.out.println("opositive to dictionary order");
        else 
        System.out.println("dictionary order");
    }
}