// Program to print all Factorians from 1-1000
import java.util.Scanner;
public class Factorian2
{
    
    int fact (int a)
    {
        int prod = 1;
        for (int i = 1; i<=a; i++)
             prod = prod*i;
        return prod;
    }
    
    void calculate ()
    {
        System.out.println ("The Factorians between 1 to 1000 are: ");
        for (int i = 1; i<=1000; i++)
        {
            int num = i;
            int sum = 0;
            
            while (num!=0)
            {
                int d = num%10;
                sum = sum + fact(d);
                num = num/10;
            }
            
            if (sum == i)
                System.out.println (i);
                
        }
    }
    
    public static void main ()
    {
        Factorian2 obj = new Factorian2 ();
        obj.calculate ();
    }
}