// A factorian or special number is a number which is equal to the sum of te factorial of its digit.
// Write a program to check if a number is a factorian or not
import java.util.Scanner;
public class SpecialNumber
{
    int num;
    void getData ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the number");
        num = sc.nextInt ();
    }
    
    int fact (int a)
    {
        int prod = 1;
        for (int i = 1; i<=a; i++)
             prod = prod*i;
        return prod;
    }
    
    void calculate ()
    {
        int n = num;
        int sum = 0;
        while (n!=0)
        {
            int d = n%10;
            sum = sum + fact(d);
            n = n/10;
        }
        
        if (num == sum)
            System.out.println ("The number is a factorian");
        else
            System.out.println ("The number is not a factorian");
    }
    
    public static void main ()
    {
        SpecialNumber obj = new SpecialNumber ();
        obj.getData ();
        obj.calculate ();
    }
}
            
            
        
            