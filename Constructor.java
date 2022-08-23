class Constructor
{
    private int a;
    public Constructor(int b,int c)      //parametrise constructor
    {
        a=b+c;
        System.out.println("Hello Constructor "+a);
    }
    public static void main(String args[])
    {
        System.out.println("Main function execution");
        Constructor obj=new Constructor(9,8);
    }
}