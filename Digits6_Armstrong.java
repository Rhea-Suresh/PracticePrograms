//Program to check if the number is an armstrong number or not
import java.util.Scanner;
public class Digits6_Armstrong
{
    int num;
    void getNumber ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the number: ");
        num = sc.nextInt ();
    }
    
    double Prod (double a, double b)
    {
        double prod = Math.pow(a,b);
        return prod;
    }
    
    double Calculate ()
    {
        int n1 = num;
        int count = 0;
        
        while (n1!=0)
        {
            n1 = n1/10;
            count++;
        }
        
        int n2 = num;
        int d;
        double sum = 0;
        
        while (n2!=0)
        {
            d = n2 % 10;
            n2 = n2/10;
            sum = sum + Prod((double)d,(double)count);
        }
        
        return sum;
    }
    
    void check ()
    {
        if (Calculate() == num)
        {
            System.out.println ("The number is a Armstrong Number.");
        }
        
        else
        {
            System.out.println ("The number is not a Armstrong Number.");
        }
    }
    
    public static void main ()
    {
        Digits6_Armstrong obj = new Digits6_Armstrong ();
        obj.getNumber ();
        obj.Calculate ();
        obj.check ();
    }
}