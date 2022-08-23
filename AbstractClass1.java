abstract class Person
{
    abstract void show();
}
class Students extends Person
{
    void show()
    {
        System.out.println("Hello Abstract class");
    }
}
class AbstractClass1
{
    public static void main(String args[])
    {
        Students obj=new Students();
        obj.show();
    }
}