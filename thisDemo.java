import java.io.*;
import java.util.*;
public class thisDemo
{
    private int a;
    public void set_Number(int a)
    {
        this.a=a;
        System.out.println("a value is "+a);
    }
    public static void main(String[] args)
        {
            thisDemo TD=new thisDemo();
            TD.set_Number(60);
        }
    }
