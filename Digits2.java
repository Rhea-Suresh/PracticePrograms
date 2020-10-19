// Write a program segment to input a real number and display its integer and 
//real part separately(in separate lines)
// Input number: 135.84
//Output: 135
//         .84
import java.util.Scanner;
public class Digits2
{
    double num;
    void getData ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the real number");
        num = sc.nextDouble ();
    }
    
    void Compute ()
    {
        int a = (int)Math.floor(num);
        double b = num-a;
        System.out.println (a);
        System.out.println (b);
    }
    
    public static void main ()
    {
        Digits2 obj = new Digits2 ();
        obj.getData ();
        obj.Compute ();
    }
}
