import java.io.*;
import java.util.*;
class LinearSearch
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int pos=-1;
        System.out.println("Enter size of the Array: ");
        int n=sc.nextInt();
        System.out.println("Enter "+n+" values of an Array: ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter Key Element to Search: ");
        int key=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i]==key)
            {
                pos=i+1;
                break;
            }
        }
        if(pos==-1)
        {
            System.out.println(key+"is not found in the Array!\nSearch Unsuccessful");
        }
        else{
            System.out.println(key+" is found at "+pos+" position in the Array");
        }
    }
}
