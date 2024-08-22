import java.io.*;
import java.util.*;
public class evenorodd{
public static void main(String args[]){

    Scanner sc=new Scanner(System.in);

    System.out.println("Please enter the number to check even or odd");

    int number=sc.nextInt();

    String temp=number+""; //convert number to string

    char ch=temp.charAt(temp.length()-1); //get last character

    temp=ch+"";

    if(temp.equals("0") || temp.equals("2") || temp.equals("4") || temp.equals("6") || temp.equals("8"))
        System.out.println("Number is even");
    else
        System.out.println("Number is odd");
}
}
