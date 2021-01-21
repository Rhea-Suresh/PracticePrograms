// A program to check if the number input is a kaprekar number or not
// A Kaprekar number is a number whose square when divided into two parts 
// such that sum of parts is equal to the original number and none of the parts has value 0
// Example: 45 
// 45 * 45 = 2025;  20 + 25 = 45
import java.util.Scanner;
public class KaprekarNumber
{
    int n;
    int count = 0;
    
    void Initialize ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the number");
        n = sc.nextInt ();
    }
    
    void Count ()
    {
        int num = n*n;
        
        while (num!=0)
        {
            num = num/10;
            count++;
        }
        
    }
     
    void Check ()
    {
        int num = n*n;
        int a = (int) Math.pow (10,count/2);
        int sum = num/a + num%a;
        
        if (count - count/2 != count/2)
        {
            int c = count - count/2;
            int b = (int) Math.pow(10,c);
            int sum1 = num/b + num%b;
            
            if (sum == n)
            {
                System.out.println ("The square of the number is " +num);
                System.out.println ("Since " +num/b+ " + " +num%b+ " is " +sum1);
                System.out.println ("Hence, the number is a Kaprekar Number");
            }
              
        }
        
        if (sum == n)
        {
            System.out.println ("The square of the number is " +num);
            System.out.println ("Since " +num/a+ " + " +num%a+ " is " +sum);
            System.out.println ("Hence, the number is a Kaprekar Number");
        }
        else
        {
            System.out.println ("The square of the number is " +num);
            System.out.println ("Since " +num/a+ " + " +num%a+ " is " +sum);
            System.out.println ("Hence, the number is not a Kaprekar Number");
        }
            
    }
    
    public static void main ()
    {
        KaprekarNumber obj = new KaprekarNumber ();
        obj.Initialize ();
        obj.Count ();
        obj.Check ();
    }
}
        
            
             
 