// Tech Number
public class BoardPaper2019_5
{
    void GenerateNumber ()
    {
        System.out.println ("The four digit tech numbers are: ");
        for (int i = 1000; i<10000; i++)
             if (Check (i) == i)
                 System.out.println (i);
    }
    
    double Check (int n)
    {
        int a = n%100;
        int b = n/100;
        double c = a+b;
        double sum = Math.pow (c,2);
        return sum;
    }
    
    public static void main ()
    {
        BoardPaper2019_5 obj = new BoardPaper2019_5 ();
        obj.GenerateNumber ();
    }
}

