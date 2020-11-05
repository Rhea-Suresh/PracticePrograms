// A program to input an array of 5 numbers and print only the prime numbers
import java.util.Scanner;
public class Arrays3
{
    int sArray [];
    Arrays3 ()
    {
        sArray = new int [5];
    }
    
    void initialize ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the 5 numbers for the array");
        
        for (int i = 0; i<=sArray.length - 1; i++)
             sArray[i] = sc.nextInt ();
             
    }
    
    void display ()
    {
        int count = 0;
        for (int i = 0; i<=sArray.length - 1; i++)
        {
            
            for (int j = 2; j<sArray[i]; j++)
            {
                if (sArray[i]%j == 0)
                    count++;
            }
                    
            if (count == 0)
                System.out.print (sArray[i] + "  ");
            count = 0;    
       }
       
    }
    
    public static void main ()
    {
        Arrays3 arrObj = new Arrays3 ();
        arrObj.initialize ();
        arrObj.display ();
    }
}
 