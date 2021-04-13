import java.util.Scanner;
public class BoardPaper2011_2
{
    double [] weight;
    BoardPaper2011_2 ()
    {
        weight = new double [10];
    }
    
    void Input ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the weights of ten people");
        for (int i = 0; i<10; i++)
             weight [i] = sc.nextDouble ();
    }
    
    void Arrange ()
    {
         double temp;
         for (int i = 0; i<=weight.length-2; i++)
         {
             for (int j = 0; j<=weight.length-2; j++)
             {
                  if (weight[j] < weight[j+1])
                  {
                      temp = weight [j];
                      weight [j] = weight [j+1];
                      weight [j+1] = temp;
                  }
             }
         }
    }
    
    void Display ()
    {
        System.out.println ("The weights in descending order is ");
        for (int i = 0; i<10; i++)
             System.out.println (weight[i]);
    }
     
    public static void main ()
    {
        BoardPaper2011_2 obj = new BoardPaper2011_2 ();
        obj.Input ();
        obj.Arrange ();
        obj.Display ();
    }
}

         