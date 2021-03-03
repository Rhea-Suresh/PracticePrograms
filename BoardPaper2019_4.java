// Function Overload
public class BoardPaper2019_4
{
    void series (int x, int n)
    {
        double sum = 0; 
        for (int i = 0; i<=n; i++)
             sum = sum + Math.pow(x,i);
        System.out.println ("The sum of the series is " +sum);
    }
    
    void series (int p)
    {
            for (int i = 1; i<=p; i++)
                System.out.println ((i*i*i) - 1);
    }
    
    void series ()
    {
        double sum = 0; 
        for (int i = 2; i<=10; i++)
             sum = sum + (double) 1/i;
        System.out.println ("The sum of the series is " +sum);
    }
}
