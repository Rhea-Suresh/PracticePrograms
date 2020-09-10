import java.util.Scanner;
class Numbers
{
    int n;
    void getData ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the number");
        n = sc.nextInt ();
    }
    
    int SumOfDivisors ()
    {
        int sum = 0;
        
        for (int i = 1; i<=n; i++)
        {
            
            if (n%i == 0) 
            sum = sum + i;
            
        }    
        
        return sum;
    }
    
    void CheckType ()
    {
        System.out.println ("The sum of its divisors is " +SumOfDivisors ());
        
        if (SumOfDivisors () == (2*n))
            System.out.println ("Hence, the number is a perfect number");
        else if (SumOfDivisors () < (2*n))
            System.out.println ("Hence, the number is a deficient number");
        else
            System.out.println ("Hence, the number is a abundant number");
            
    }
    
    public static void main ()
    {
        Numbers obj = new Numbers ();
        obj.getData ();
        obj.CheckType ();
    }
}

            
            