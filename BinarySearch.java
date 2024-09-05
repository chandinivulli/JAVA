import java.io.*;
import java.util.*;
class BinarySearch
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int pos=-1;
        System.out.println("Enter the size of the Array:");
        int n=sc.nextInt();
        System.out.println("Enter "+n+"values of the Array in Sorted Order");
        int arr[]=new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter Key element to Search");
        int key=sc.nextInt();
        int low=0;
        int high=n-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==key)
            {
                pos=mid+1;
                break;
            }
            else if(key>arr[mid])
            {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        if(pos==-1)
        {
            System.out.println("Search Unsuccessful!");
            System.out.println(key+"is not found in the Array");
        }
        else{
            System.out.println("Search Successful!");
            System.out.println(key+"is found at "+pos+" position in array");
        }
    }
}
