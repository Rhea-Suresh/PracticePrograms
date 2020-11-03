
/* Program to generate the following pattern
   A
   b b
   C C C
   d d d d
   E E E E E*/
import java.util.Scanner;
public class Pattern7
{
    int n;
    void getData ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the number of rows for the pattern");
        n = sc.nextInt ();
    }
    
    void GeneratePattern ()
    {
        char ch = 64; //Ascii code from 65 to 90 if for capital letters
        for (int i = 1; i<=n; i++)
        {
            ch ++;
            if (i%2 != 0) //For odd numbers uppercase characters
            {
                for (int j = 1; j<=i; j++)
                   System.out.print (" " +ch);
            }
            
            else 
            {
                for (int j = 1; j<=i; j++)
                   System.out.print (" " +Character.toLowerCase(ch));
            }
            System.out.println ();
        }
    }
    
    public static void main ()
    {
        Pattern7 obj = new Pattern7 ();
        obj.getData ();
        obj.GeneratePattern();
    }
}

        