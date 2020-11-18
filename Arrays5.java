// A program to accept an array with 10 elements 
// and display the even and odd numbers seperately
import java.util.Scanner;
public class Arrays5 
{
    int [] nArray;
    
    Arrays5 ()
    {
        nArray = new int [10];
    }
    
    void initialize ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the 10 elements for the array");
        
        for (int i = 0; i<=nArray.length-1; i++)
            nArray[i] = sc.nextInt ();
            
    }
    
    void Even ()
    {
        System.out.println ("The even elements in the array are:");
        
        for (int i = 0; i<=nArray.length-1; i++)
        {
            
            if (nArray[i]%2 == 0)
                System.out.println (nArray[i]);
                
        }
    }
    
    void Odd ()
    {
        System.out.println ("The odd elements in the array are:");
        
        for (int i = 0; i<=nArray.length-1; i++)
        {
            
            if (nArray[i]%2 != 0)
                System.out.println (nArray[i]);
                
        }
    }
    
    public static void main ()
    {
        Arrays5 obj = new Arrays5 ();
        obj.initialize ();
        obj.Even ();
        obj.Odd ();
    }
}

    