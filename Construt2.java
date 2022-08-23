public class Construt2
{
    private int l,b,h;
    public Construt2()                               //Default constructor
    {
        System.out.println("it is first constructor");
        l=4; b=5; h=6;
        System.out.println("l= "+l);
        System.out.println("b= "+b);
        System.out.println("h= "+h);
    }
    public Construt2(int A, int B, int C)             //parametrise constructor  
    {
        System.out.println("it is second constructor");
        l=A; b=B; h=C;
        System.out.println("l= "+l);
        System.out.println("b= "+b);
        System.out.println("h= "+h);
    }
    public static void main(String []arg)
    {
        Construt2 obj1=new  Construt2();
        Construt2 obj2=new  Construt2(10,20,30);
    }
}