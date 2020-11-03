/* Program to generate the following pattern
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4 */
import java.util.Scanner;
public class Pattern3
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
        for (int i = 1; i<=n; i++) //Number of rows
        {
            for (int j = 1; j<=i; j++)//Number of elements in each row
            {
                System.out.print (" " + j );//Pattern Ingridient
            }
            System.out.println ();//Moves the cursor to the next line
        }
    }
    
    public static void main ()
    {
        Pattern3 obj = new Pattern3 ();
        obj.getData ();
        obj.GeneratePattern();
    }
}

        