import java.io.*;
import java.util.*;
class Even_Elements_In_Unsorted_List{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the Array ");
        int n=sc.nextInt();
        System.out.println("Enter "+n+" elements of the Array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
       
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("After Sorting The elements in the array are\n");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]+" ");
        }
        System.out.println("Even Elements\n");
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2 ==0 )
            {
                System.out.println(arr[i] +" ");
            }
        }
    }
}
