import java.util.Scanner;
public class BoardPaper2010_2
{
    String name [];
    double [] charge, dis, amt;
    BoardPaper2010_2 ()
    {
        name = new String [15];
        charge = new double [15];
        dis = new double [15];
        amt = new double [15];
    }
    
    void Initialize (int i)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the name of the customer");
        name [i] = sc.nextLine ();
        System.out.println ("Enter the ticket charges");
        charge [i] = sc.nextDouble ();
    }
    
    void Calculate (int i)
    {
        if (charge[i]>70000)
            dis [i] = (18*charge[i])/100;
        else if ((charge[i] <= 70000) && (charge[i] >= 55001))
            dis[i] = (16*charge[i])/100;
        else if ((charge[i] <= 55000) && (charge[i] >= 35001))
            dis[i] = (12*charge[i])/100;
        else if ((charge[i] <= 35000) && (charge[i] >= 25001))
            dis[i] = (10*charge[i])/100;
        else
            dis[i] = (2*charge[i])/100;
        amt[i] = charge[i] - dis[i];
    }
    
    void Display (int i)
    {
        System.out.println ("Sl.No" +"\t"+ "Name" +"\t   "+ "Ticket Charges" +"\t"+ "Discount" +"\t"+ "Net Amount");
        System.out.println (i+1 +"    \t"+ name[i] +"\t   "+ charge[i] +"\t       "+ dis[i] +"\t       "+ amt[i]);
        System.out.println ();
    }
    
    public static void main ()
    {
        BoardPaper2010_2 obj = new BoardPaper2010_2 ();
        for (int i = 0; i<5; i++)
        {
            obj.Initialize (i);
            obj.Calculate (i);
            obj.Display (i);
        }
    }
}


            