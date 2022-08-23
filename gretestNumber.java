import java.util.*; // package import.
import java.io; // 
class gretestNumber {
    public static void main(String []args){
        int arr[] = new int[10];
        System.out.println("enter a number");
        Scanner data = new Scanner(System.in);
        for(int i=0; i<9; i++){
           arr[i]=data.nextInt();
        }
        int mx = arr[0];
         for(int i=1; i<9; i++){ 
           if(mx < arr[i]){
               mx = arr[i];
           }
        }

        System.out.println("The gretest value is "+ mx);

    }



}