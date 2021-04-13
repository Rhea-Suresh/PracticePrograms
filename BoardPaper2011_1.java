import java.util.Scanner;
public class BoardPaper2011_1
{
    int bno, phno, days, charge;
    String name;
    void Input ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the name of the customer");
        name  = sc.next ();
        System.out.println ("Enter the bike number");
        bno = sc.nextInt ();
        System.out.println ("Enter the phone number");
        phno = sc.nextInt ();
        System.out.println ("Enter the number of days the bike is taken on rent");
        days = sc.nextInt ();
    }
    
    void Compute ()
    {
        if (days <= 5)
           charge  = 500*days;
        else if (days>5 && days <=10)
            charge = (500*5) + (400*(days-5));
        else 
            charge = (500*5) + (400*5) + (200 * (days-10));
    }
    
    void Display ()
    {
        System.out.println ("Bike No." +"\t"+ "Phone No." +"\t"+ "Name" +"\t"+ "No. of days" +"\t"+ "Charge");
        System.out.println (bno +"        \t"+ phno +"      \t"+ name +"  \t"+ days +"          \t"+ charge);
    }
    
    public static void main ()
    {
        BoardPaper2011_1 obj = new BoardPaper2011_1 ();
        obj.Input ();
        obj.Compute ();
        obj.Display ();
    }
}
