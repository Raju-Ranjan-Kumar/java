class StringCompare
{
    public static void main(String arg[])
    {
        String s1=new String("Raju");
        String s2=new String("raju");

        if(s1.equals(s2))                       
        System.out.println("String are same");
        else
        System.out.println("String are not same");

        if(s1.equalsIgnoreCase(s2))               //ye method case sensitive ko remove kar deta h
        System.out.println("String are same");
        else
        System.out.println("String are not same");
    }
}