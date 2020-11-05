// Program to generate the following series
// 1
// 2 * 3
// 4 * 5 * 6
import java.util.Scanner;
public class Series9
{
    int n;
    
    void getData ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the number of rows for the series");
        n = sc.nextInt ();
    } 
    
    void generateSeries ()
    {
        int count = 0;
        int prod = 1;
        
        for (int i = 1; i<=n; i++)
        {
            prod = 1;
            for (int j = 1; j<=i; j++)
            {
                count ++;
                prod = prod * count;
            }
            System.out.println (prod);
        }
        
    }
    
    public static void main ()
    {
        Series9 obj = new Series9 ();
        obj.getData ();
        obj.generateSeries ();
    }
}
