// Menu driven program
import java.util.Scanner;
public class BoardPaper2019_2
{
    void GenerateMenu ()
    {
        System.out.println ("What do you want to do?");
        System.out.println ("1.To print letters from A to Z and their Unicode");
        System.out.println ("2. Display a pattern");
        System.out.println ("Enter any number other than 1 or 2 to exit");
    }
    
    void Unicode ()
    {
        System.out.println ("Letters" +"    "+ "Unicode");
        
        for (char ch = 'A'; ch<='Z'; ch++)
        {
            int x = (int) ch;
            System.out.println (ch +"            "+ x);
        }
    }
    
    void Pattern ()
    {
        for (int i = 1; i<=5; i++)
        {
            for (int j = 1; j<=i; j++)
            {
                System.out.print (j + " ");
            }
            System.out.println ();
        }
    }
    
    public static void main ()
    {
        Scanner sc = new Scanner (System.in);
        BoardPaper2019_2 obj = new BoardPaper2019_2 ();
        obj.GenerateMenu ();
        int option;
        char choice;
        
        do 
        {
            System.out.println ("Enter your selection");
            option = sc.nextInt ();
            
            switch (option)
            {
                case 1: obj.Unicode ();
                        break;
                case 2: obj.Pattern ();
                        break;
                default: return;
            }
            
            System.out.println ("Would you like to continue? [y/n]");
            choice = sc.next().charAt(0);
            
        } while (choice == 'y');
    }
}
