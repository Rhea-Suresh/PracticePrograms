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

    int Calculate ()
    {
        int n = num;
        int sum = 0;
        int d;
        while (n!=0)
        {
            d = n % 10;
            n = n/10;
            sum = sum + (d*d*d);
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
