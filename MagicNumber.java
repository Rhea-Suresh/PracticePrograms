import java.util.Scanner;
public class MagicNumber
{
    int n;
    void getData ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the number");
        n = sc.nextInt ();
    }
    
    void check () //Methood to get the sum of the digits and check if its equal to 1 or 10
    {
        int num = n;//Preserving the original copy of the number
        int sum = 0;
        while (num!=0)
        {
            int d = num%10; //Extracting the digit at units place
            num = num/10; //Deleting the digit at units place
            sum = sum+d;
        }
        System.out.println ("The sum of the digits is " +sum);
        
        if ((sum==1) || (sum==10))
            System.out.println ("Hence, the number is a magic number");
        else
            System.out.println ("Hence, the number is not a magic number");
    }
    
    public static void main () //Main methood
    {
        MagicNumber obj = new MagicNumber ();
        obj.getData ();
        obj.check();
    }
}
