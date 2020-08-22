// A program to calculate the Greatest and Smallest digit in a number
import java.util.Scanner;
public class GreatestAndSmallestDigit 
{
    int num;
    void getData ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the number");
        num = sc.nextInt ();
    }
    
    void calculate ()
    {
        int max = 0;
        int min = 10;
        int n = num;
        while (n!=0)
        {
            int d = n%10;
            max = Math.max (d,max);
            min = Math.min (d,min);
            n = n/10;
        }
        System.out.println ("The greatest digit of the number is " +max);
        System.out.println ("The smallest digit of the number is " +min);
    }
    
    public static void main ()
    {
        GreatestAndSmallestDigit obj = new GreatestAndSmallestDigit ();
        obj.getData ();
        obj.calculate ();
    }
}

        