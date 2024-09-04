import java.io.*;
import java.util.Scanner;
public class Calculator
{
public static void main(String args[])
{
int a,b;
char op;
Scanner sc=new Scanner(System.in);
System.out.println("Enter 2 positive integers");
System.out.println("Enter 1st number:");
a=sc.nextInt();
System.out.println("Enter 2nd number:");
b=sc.nextInt();
System.out.println("Enter Operator:");
op=sc.next().charAt(0);
switch(op)
{
case '+':
    {
        System.out.println("Addition "+(a+b));
        break;
    }
case '-':
    {
        System.out.println("Substraction: "+(a-b));
        break;
    }
case '*':
    {
        System.out.println("Multiplication:"+(a*b));
        break;
    }
case '/':
    {
        System.out.println("Division: "+(a/b));
        break;
    }
case '%':
    {
        System.out.println("Modulo: "+(a%b));
        break;
    }
default:
{
    System.out.println("Incorrect operator");
}
}
}
}
