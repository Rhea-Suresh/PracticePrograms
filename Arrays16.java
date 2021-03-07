// A program to input an array of 15 integers and 
// Find the difference between the sum of even and odd positioned elements 
import java.util.Scanner;
public class Arrays16
{
    int [] nArray;
    int sum1 = 0; 
    int sum2 = 0;
    int diff;
    Arrays16 ()
    {
        nArray = new int [15];
    }
    
    void Initialize ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the elements of the array: ");
        for (int i = 0; i<nArray.length; i++)
             nArray [i] = sc.nextInt ();
    }
    
    void Sum ()
    {
        
        for (int i = 0; i<nArray.length; i++)
        {
            if (i%2 == 0)
                sum1 = sum1 + nArray[i];
            else 
                sum2 = sum2 + nArray[i];
        }
    }
    
    void Display ()
    {
        System.out.println ("The sum of all odd positioned elements is " +sum2);
        System.out.println ("The sum of all even positioned elements is " +sum1);
        int diff = sum2 - sum1;
        System.out.println ("The difference is " +diff);
    }
    
    public static void main ()
    {
        Arrays16 obj = new Arrays16 ();
        obj.Initialize ();
        obj.Sum ();
        obj.Display ();
    }
}

        