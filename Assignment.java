//Board paper 2013 (Question number 8)
public class Assignment
{
    double series (double n)
    {
        double sum = 0;
        for (int i = 1; i<=n; i++)
             sum = sum + (1/i);
        return sum;
    }
    
    double series (double a, double n)
    {
        double sum = 0;
        for (int i = 2; i<=n; i = i+3)
        {
            for (int j = 1; j<i; j = j+3)
            {
                sum = sum + (j / (Math.pow (a,i) ));
            }
        }
        return sum;
    }
    
    public static void main ()
    {
        Assignment obj = new Assignment ();
        System.out.println ("The output of the first series is " +obj.series(6.0));
        System.out.println ("The output of the second series is " +obj.series(10.0,6.0));
    }
}

        