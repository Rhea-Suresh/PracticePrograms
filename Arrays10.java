// A program to accept sales of each day of the week 
// And Print the total and average sales of the week
import java.util.Scanner;
public class Arrays10
{
    int sum, avg;
    int [] Sales;
    
    Arrays10 ()
    {
        Sales = new int [7];
    }
    
    void Initialize ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the Sales for the week");
        
        for (int i = 0; i<=Sales.length-1; i++)
             Sales[i] = sc.nextInt ();
    }
    
    void TotalSales ()
    {
        for (int i = 0; i<=Sales.length-1; i++)
             sum = sum + Sales[i];
        System.out.println ("The total sales is " +sum);
    }
    
    void AverageSales ()
    {
        avg = sum/5;
        System.out.println ("The average sales is " +avg);
    }
    
    public static void main ()
    {
        Arrays10 obj = new Arrays10 ();
        obj.Initialize ();
        obj.TotalSales ();
        obj.AverageSales ();
    }
}
   