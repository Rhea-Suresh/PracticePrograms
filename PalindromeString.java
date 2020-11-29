// A Palindrome word is a word that reads the same from left or right
// Program to check if a string is a palindrome string or not
// Example: Madam, Arora
import java.util.Scanner;
public class PalindromeString 
{
    String str;
    void getData ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the Word");
        str = sc.next ();
    }
    
    void checkPalindrome ()
    {
        int len = str.length ();
        
        for (int i = 0, j = len-1; i<=len-1; i++, j--)
        {
            if (str.charAt (i) != str.charAt (j))
            {
                System.out.println ("The string is not a palindrome word");
                return;
            }
        }
        System.out.println ("The string is a palindrome word");
    }
    
    public static void main ()
    {
        PalindromeString obj = new PalindromeString ();
        obj.getData ();
        obj.checkPalindrome ();
    }
}
    