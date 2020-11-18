//A program to accept an array of 5 elements and
// Print the element which are divisble and not divisible by x
import java.util.Scanner;
public class Arrays6
{
    int nArray[];
    int x;
    
    Arrays6 ()
    {
        nArray = new int [5];
    }
    
    void initialize ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the 5 elements for the array");
        
        for (int i = 0; i<=nArray.length-1; i++)
             nArray[i] = sc.nextInt ();
         
        System.out.println ("Enter the value of x");
        x = sc.nextInt ();
    }
    
    void divisible ()
    {
        System.out.println ("The elements divisible by x are:");
        
        for (int j = 0; j<=nArray.length-1; j++)
        {
            
            if (nArray[j]%x == 0)
                System.out.println (nArray[j]);
                
        }
        
    }
    
    void notDivisible ()
    {
        System.out.println ("The elements not divisible by x are:");
        
        for (int j = 0; j<=nArray.length-1; j++)
        {
            
            if (nArray[j]%x != 0)
                System.out.println (nArray[j]);
                
        }
        
    }
    
    public static void main ()
    {
        Arrays6 obj = new Arrays6 ();
        obj.initialize ();
        obj.divisible ();
        obj.notDivisible ();
    }
}

        
 