import java.util.Scanner;
public class ElectricityBill
{
    int unit,id;
    String name;
    double bill;
    void getData ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the name of the customer");
        name = sc.nextLine();
        System.out.println ("Enter the customer ID");
        id = sc.nextInt ();
        System.out.println ("Enter the units consumed");
        unit = sc.nextInt ();
    }
    
    void calculateBill () //methood to calculate the bill
    {
        if (unit<200)
            bill = unit*1.20;
        else if ((unit>=200) && (unit<400))
            bill = unit*1.50;
        else if ((unit>=400) && (unit<600))
            bill = unit*1.80;
        else
            bill = unit*2;
    }
    
    void display ()
    {
        if (bill<100) //To check if bill is less than 100
            System.out.println ("The bill cannot be displayed as it is less than 100");
        else if (bill>400)//To check if bill exceeds 400
            System.out.println("The bill is " +bill+((15*bill)/100));
        else
            System.out.println ("The bill is " +bill);
    }
    
    public static void main () //Main methood
    {
        ElectricityBill obj = new ElectricityBill ();
        obj.getData ();
        obj.calculateBill ();
        obj.display ();
    }
}
        
    