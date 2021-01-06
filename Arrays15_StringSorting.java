// Write a program to store 10 names and sort them in an alphabetical order.
import java.util.Scanner;
public class Arrays15_StringSorting
{
    String [] sArray;
    
    Arrays15_StringSorting ()
    {
        sArray = new String [10];
    }
    
    void Initialize ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the names");
        
        for (int i = 0; i<sArray.length; i++)
            sArray[i] = sc.nextLine ();
    }
    
    void Arrange ()
    {
        String temp = null;
        
        for (int i = 0; i<sArray.length; i++ )
        {
            for (int j = 0; j<sArray.length-1; j++)
            {
                if (sArray [j].compareTo(sArray[j+1]) > 0)
                {
                    temp = sArray[j];
                    sArray [j] = sArray [j+1];
                    sArray [j+1] = temp;
                }
            }
        }
        Display ();
    }
    
    void Display ()
    {
        System.out.println ("The names in alphabetical order are: ");
        
        for (int i = 0; i<sArray.length; i++)
             System.out.println (sArray[i]);
             
    }
            
    public static void main ()
    {
        Arrays15_StringSorting obj = new Arrays15_StringSorting ();
        obj.Initialize ();
        obj.Arrange ();
    }
}

    