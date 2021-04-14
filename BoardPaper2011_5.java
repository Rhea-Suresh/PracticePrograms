import java.util.Scanner;
public class BoardPaper2011_5
{
    void GenerateMenu ()
    {
        System.out.println ("What do you want to do?");
        System.out.println ("1.To print the first series");
        System.out.println ("2.To calculate the sum of second series");
        System.out.println ("Enter any digit other than 1 or 2 to exit");
    }
    
    void Series1 ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the value of 'n':");
        int n = sc.nextInt ();
        
        for (int i = 1; i<=n; i++)
             System.out.print ((i*i)-1 + "  ");
    }
    
    void Series2 ()
    {
        double sum = 0;
        for (int i = 1, k = 2; i<=3; i+=2, k+=2)
             sum = sum + i/k;
        System.out.println ("The sum of the series is " +sum);
    }
    
    public static void main ()
    {
        BoardPaper2011_5 obj = new BoardPaper2011_5 ();
        int option;
        char choice;
        do
        {
            Scanner sc = new Scanner (System.in);
            obj.GenerateMenu ();
            System.out.println ("Enter your selection");
            option = sc.nextInt ();
            switch (option)
            {
                case 1: obj.Series1 ();
                        break;
                case 2: obj.Series2 ();
                        break;
                default: return;
            }
            System.out.println ("Do you want to continue [y/n]?");
            choice = sc.next().charAt(0);
        } while (choice == 'y');
    }
}

