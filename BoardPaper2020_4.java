//Write a menu driven program to 
//(i) To print the value of c=a2+2ab, 
//where a varies from 1.0 to 20.0 with increment of 2.0 and b=3.0 is a constant.
//(ii) To display the following pattern using for loop:
/*A
  AB
  ABC
  ABCD*/
import java.util.Scanner;
public class BoardPaper2020_4
{
    void GenerateMenu ()
    {
        System.out.println ("What do you want to do?");
        System.out.println ("1.To print the value of c = a2+2ab");
        System.out.println ("2.To display a pattern");
        System.out.println ("Enter any number other than 1 or 2 to exit");
    }
    
    void Value ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the value of a from 1.0 to 20.0");
        double a = sc.nextDouble ();
        double b = 3.0;
        
        double c = Math.pow(a,2) + (2*a*b);
        System.out.println ("The value of c is " +c);
    }
    
    void Pattern ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the number of rows");
        int r = sc.nextInt ();
        
        for (int i = 0; i<=r; i++)
        {
            int c = 64;
            for (int j = 0; j<=i; j++)
            {
                c++;
                char ch = (char) c;
                System.out.print (ch);
            }
            System.out.println ();
        }
    }
    
    public static void main ()
    {
        Scanner sc = new Scanner (System.in);
        BoardPaper2020_4 obj = new BoardPaper2020_4 ();
        obj.GenerateMenu ();
        int option;
        char choice;
        
        do 
        {
            System.out.println ("Enter your selection [1/2]");
            option = sc.nextInt ();
            
            if (option == 1)
                obj.Value ();
            else if (option == 2)
                obj.Pattern ();
            else 
                System.out.println ("Invalid number entered. Please enter 1 or 2");
                
            System.out.println ("Do you want to continue [y/n]?");
            choice = sc.next().charAt(0);
        }while (choice == 'y');
    }
}