// A program to accept any sentence and display its words in ascending order
import java.util.Scanner;
public class Arrays_Strings1 
{
    String [] sArray;
    
    void initializeArray ()
    {
        Scanner sc = new Scanner (System.in);
        
        String [] strArray = new String [5];
        System.out.println ("Enter the sentence having 5 words");
        
        for (int i = 0; i<=strArray.length-1; i++)
             strArray [i] = sc.next ();
        
        sArray = strArray;
    }
    
    void arrangeArray ()
    {
        String temp;
        
        for (int i = 0; i<=sArray.length-1; i++)
        
             for (int j = 0; j<=sArray.length-2; j++)
             
                  if (sArray[j].compareTo(sArray[j+1]) > 0)
                  {
                      temp = sArray [j];
                      sArray [j] = sArray [j+1];
                      sArray [j+1] = temp;
                  }
                  
        displayArray ();
    }
    
    void displayArray ()
    {
        for (int i = 0; i<=sArray.length-1; i++)
             System.out.print ( " " +sArray[i]+ " ");
    }
    
    public static void main ()
    {
        Arrays_Strings1 obj = new Arrays_Strings1 ();
        obj.initializeArray ();
        obj.arrangeArray ();
    }
}

        