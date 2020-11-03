// A program to input an array of 5 elements and print the output after multiplying each element with 2
import java.util.Scanner;
public class Arrays2
{
    int[] sArray;
    Arrays2 ()
    {
        sArray = new int [5];
    }
    
    void initialize ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the 5 numbers for the array");
        
        for (int i = 0; i<=sArray.length - 1; i++)
             sArray [i] = sc.nextInt ();
             
    }
    
    void display ()
    {
        
        for (int i = 0; i<=sArray.length - 1; i++)
             System.out.print (sArray[i] * 2 + " ");
             
    }
    
    public static void main ()
    {
        Arrays2 arrObj = new Arrays2 ();
        arrObj.initialize ();
        arrObj.display ();
    }
}
