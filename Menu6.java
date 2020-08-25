// Board Paper 2011
// Program using switch case to find the first 10 numbers of the fibonacci series and to find the sum of digits of the number entered
import java.util.Scanner;
public class Menu6
{
    void generateMenu ()
    {
        System.out.println ("What would you like to do?");
        
        System.out.println ("1. To find the first 10 terms of a fibonacci series");
        System.out.println ("2. To find the sum of digits of a number");
        
        System.out.println ("Enter any number other than 1 or 2 to exit");
    }
    
    void FibonacciSeries ()
    {
        int sum = 0;
        int a = 0;
        int b = 1;
        System.out.println ("The first 10 terms in the fibonacci series is: ");
        System.out.println (a);
        for (int i =1; i<=10; i++)
        {
            System.out.println (b);
            int c = a + b;
            a = b;
            b = c;
        }
    }
    
    void SumOfDigits ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the number");
        int num = sc.nextInt ();
        
        int sum = 0;
        while (num != 0)
        {
            int d = num%10;
            sum = sum + d;
            num = num/10;
        }
        System.out.println ("The sum of digits in a number is " +sum);
    }
    
    public static void main ()
    {
        Scanner sc = new Scanner (System.in);
        Menu6 obj = new Menu6 ();
        int option;
        char choice;
        
        do 
        {
            obj.generateMenu ();
            System.out.println ("Enter your selection [1/2]:");
            option = sc.nextInt ();
            
            switch (option)
            {
                case 1: obj.FibonacciSeries ();
                        break;
                case 2: obj.SumOfDigits ();
                        break;
                default: return;
            }
            
            System.out.println ("Would you like to continue [y/n]?");
            choice = sc.next().charAt(0);
        }
        while (choice == 'y');
    }
}

    
    