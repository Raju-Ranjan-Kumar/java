class Person
{
    public void f1()
    {
        System.out.println("Hello Raju");
    }
}
class Students extends Person
{
    public void f1()
    {
        super.f1();                                //f1 method call of person class
        System.out.println("You are welcome");
    }
}
class SuperK
{
    public static void main(String []arg)
    {
        Students obj=new Students();
        obj.f1();
    }
}