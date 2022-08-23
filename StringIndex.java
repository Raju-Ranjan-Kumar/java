class StringIndex
{
    public static void main(String arg[])
    {
        String s1=new String("Subharti");
        int i=s1.indexOf('a');              //direct index no print kr dega
        System.out.println("index is: "+i);
        int j=s1.indexOf('a',5);            //5th index ke bad jo a hoga use print karega or nahi hoga to -1 print karega
        System.out.println("index is: "+j);
    }
}

//indexOf() method me left to right searching hoti hai