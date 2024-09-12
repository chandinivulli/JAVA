import java.io.*;
import java.util.*;
class SumAndAverage{
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
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        System.out.println("Sum of the given elemets is "+sum);
        System.out.println("Average of the given values is "+(sum/n));
    }
}
