// A menu driven program to 
// Display factors of a number including 1 and excluding the number itself
// And to display the factorial of a number
import java.util.Scanner;
public class Menu8
{
    void GenerateMenu ()
    {
        System.out.println ("What would you like to do?");
        System.out.println ("1. To display all the factors of a number");
        System.out.println ("2. To display the factorial of a number");
        System.out.println ("Enter any number other than 1 or 2 to exit");
    }
    
    void Factors ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the number");
        int x = sc.nextInt ();
        
        System.out.println ("The factors are: ");
        
        for (int i = 1; i<x; i++)
             if (x%i == 0)
                System.out.println (i);
       
    }
    
    void Factorial ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the number");
        int x = sc.nextInt ();
        
        int prod = 1;
        for (int i = 1; i<=x; i++)
            prod = prod * i;
            
        System.out.println ("The factorial of the number is " +prod);
    }
    
    public static void main ()
    {
        Scanner sc = new Scanner (System.in);
        Menu8 obj = new Menu8 ();
        int option;
        char choice;
        
        do 
        {
            obj.GenerateMenu ();
            System.out.println ("Enter your selection");
            option = sc.nextInt ();
            
            if (option == 1)
                obj.Factors ();
            else if (option == 2)
                obj.Factorial ();
            else
                return;
                
            System.out.println ("Would you like to continue [y/n]?");
            choice = sc.next().charAt(0);
        } 
        while (choice == 'y');
    }
}
