import java.util.Scanner;
public class BoardPaper2011_3
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
        
        System.out.println ("The sum of the factorials is " +sum);
        if (num == sum)
            System.out.println ("Hence, the number is a factorian");
        else
            System.out.println ("Hence, the number is not a factorian");
    }
    
    public static void main ()
    {
        BoardPaper2011_3 obj = new BoardPaper2011_3 ();
        obj.getData ();
        obj.calculate ();
    }
}
            
