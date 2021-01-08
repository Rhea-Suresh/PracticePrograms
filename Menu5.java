// Board Paper 2006
// Menu Driven Program to find the natural logarithm, absolute value, square root and random number
import java.util.Scanner;
public class Menu5
{
    void generateMenu ()
    {
        System.out.println ("What would you like to do?");
        
        System.out.println ("1. To find the natural logarithm of a number");
        System.out.println ("2. To find the absolute value of a number");
        System.out.println ("3. To find the square root of a number");
        System.out.println ("4. To give a random number from 0 to 1");
        
        System.out.println ("Enter any number other than 1,2,3 or 4 to exit");
    }
    
    void Logarithm ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the number whose natural logarith needs to be found");
        double num = sc.nextDouble ();
        
        double log = Math.log(num);
        System.out.println ("The natural logaarithm of the number is " +log);
    }
    
    void AbsoluteValue ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the number whose absolute value needs to be found");
        double num = sc.nextDouble ();
        
        double a = Math.abs(num);
        System.out.println ("The absolute value of the number is " +a);
    }
    
    void SquareRoot ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the number whose square root needs to be found");
        int num = sc.nextInt ();
        
        double sq = Math.sqrt(num);
        System.out.println ("The absolute value of the number is " +sq);
    }
    
    void Random ()
    {
        double r = Math.random ();
        System.out.println ("A random number between 0 and 1 is " +r);
    }
    
    public static void main ()
    {
        Scanner sc = new Scanner (System.in);
        Menu5 obj = new Menu5 ();
        int option;
        char choice;
        
        do 
        {
            obj.generateMenu ();
            System.out.println ("Enter your selection [1/2/3/4]:");
            option = sc.nextInt ();
            
            if (option == 1)
                obj.Logarithm ();
            else if (option == 2)
                obj.AbsoluteValue ();
            else if (option == 3)
                obj.SquareRoot ();
            else if (option == 4)
                obj.Random ();
            else
                return;
            
            System.out.println ("Would you like to continue [y/n]?");
            choice = sc.next().charAt(0);
        }
        while (choice == 'y');
    }
}
    
    
        
        