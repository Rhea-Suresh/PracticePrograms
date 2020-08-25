import java.util.Scanner;
public class SumOfLastAndFirstDigit
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
        int n1 = num;
        int last = n1%10;
        int n2 = num;
        int first = 1;
        while (n2 != 0)
        {
            first = n2%10;
            n2 = n2/10;
        }
        int sum = first + last;
        System.out.println ("The sum of the first and last digit is " +sum);
    }
    
    public static void main ()
    {
        SumOfLastAndFirstDigit obj = new SumOfLastAndFirstDigit ();
        obj.getData ();
        obj.calculate ();
    }
}
    
    
