// Board Paper 2009
import java.util.Scanner;
public class ElectronicShop
{
    String name, address;
    double discount, amount, net;
    char type;
    void getData ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the name of the customer");
        name = sc.nextLine();
        System.out.println ("Enter the address of the customer");
        address = sc.nextLine();
        System.out.println ("Enter the amount of purchase");
        amount = sc.nextDouble();
        System.out.println ("Enter the type of purchase [L/D]");
        type = sc.next().charAt(0);
    }
    
    void calculate ()
    {
        switch (type)
        {
            case 'L': 
                     if (amount<=25000)
                         discount = 0;
                     else if ((amount>25000) && (amount<=57000))
                         discount = (5.0/100)*amount;
                     else if ((amount>57000) && (amount<=100000))
                         discount = (7.5/100)*amount;
                     else 
                         discount = (10.0/100)*amount;
                     break;
            case 'D': 
                     if (amount<=25000)
                         discount = (5.0/100)*amount;
                     else if ((amount>25000) && (amount<=57000))
                         discount = (7.5/100)*amount;
                     else if ((amount>57000) && (amount<=100000))
                         discount = (10.0/100)*amount;
                     else 
                         discount = (15.0/100)*amount;
                     break;
            default: 
                    System.out.println ("Invalid Character");
        }
        net = amount - discount;
    }
    
    void display ()
    {
        System.out.println ("The name of the customer is " +name); 
        System.out.println ("The address of the customer is " +address);
        System.out.println ("The net amount to be paid by the customer is " +net);
    }

    public static void main ()
    {
         ElectronicShop obj = new ElectronicShop ();
         obj.getData ();
         obj.calculate ();
         obj.display ();
    }
} 