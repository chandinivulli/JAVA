import java.io.*;
import java.util.*;
public class SwitchDemo{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number from 0 to 5");
        int num=sc.nextInt();
        switch(num)
        {
            case 0:
                System.out.println("You Entered Zero");
                break;
             case 1:
                System.out.println("You Entered One");
                break;
            case 2:
                System.out.println("You Entered Two");
                break;
            case 3:
                System.out.println("You Entered Three");
                break;
            case 4:
                System.out.println("You Entered Four");
                break;
            case 5:
                System.out.println("You Entered Five");
                break;
            default:
                System.out.println("You Entered Invalid Number");
        }
    }
}
