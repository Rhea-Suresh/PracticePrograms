import java.util.Scanner;
public class BoardPaper2020_1
{
    String car_type;
    double km, bill;
    
    BoardPaper2020_1 ()
    {
        car_type = "";
        km = 0.0;
        bill = 0.0;
    }
    
    void accept ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the car type (AC or Non-AC)");
        car_type = sc.nextLine ();
        System.out.println ("Enter the distance to be travelled (in kms)");
        km = sc.nextDouble ();
    }
    
    void calculate ()
    {
        if (car_type.equalsIgnoreCase("AC") == true)
        {
            if (km<5)
               bill = 150;
            else 
                bill = 150 + (10*(km-5));
        }
        else 
        {
            if (km<5)
               bill = 120;
            else 
                bill = 120 + (8*(km-5));
        }
    }
    
    void display ()
    {
        System.out.println ("CAR TYPE: " +car_type);
        System.out.println ("KILOMETER TRAVELLED: " +km);
        System.out.println ("TOTAL BILL: " +bill);
    }
    
    public static void main ()
    {
        BoardPaper2020_1 obj = new BoardPaper2020_1 ();
        obj.accept ();
        obj.calculate ();
        obj.display ();
    }
}

                