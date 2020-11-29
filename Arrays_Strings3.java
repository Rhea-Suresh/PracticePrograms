// A program to accept a word and print its alphabets in increasing order
import java.util.Scanner;
public class Arrays_Strings3
{
    String str;
    
    void readString ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the word");
        str = sc.nextLine ();
    }
    
    void arrange ()
    {
        char [] chArray = str.toCharArray ();
        char temp;
        
        for (int i = 0; i<=chArray.length-1; i++)
        {
            for (int j = 0; j<=chArray.length-2; j++)
            {
                if (chArray[j] > chArray[j+1])
                {
                    temp = chArray [j];
                    chArray [j] = chArray [j+1];
                    chArray [j+1] = temp;
                }
            }
        }
        str = String.copyValueOf (chArray);
        System.out.println ("The new string is " +str);
    }
    
    public static void main ()
    {
        Arrays_Strings3 obj = new Arrays_Strings3 ();
        obj.readString ();
        obj.arrange ();
    }
}
