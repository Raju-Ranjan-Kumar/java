class StringLastIndex
{
    public static void main(String arg[])
    {
        String s1=new String("Computer");
        int i=s1.lastIndexOf('m',6);              //isme left see 6th index tk hi value batayega but searching right se karega
        System.out.println("index is: "+i);
        int j=s1.indexOf("ute",5);               // isme u tk ka index dene se 4 print print hoga but u se jyada index dene se -1 print karega
        System.out.println("index is: "+j);
    }
}

//LastIndexOf() method me right to left searching hoti hai but indexing left se hi hoti hai