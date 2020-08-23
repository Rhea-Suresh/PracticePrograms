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
    
    int count ()
    {
        int count = 0;
        int n = num;
        while (n!=0)
        {
            n = n/10;
            count++;
        }
        return count;
    }
    
    void calculate ()
    {
        int n1 = num;
        int last = n1%10;
        int n2 = num;
        int c = count() - 1;
        double first = n2/(Math.pow(10,c));
        double sum = first + last;
        System.out.println ("The sum of the first and last digit is " +(int)sum);
    }
    
    public static void main ()
    {
        SumOfLastAndFirstDigit obj = new SumOfLastAndFirstDigit ();
        obj.getData ();
        obj.calculate ();
    }
}
    
    
