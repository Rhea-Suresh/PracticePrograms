import java.util.Scanner;
public class BoardPaper2010_4
{
    int [] P, Q, R;
    BoardPaper2010_4 ()
    {
        P = new int [6];
        Q = new int [4];
        R = new int [10];
    }
    
    void Initialize ()
    {
        Scanner sc = new Scanner (System.in);
        
        System.out.println ("Enter the elements for array P");
        for (int i = 0; i<6; i++)
           P[i] = sc.nextInt ();
        
        System.out.println ("Enter the elements for array Q");
        for (int i = 0; i<4; i++)
           Q[i] = sc.nextInt ();
    }
    
    void Calculate ()
    {
        for (int i = 0; i<6; i++)
            R[i] = P[i];
        
        for (int i = 0, j = 6; i<4; i++,j++)
            R[j] = Q[i];
    }
    
    void Display ()
    {
        System.out.println ("The elements in array R");
        for (int i = 0; i<10; i++)
             System.out.println (R[i]);
    }
    
    public static void main ()
    {
        BoardPaper2010_4 obj = new BoardPaper2010_4 ();
        obj.Initialize ();
        obj.Calculate ();
        obj.Display ();
    }
}

        