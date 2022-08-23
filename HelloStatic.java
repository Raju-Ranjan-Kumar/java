class Example
{
    int x;
    public static int y;
    public void fun1()
    { System.out.println("fun1 run");  }
    public static void fun2()
    { System.out.println("fun2 run");  }
    static class Test
    {
        public static String country="India";
    }
}
 class HelloStatic
{
   public static void main(String[] args)
   {
        Example o1=new  Example();
        Example o2=new  Example();
       o1.fun1();
       Example.fun2();
       System.out.println( Example.Test.country); 
       Example.y=10;
       
   }
}