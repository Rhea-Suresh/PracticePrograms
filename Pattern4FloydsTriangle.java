/* Program to generate Floyd's Triangle
 * 1
 * 2 3
 * 4 5 6
 * 7 8 9 10 */
import java.util.Scanner;
public class Pattern4FloydsTriangle
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
        int count = 0;
        for (int i = 1; i<=n; i++) //Number of rows
        {
            for (int j = 1; j<=i; j++)//Number of elements in each row
            {
                count ++;
                System.out.print (" " + count );//Pattern Ingridient
            }
            System.out.println ();//Moves the cursor to the next line
        }
    }
    
    public static void main ()
    {
        Pattern4FloydsTriangle obj = new Pattern4FloydsTriangle ();
        obj.getData ();
        obj.GeneratePattern();
    }
}

        