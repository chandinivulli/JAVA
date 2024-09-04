import java.io.*;
import java.util.Scanner;
public class Primenumbers
{
public static void main(String args[])
{
int a,b,count=0;
Scanner obj=new Scanner(System.in);
System.out.println("Enter a starting positive integer:");
a=obj.nextInt();
System.out.println("Enter a ending positive integer:");
b=obj.nextInt();
System.out.println("The prime numbers in the range of "+a+" and "+b+" are:");
for(int i=a;i<=b;i++)
{
if(i==1)
continue;
if(i>0)
count=0;
for(int j=2;j<i;j++)
{
if(i%j==0)
count=1;
}
if(count==0)
System.out.println(i);
}
}
}

