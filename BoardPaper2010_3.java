import java.util.Scanner;
public class BoardPaper2010_3
{
    void generateMenu ()
    {
        System.out.println ("What would you like to do?");
        System.out.println ("1. To check if the number entered is a prime number or not");
        System.out.println ("2. To check if the number entered is a automorphic number or not");
        System.out.println ("Enter any number other than 1 or 2 to exit");
    }
    
    void PrimeNumber ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the number to check if its a prime number");
        int num = sc.nextInt ();
        
        int count = 0;
        for (int i = 2; i<num; i++)
        {
            if (num%i == 0)
                count++; 
        }
        
        if (count == 0)
            System.out.println ("The number is a prime number");
        else
            System.out.println ("The number is not a prime number");
    }
    
    void AutomorphicNumber ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the number to check if its an automorphic number");
        int num = sc.nextInt ();
        
        int n = num;
        n = n*n;
        int d = n%10;
        if (d==num)
            System.out.println ("The number is a automorphic number");
        else 
            System.out.println ("The number is not a automorphic number");
    }
    
    public static void main ()
    {
        Scanner sc = new Scanner (System.in);
        BoardPaper2010_3 obj = new BoardPaper2010_3 ();
        int option;
        char choice;
        
        do 
        {
            obj.generateMenu ();
            System.out.println ("Enter your selection [1/2]:");
            option = sc.nextInt ();
            
            if (option == 1)
                obj.PrimeNumber ();
            else if (option == 2)
                obj.AutomorphicNumber ();
            else
                return;
            
            System.out.println ("Would you like to continue [y/n]?");
            choice = sc.next().charAt(0);
        }
        while (choice == 'y');
    }
}