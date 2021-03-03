import java.util.Scanner;
public class BoardPaper2019_1
{
    String name;
    long mobno;
    double cost, dis, amount;
    
    BoardPaper2019_1 ()
    {
        name = " ";
        mobno = 0000;
        cost = 00.00;
    }
    
    void input ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the name of the customer");
        name = sc.nextLine ();
        System.out.println ("Enter the mobile number of the customer");
        mobno = sc.nextLong ();
        System.out.println ("Enter the cost of the items purchased by the customer");
        cost = sc.nextDouble ();
    }
    
    void calculate ()
    {
        if (cost<=10000)
            dis = cost * 5/100;
        else if ((cost>10000)&&(cost<=20000))
            dis = cost*10/100;
        else if ((cost>20000)&&(cost<=35000))
            dis = cost*15/100;
        else
            dis = cost * 20/100;
        amount = cost - dis;
    }
    
    void display ()
    {
        System.out.println ("The name of the customer is " +name);
        System.out.println ("The mobile number of the customer is " +mobno);
        System.out.println ("The amount to be paid after discount is " +amount);
    }

    public static void main ()
    {
     BoardPaper2019_1 obj = new BoardPaper2019_1();
     obj.input();
     obj.calculate();
     obj.display();
    }
}
