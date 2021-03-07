// A program to take the even indexed elements of an array and sort them first,
// Then take the odd indexed elements and sort them in the second half
import java.util.Scanner;
public class Arrays17
{
    int [] nArray;
    int [] newArray;
    Arrays17 ()
    {
        nArray = new int [10];
        newArray = new int [10];
    }
    
    void Initialize ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the elements of the array");
        
        for (int i = 0; i<10; i++)
             nArray [i] = sc.nextInt ();
    }
    
    void Arrange ()
    {
        int a = 0; int b = 5;
        for (int i = 0; i<10; i++)
        {
            if (i%2 == 0)
            {
                newArray[a] = nArray[i];
                a++;
            }
            else
            {
                newArray[b] = nArray[i];
                b++;
            }
        }
    }
    
    void Sort ()
    {
        int temp;
        for (int i = 0; i<5; i++)
            for (int j = 0; j<5-1; j++)
                if (newArray [j] > newArray [j+1])
                {
                    temp = newArray [j];
                    newArray [j] = newArray [j+1];
                    newArray [j+1] = temp;
                }
        
        for (int i = 5; i<10; i++)
            for (int j = 5; j<10-1; j++)
                if (newArray [j] > newArray [j+1])
                {
                    temp = newArray [j];
                    newArray [j] = newArray [j+1];
                    newArray [j+1] = temp;
                }
               
    }
    
    void Display ()
    {
        System.out.println ("The new array is: ");
        for (int i = 0; i<10; i++)
             System.out.println (newArray [i]);
    }
    
    public static void main ()
    {
        Arrays17 obj = new Arrays17 ();
        obj.Initialize ();
        obj.Arrange ();
        obj.Sort ();
        obj.Display ();
    }
}
         