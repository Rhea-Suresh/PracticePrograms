// Board Paper 2009
// A menu driven program to check if a number is a buzz number or to find GCD
import java.util.Scanner;
public class Menu3
{
    void generateMenu ()
    {
        System.out.println ("What would you like to do?");
        System.out.println ("1. To check if the number entered is a buzz number or not");
        System.out.println ("2. To print the GCD of the two numbers entered");
        System.out.println ("Enter any other digit than 1 or 2 to exit");
    }
    
    void BuzzNumber ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the number to check if its a buzz number or not");
        int num = sc.nextInt ();
        
        if ((num%7 == 0) || (num%10 == 7))
            System.out.println ("The number entered is a buzz number");
        else 
            System.out.println ("The number entered is not a buzz number");
    }
    
    void GCD ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the first number:");
        int n1 = sc.nextInt ();
        System.out.println ("Enter the second number:");
        int n2 = sc.nextInt ();
        
        int a = Math.max (n1,n2);
        int b = Math.min (n1,n2);
        
        int gcd = 1;
        for (int i = 2; i<=b; i++)
        {
            if ((a%i == 0) && (b%i == 0))
                 gcd = i;
        }
        System.out.println ("The Greatest Common Divisor (GCD) of the two numbers is " +gcd);
    }
    
    public static void main ()
    {
        Scanner sc = new Scanner (System.in);
        Menu3 obj = new Menu3 ();
        int option;
        char choice;
        
        do 
        {
            obj.generateMenu ();
            System.out.println ("Enter your selection [1/2]:");
            option = sc.nextInt ();
            
            if (option == 1)
                obj.BuzzNumber ();
            else if (option == 2)
                obj.GCD ();
            else
                return;
            
            System.out.println ("Would you like to continue [y/n]?");
            choice = sc.next().charAt(0);
        }
        while (choice == 'y');
    }
}

            
        
        
        
            
            
            