//Write a program to search for an integer value input by the user 
//in the sorted list given below using binary search technique. 
// If found display ''Search Successful'' and print the element, 
//otherwise display ''Search Unsuccessful''
//{31, 36, 45, 50, 60, 75, 86, 90}
import java.util.Scanner;
public class BoardPaper2020_2
{
    int nArray [];
    int x;
    BoardPaper2020_2 ()
    {
        int [] Array = {31, 36, 45, 50, 60, 75, 86, 90};
        nArray = Array; 
    }
    
    void Initialize ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the number to be searched");
        x = sc.nextInt ();
    }
    
    void Search ()
    {
        int pos = -1;
        
        for (int i = 0; i<nArray.length; i++)
           if (x == nArray[i])
               pos = i;
               
        if ( pos == -1)
           System.out.println ("Search unsucessful");
        else 
            System.out.println ("Search sucessful. The number " +x+ " is found at index number " +pos);
    }
    
    public static void main ()
    {
        BoardPaper2020_2 obj = new BoardPaper2020_2 ();
        obj.Initialize ();
        obj.Search ();
    }
}


        