// A menu driven program to find the area and perimeter of a square, rectangle, triangle and circle
import java.util.Scanner;
class Menu7
{
    void generateMenu ()
    {
        System.out.println ("What would you like to do?");
        System.out.println ();
        
        System.out.println ("1. Calculate the area and perimeter of a square");
        System.out.println ("2. Calculate the area and perimeter of a rectangle");
        System.out.println ("3. Calculate the area and perimeter of a triangle");
        System.out.println ("4. Calculate the area and perimeter of a circle");
        
        System.out.println ();
        System.out.println ("Press any integer other than 1, 2, 3 or 4 to exit");
        System.out.println ();
    }
    
    void Square ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the length of the side of the square");
        double s = sc.nextDouble ();
        
        double area = s*s;
        double peri = 4*s;
        
        System.out.println ("The area of the square is " +area);
        System.out.println ("The perimeter of the square is " +peri);
    }
    
    void Rectangle ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the length of the rectangle");
        double l = sc.nextDouble ();
        System.out.println ("Enter the breadth of the rectangle");
        double b = sc.nextDouble ();
        
        double area = l*b;
        double peri = 2*(l+b);
        
        System.out.println ("The area of the rectangle is " +area);
        System.out.println ("The perimeter of the rectangle is " +peri);
    }
    
    void Triangle ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the height of the triangle");
        double h = sc.nextDouble ();
        System.out.println ("Enter the base of the triangle");
        double b = sc.nextDouble ();
        
        double area = (h*b)/2;
        System.out.println ("The area of the triangle is " +area);
    }
    
    void Circle ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the raduis of the circle");
        double r = sc.nextDouble ();
        double pi = 22;
        
        double area = (pi*r*r)/7;
        double peri = (2*pi*r)/7;
        
        System.out.println ("The area of the circle is " +area);
        System.out.println ("The perimeter of the circle is " +peri);
    }
    
    public static void main ()
    {
        Scanner sc = new Scanner (System.in);
        Menu7 obj = new Menu7 ();
        char choice;
        int option;
        
        do
        {
            obj.generateMenu ();
            System.out.println ("Enter your selection [1/2/3/4]:");
            option = sc.nextInt ();
            
            if (option==1)
                obj.Square ();
            else if (option == 2)
                obj.Rectangle ();
            else if (option == 3)
                obj.Triangle ();
            else if (option == 4)
                obj.Circle ();
            else
                return;
            
            System.out.println ("Would you like to continue [y/n]?");
            choice = sc.next().charAt(0);
        } while (choice == 'y');
        
    }
}

    