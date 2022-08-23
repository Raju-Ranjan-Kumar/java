class StringEx1
{
    public static void main(String arg[])
    {
        String s1="Raju";
        String s2="Raju";
        String s3=new String("Raju");
        System.out.println("Ruselt First is: "+(s1==s2));
        System.out.println("Ruselt Second is: "+s1.equals(s2));
        System.out.println("Ruselt Third is: "+(s1==s3));        //result false, because s3 created new object
        System.out.println("Ruselt Fourth is: "+s1.equals(s3));
    }
}