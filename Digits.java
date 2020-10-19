// Program to input a 4 digit number and form a new number by swapping the first
// and last two digits. Example: Input Number: 1738; Output Number: 3817
import java.util.Scanner;
public class Digits
{
    int n;
    void getData ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the number");
        n =  sc.nextInt ();
    }
    
    void checkDigits ()
    {
        int num = n;
        int count = 0;
        while (num!=0)
        {
            num = num/10;
            count ++;
        }
        if (count == 4)
            reverse ();
        else
            System.out.println ("Invalid Number");
    }
    
    void reverse ()
    {
        int num = n;
        int d1 = num%100;
        int d2 = num/100;
        System.out.print (d1);
        System.out.print (d2);
    }
    
    public static void main ()
    {
        Digits obj = new Digits ();
        obj.getData();
        obj.checkDigits();
    }
}
        
        
        