import java.util.*;
class MultiDimenArr
{
    public static void main(String arg[])
    {
        int arr[][]=new int[3][3];
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number");
        for(int i=0; i<3; i++)
         for(int j=0; j<3; j++)
        arr[i][j]=obj.nextInt();
        for(int i=0; i<3; i++)
        for(int j=0; j<3; j++)
        System.out.println("Array List is: "+arr[i][j]);
    }
}