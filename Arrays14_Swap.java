// Program to accept an integer array and its size as its arguments and 
//swap the elements of every even location with its following odd location
import java.util.*;
public class Arrays14_Swap
{
    int [] nArray;
    
    Arrays14_Swap ()
    {
        nArray = new int [5];
    }
    
    void initialize ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the elements of the array");
        
        for (int i = 0; i<=nArray.length-1; i++)
             nArray [i] = sc.nextInt (); 
    }
    
    void Swap ()
    {
        int temp;
        
        for (int i = 0; i<nArray.length-1; i++)
        {
            
            if (i%2 != 0)
            {
                temp = nArray [i];
                nArray [i] = nArray [i-1];
                nArray [i-1] = temp;
            }
            
        }
        
        display ();
    }
    
    void display ()
    {
        System.out.print ("The new array after swapping is: ");
        
        for (int i = 0; i<=nArray.length-1; i++)
             System.out.print (" " +nArray[i]+ " ");
             
    }
    
    public static void main ()
    {
        Arrays14_Swap obj = new Arrays14_Swap ();
        obj.initialize ();
        obj.Swap ();
    }
} 

