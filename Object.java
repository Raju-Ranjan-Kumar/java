public class Object
{
    private int Length,Breadth,Height;
    public void SetDimension( int l,int b,int h)
    {
       Length=l; Breadth=b; Height=h;
    }
    public void ShowDimension()
    {
        System.out.println("L="+ Length);
        System.out.println("B="+ Breadth);
        System.out.println("H="+ Height);
    }
    public static void main(String[] args)
    {
       Object obj=new Object();
       obj.SetDimension(11,22,33);
       obj.ShowDimension();
    }
}
