// A program to input a string and display it as
// Input String: the ultimate concept developers
// Output String: DEVELOPERS CONCEPT ULTIMATE THE
import java.util.Scanner;
public class Arrays1
{
    String[] sArray; //Declaration of an array
    
    Arrays1 (int arrSize)
    {
        sArray = new String [arrSize];
    }
    
    void initialize ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter a sentence containing 4 words");
        
        for (int i = 0; i<=sArray.length - 1; i++)
             sArray [i] = sc.next ();
             
    }
    
    void display ()
    {
        
        for (int i = sArray.length - 1; i>=0; i--)
             System.out.print (" " + sArray[i].toUpperCase() + " ");
    
    }
    
    public static void main ()
    {
        Arrays1 arrObj = new Arrays1 (4);
        arrObj.initialize ();
        arrObj.display ();
    }
}

     