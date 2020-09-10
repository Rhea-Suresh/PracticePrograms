// A primorial of a number means to find the product of all prime factors before the number
// Symbol: #
// Example: 13# = 2 x 3 x 5 x 7 x 11 x 13 = 30030
import java.util.Scanner;
public class PrimorialNumber
{
    int n;
    void getData ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the number:");
        n = sc.nextInt ();
    }
    
    void Primorial ()
    {
        int sum = 1;
        for (int i = 1; i<=n; i++)
        {
            int count = 0;
            
            for (int j = 1; j<=i; j++)
            {
                if (i%j == 0)
                    count ++;
            }
                
            if (count == 2)
                    sum = sum * i;
                    
        }
        System.out.println ("The primorial is " +sum);
    }
    
    public static void main ()
    {
        PrimorialNumber obj = new PrimorialNumber ();
        obj.getData ();
        obj.Primorial ();
    }
}
