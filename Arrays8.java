// A program to supress the negative elements of an array to bottom 
// Without altering the original sequence.
// Input: 5, -4, 3, -2, 6, -11, 12, -8
// Output: 5, 3, 6, 12, 9, -4, -2, -11, -8
import java.util.Scanner;
public class Arrays8
{
    int [] nArray;
    Arrays8 (int arrSize)
    {
        nArray = new int [arrSize];
    }
    
    void initialize ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the elements of the array");
        
        for (int i = 0; i<=nArray.length-1; i++)
             nArray[i] = sc.nextInt ();
             
    }
    
    void arrange () 
    {
        int temp = 0;
        
        for (int i = 0; i<=nArray.length-1; i++)
        {
            
            for (int j = 0; j<=nArray.length-2; j++)
            { 
                if ((nArray[j]<0) && (nArray[j+1]>=0))
                {
                   temp = nArray[j];
                   nArray[j] = nArray [j+1];
                   nArray[j+1] = temp;
                }
           }
           
        }
        display ();
    }
    
    void display ()
    {
        for (int i = 0; i<=nArray.length-1; i++)
             System.out.print (" " + nArray[i] + " ");
        System.out.println ();
    }  
    
    public static void main ()
    {
        Arrays8 obj = new Arrays8 (5);
        obj.initialize ();
        obj.arrange ();
    }
}
 