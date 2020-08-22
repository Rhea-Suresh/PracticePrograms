import java.util.Scanner;
public class Reverse 
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
        int n = num;
        int d; 
        int rev = 0;
        while (n!=0)
        {
            d = n%10;
            n = n/10;
            rev = rev*10 + d;
        }
        System.out.println ("The reverse of the number is " +rev);
    }
    
    
    public static void main ()
    {
        Reverse obj = new Reverse ();
        obj.getData ();
        obj.calculate ();
    }
}

        
        
            
        