//Program to check if an ISBN number is legal or illegal
import java.util.Scanner;
public class ISBN 
{
    long isbn;
    void getData ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the ISBN number");
        isbn = sc.nextLong ();
    }
    
    int checkCount ()
    {
        long n = isbn;
        int count = 0;
    
        while (n!=0)
        {
            n = n/10;
            count++;
        }
        
        return count;
    }
    
    void checkNumber ()
    {
        long n = isbn;
        long sum = 0;
        
        while (n!=0)
        {
            for (int i = 10; i!=0; i--)
            {
                long d = n%10;
                n = n/10;
                sum = sum + (d*i);
            }
            if (sum%11 == 0)
               System.out.println ("Legal ISBN");
            else
                System.out.println ("Illegal ISBN");
            }
            
    }
    
    public static void main ()
    {
        ISBN obj = new ISBN ();
        obj.getData ();
        if (obj.checkCount () == 10)
            obj.checkNumber ();
        else
            System.out.println ("Invalid ISBN");
    }
}

                
        
    