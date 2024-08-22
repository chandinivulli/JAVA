import java.io.*;
import java.util.*;
class Palindrome_Or_Not
{
    public static void main(String args[])
    {
        int num,originalnum,rev=0,rem;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a positive integer to check whether it is palindrome or not:");
        num=sc.nextInt();
        originalnum=num;
        while(num>0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        if(rev==originalnum)
        {
            System.out.println("Given number "+originalnum+" is a Palindrome");
        }
        else
        {
          System.out.println("Given number "+originalnum+" is not a Palindrome");
        }
    }
}
