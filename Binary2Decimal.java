import java.util.Scanner;
public class Binary2Decimal 
{
    int num;
    void getData ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the number");
        num = sc.nextInt ();
    }
    
    void toDecimal ()
    {
        double sum = 0.0;
        int n = num;
        int a = 0;
        while (n!=0)
        {
            int d = n%10;
            n = n/10;
            sum = sum + (d * (Math.pow(2,a)));
            a = a+1;
        }
        System.out.println ("The decimal number is " +sum);
    }
    
    public static void main ()
    {
        Binary2Decimal obj = new Binary2Decimal ();
        obj.getData ();
        obj.toDecimal ();
    }
}

            