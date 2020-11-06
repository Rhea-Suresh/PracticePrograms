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
    
    int checkPrime (int a)
    {
        int count = 0;
        for (int i = 2; i<a; i++)
        {
            if(a%i == 0)
               count ++;
        }
        return count;
    }
    
    void display ()
    {
        System.out.println ("The prime numbers in the array are: ");
        for (int i = 0; i<=sArray.length - 1; i++)
        {
                    
            if (checkPrime (sArray[i]) == 0)
                System.out.print (sArray[i] + "  ");
                
        }
       
    }
    
    public static void main ()
    {
        Arrays3 arrObj = new Arrays3 ();
        arrObj.initialize ();
        arrObj.display ();
    }
}
 