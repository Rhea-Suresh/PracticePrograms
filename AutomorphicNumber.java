// To check if a number is Automorphic i.e. the units place 0f the sqare of a 
//number is the same as the number
import java.util.Scanner;
public class AutomorphicNumber 
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
        n = n*n;
        int d = n%10;
        System.out.println ("The square of the number is " +n);
        if (d==num)
            System.out.println ("Hence,the number is a automorphic number");
        else 
            System.out.println ("Hence,the number is not a automorphic number");
    }
    
    public static void main ()
    {
        AutomorphicNumber obj = new AutomorphicNumber ();
        obj.getData ();
        obj.calculate ();
    }
}
    
    
    