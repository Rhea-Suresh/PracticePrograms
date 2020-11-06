//A program to enter 5 elements in an array and 
//print the maximum and minimum numbers
import java.util.Scanner;
public class Arrays4
{
    int sArray [];
    int max = 0;
    int min = 9;
    Arrays4 ()
    {
        sArray = new int [5];
    }
    
    void initialize ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the elements of the array");
        
        for (int i = 0; i<=sArray.length - 1; i++)
             sArray[i] = sc.nextInt ();
             
    }
    
    int Maximum (int a)
    {
        if (a>=max)
            max = a;
        return max;
    }
    
    int Minimum (int b)
    {
        if (b<=min)
            min = b;
        return min;
    }
    
    void Display ()
    {
        int maximum = 0;
        int minimum = 9;
        for (int i = 0; i<=sArray.length-1; i++)
        {
            maximum = Maximum (sArray[i]);
            minimum = Minimum (sArray[i]);
        }
        System.out.println ("The maximum element in the array is " +maximum);
        System.out.println ("The minimum element in the array is " +minimum);
    }
    
    public static void main ()
    {
        Arrays4 obj = new Arrays4 ();
        obj.initialize ();
        obj.Display ();
    }
}

        
        
        
        