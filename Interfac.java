interface I1
{
    void f1();
}
interface I2
{
    void f2();
}
class Person implements I1,I2
{
    public void f1()  {  System.out.println("Raju");    }
    public void f2()  {  System.out.println("Ranjan");    }
    public void f3()  {      }
}
class Interfac
{
    public static void main(String []arg)
    {
        I1 obj=new Person();
        obj.f1();
        // obj.f2();        //Error
        // obj.f3();        //Error

        I2 obj1=new Person();
        // obj1.f1();        //Error
        obj1.f2();        
        // obj1.f3();        //Error
    }
}