//A program to accept an array of 5 elements and
// Print the element which are divisble and not divisible by x
import java.util.Scanner;
public class Arrays6
{
    int sArray[];
    int x;
    
    Arrays6 ()
    {
        sArray = new int [5];
    }
    
    void initialize ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the 5 elements for the array");
        
        for (int i = 0; i<=sArray.length-1; i++)
             sArray[i] = sc.nextInt ();
         
        System.out.println ("Enter the value of x");
        x = sc.nextInt ();
    }
    
    void divisible ()
    {
        System.out.println ("The elements divisible by x are:");
        
        for (int j = 0; j<=sArray.length-1; j++)
        {
            
            if (sArray[j]%x == 0)
                System.out.println (sArray[j]);
                
        }
        
    }
    
    void notDivisible ()
    {
        System.out.println ("The elements not divisible by x are:");
        
        for (int j = 0; j<=sArray.length-1; j++)
        {
            
            if (sArray[j]%x != 0)
                System.out.println (sArray[j]);
                
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

        
 