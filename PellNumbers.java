import java.util.Scanner;
public class PellNumbers
{
    void series () //Methood to calculate and print the first 15 terms of series
    {
        int a = 0;
        int b = 1;
        System.out.println (a);
        for (int i = 1; i<15; i++)
        {
            System.out.println (b);
            int c = a+b+b;
            a = b;
            b = c;
        }
    }
    
    public static void main () //Main Methood
    {
        PellNumbers obj = new PellNumbers ();
        obj.series ();
    }
}