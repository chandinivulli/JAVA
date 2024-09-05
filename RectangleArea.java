import java.io.*;
import java.util.*;
class RectangleArea
{
    int l,b;
    int area()
    {
        return l*b;
    }
}
public class RectangleMain
{
    public static void main(String args[])
    {
        RectangleArea RA=new RectangleArea();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length and breadth of the Rectangle: ");
        RA.l=sc.nextInt();
        RA.b=sc.nextInt();
        System.out.println("Area of the Rectangle is "+RA.area());
    }
}
