//A program to input a line of text and print the length of the longest word
import java.util.Scanner;
public class Arrays_Strings2
{
    String [] sArray;
    
    Arrays_Strings2 (int arrSize)
    {
        sArray = new String [arrSize];
    }
    
    void initialize ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the sentence having " +sArray.length+ " words in it");
        
        for (int i = 0; i<=sArray.length-1; i++)
             sArray [i] = sc.next ();
             
    }
    
    void findLongestWord ()
    {
        int max = sArray[0].length ();
        int pos = 0;
        
        for (int i = 1; i<=sArray.length-1; i++)
             if (sArray[i].length() > max)
             {
                 pos = i;
                 max = sArray[i].length();
             }
             
        System.out.println ("The longest word is " +sArray[pos]);
        System.out.println ("Its length is " +max);
    }
    
    public static void main ()
    {
        Arrays_Strings2 obj = new Arrays_Strings2 (5);
        obj.initialize ();
        obj.findLongestWord ();
    }
}

        