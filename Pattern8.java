/* Program to generate the following pattern 
   6 6 6 6 6 6
   6 5 5 5 5 5
   6 5 4 4 4 4
   6 5 4 3 3 3 
   6 5 4 3 2 2 
   6 5 4 3 2 1*/
import java.util.Scanner;
public class Pattern8
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
                System.out.print (" " + (n-(j-1)) );//Pattern Ingridient
            
            for (int j = 1; j<=(n-i); j++)
                System.out.print (" " + (n-(i-1)) );
            
            System.out.println ();//Moves the cursor to the next line
        }
    }
    
    public static void main ()
    {
        Pattern8 obj = new Pattern8 ();
        obj.getData ();
        obj.GeneratePattern();
    }
}

        