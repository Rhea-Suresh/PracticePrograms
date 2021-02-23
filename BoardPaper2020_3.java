//A program to overlad methood Number() to 
// 1. Display the frequency of a digit in a number
//2.Display the sum of even digits in a number 

public class BoardPaper2020_3
{
    
    void Number (int num, int d)
    {
        int count = 0;
        
        while (num!=0)
        {
            int n = num%10;
            if (n == d)
                count++;
            num = num/10;
        }
        
        System.out.println ("The frequency of digit " +d+ " is " +count);
    }
    
    void Number (int n1)
    {
        int sum = 0;
        
        while (n1 != 0)
        {
            int n = n1%10;
            if (n%2 == 0)
               sum = sum + n;
            n1 = n1/10;
        }
        
        System.out.println ("The sum of the even digits is " +sum);
    }
    
    public static void main ()
    {
        BoardPaper2020_3 obj = new BoardPaper2020_3 ();
        obj.Number (7647377, 7);
        obj.Number (678342);
    }
}
