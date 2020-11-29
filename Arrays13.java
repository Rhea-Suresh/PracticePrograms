// A program to search for a number input by the user from an array of 10 elements
import java.util.Scanner;
public class Arrays13
{
    int [] nArray;
    int n;
    
    Arrays13 ()
    {
        nArray = new int [10];
    }
    
    void initialize ()
    {
        Scanner sc = new Scanner (System.in);
        
        System.out.println ("Enter the elements of the array");
        for (int i = 0; i<nArray.length; i++)
             nArray[i] = sc.nextInt ();
             
        System.out.println ("Enter the number to be searched");
        n = sc.nextInt ();
    }
    
    void search ()
    {
        int pos = -1;
        
        for (int i = 0; i<nArray.length; i++)
           
             if (nArray[i] == n) 
             {
                 System.out.println ("The number entered is present in the " +i+ " index position of the array");
                 pos ++;
             }
        
        if (pos == -1)
            System.out.println ("The number entered is not present in the array");
    }
    
    public static void main ()
    {
        Arrays13 obj = new Arrays13 ();
        obj.initialize ();
        obj.search ();
    }
}

        
    