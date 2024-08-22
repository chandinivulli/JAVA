import java.io.*;
import java.util.*;
class EvenOrOdd{
public static void main(String[] args)
{
int num;
System.out.println("Enter an positive integer to check even or odd: ");
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
if(num % 2 == 0)
{
System.out.println(num+ "is even integer");
}
else
{
System.out.println(num+ "is odd integer");
}
}
}
