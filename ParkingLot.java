//Board Paper 2015
import java.util.Scanner;
public class ParkingLot
{
    int vno,hours;
    double bill;
    void input ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the vehicle number");
        vno = sc.nextInt();
        System.out.println ("Enter the number of hours consumed");
        hours = sc.nextInt();
    }
    
    void calculate ()
    {
        if (hours == 1)
            bill = 3.0;
        else
            bill = 3 + (1.5 * (hours-1));
    }
    
    void display ()
    {
        System.out.println ("The bill is " +bill);
    }
    
    public static void main ()
    {
        ParkingLot obj = new ParkingLot ();
        obj.input ();
        obj.calculate ();
        obj.display ();
    }
}
