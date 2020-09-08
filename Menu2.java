// A menu driven program to check if a number is a perfect or palindrome number (Board Paper 2008)
import java.util.Scanner;
public class Menu2
{
    void generateMenu ()
    {
        System.out.println ("What would you like to do?");
        
        System.out.println ("1. To check if the number entered is a Palindrome Number");
        System.out.println ("2. To check if the number entered is a Perfect Number");
        
       System.out.println ("Press any integer other than 1 or 2 to exit");
    }
    
    void Palindrome ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the number to check if its a palindrome number or not");
        int num = sc.nextInt ();
        
        int n1 = num;
        int d; 
        int rev = 0;
        
        while (n1!=0)
        {
            d = n1%10;
            n1 = n1/10;
            rev = rev*10 + d;
        }
        
        if (num == rev)
            System.out.println ("The number is a palindrome number");
        else
            System.out.println ("The number is not a palindrome number");
    }
    
    void Perfect ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the number to check if its a perfect number or not");
        int num = sc.nextInt ();
        
        int n2 = num;
        int sum = 0;
        
        for (int i=1; i<n2; i++)
        {
            if (n2%i == 0)
                sum = sum + i;
        }
        
        if (sum == num)
            System.out.println ("The number is a perfect number");
        else
            System.out.println ("The number is not a perfect number");
    }
    
    public static void main ()
    {
        Scanner sc = new Scanner (System.in);
        Menu2 obj = new Menu2 ();
        char choice;
        int option;
        
        do
        {
            obj.generateMenu ();
            System.out.println ("Enter your selection (1/2):");
            option = sc.nextInt ();
            
            if (option == 1)
                obj.Palindrome ();
            else if (option == 2)
                obj.Perfect ();
            else 
                return;
            
            System.out.println ("Would you like to continue [y/n]?");
            choice = sc.next().charAt(0);
            
        } while (choice == 'y');
    }
}

    
            
                