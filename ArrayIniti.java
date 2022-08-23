 public class ArrayIniti
{
    public static void main(String arg[])
    {
        int arr[]=new int[5];
        arr[0]=10;
        arr[1]=15;
        arr[2]=20;
        arr[3]=25;
        arr[4]=30;
        System.out.println("Array List is: "+arr[2]);
        for(int i=0; i<5; i++)
        System.out.println("Array List is: "+arr[i]);
    }
}