/* Program to generate the following pattern
 * 1
 * 2 2
 * 3 3 3
 * 4 4 4 4 */
import java.util.Scanner;
public class Pattern2
{
    int n;
    void getData ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the number or rows for the pattern");
        n = sc.nextInt ();
    }
    
    void GeneratePattern ()
    {
        for (int i = 1; i<=n; i++) //Number of rows
        {
            for (int j = 1; j<=i; j++)//Number of elements in each row
            {
                System.out.print (" " + i );//Pattern Ingridient
            }
            System.out.println ();//Moves the cursor to the next line
        }
    }
    
    public static void main ()
    {
        Pattern2 obj = new Pattern2 ();
        obj.getData ();
        obj.GeneratePattern();
    }
}

        