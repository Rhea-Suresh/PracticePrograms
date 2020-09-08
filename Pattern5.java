/* Program to generate the following pattern
   1
   2 3
   3 4 5 
   4 5 6 7
   5 6 7 8 9*/
import java.util.Scanner;
public class Pattern5
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
            int count = i;
            for (int j = 1; j<=i; j++)//Number of elements in each row
            {
                System.out.print (" " + count);//Pattern Ingridient
                count ++;
            }
            System.out.println ();//Moves the cursor to the next line
        }
    }
    
    public static void main ()
    {
        Pattern5 obj = new Pattern5 ();
        obj.getData ();
        obj.GeneratePattern();
    }
}

        