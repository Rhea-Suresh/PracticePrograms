// A program to illustrate the bubble sort methood
import java.util.Scanner;
public class Arrays7_BubbleSort
{
    int [] nArray; 
    Arrays7_BubbleSort (int arrSize)
    {
        nArray = new int [arrSize];
    }
    
    void initialize ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the elements of the array");
        
        for (int i = 0; i<=nArray.length - 1; i++)
             nArray [i] = sc.nextInt ();
    }
    
    void display ()
    {
        for (int i = 0; i<=nArray.length-1; i++)
             System.out.print (" " + nArray[i] + " ");
        System.out.println ();
    }
    
    void arrange () //Ascending Order
    {
        int temp;
        for (int i = 0; i<=nArray.length-2; i++)
        {
            for (int j = 0; j<=nArray.length - 2; j++)
            {
                if (nArray[j] > nArray[j+1])
                {
                    temp = nArray [j];
                    nArray[j] = nArray[j+1];
                    nArray[j+1] = temp;
                }
                System.out.print ("Pass/Iteration: " +(i+1)+ " ==> ");
                display ();
            }
        }
    }
    
    public static void main ()
    {
        Arrays7_BubbleSort obj = new Arrays7_BubbleSort (5);
        obj.initialize ();
        obj.arrange ();
    }
}