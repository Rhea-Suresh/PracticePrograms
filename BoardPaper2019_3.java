// Bubble Sort Program
import java.util.Scanner;
public class BoardPaper2019_3
{
    int [] nArray;
    
    BoardPaper2019_3 ()
    {
        nArray = new int [15];
    }
    
    void Initialize ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the elements of the array");
        
        for (int i = 0; i<nArray.length; i++)
             nArray [i] = sc.nextInt ();
    }
    
    void BubbleSort ()
    {
        int temp;
        
        for (int i = 0; i<=nArray.length-2; i++)
             for (int j = 0; j<=nArray.length-2; j++)
                 if (nArray [j] > nArray [j+1])
                 {
                     temp = nArray [j];
                     nArray [j] = nArray [j+1];
                     nArray [j+1] = temp;
                 }
        
        Display ();
    }
    
    void Display ()
    {
        System.out.println ("Thew elements in the ascending order are: ");
        
        for (int i = 0; i<nArray.length; i++)
            System.out.println (nArray [i]);
    }
    
    public static void main ()
    {
        BoardPaper2019_3 obj = new BoardPaper2019_3 ();
        obj.Initialize ();
        obj.BubbleSort ();
    }
}

    