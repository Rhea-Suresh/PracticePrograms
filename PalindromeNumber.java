import java.util.Scanner;
public class PalindromeNumber
{
    int num;
    void getData ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the number");
        num = sc.nextInt ();
    }
    
    int calculate ()
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
        
        return rev;
    }
    
    void check ()
    {
        if (num == calculate())
        {
            System.out.println ("The reverse of the number is " + calculate());
            System.out.println ("Hence, the number is a palindrome number");
        }
        else
        {
            System.out.println ("The reverse of the number is " + calculate());
            System.out.println ("Hence, the number is not a palindrome number");
        }
    }
    
    public static void main ()
    {
        PalindromeNumber obj = new PalindromeNumber ();
        obj.getData ();
        obj.check ();
    }
}

            
    
