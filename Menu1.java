//A menu driven program to calculate the volume of a sphere, cone and cylinder
import java.util.Scanner;
class Menu1
{
    void generateMenu ()
    {
        System.out.println ("What would you like to do?");
        
        System.out.println ("1. Calculate the volume of Sphere");
        System.out.println ("2. Calculate the volume of Cylinder");
        System.out.println ("3. Calculate the volume of Cone");
        
       System.out.println ("Press any integer other than 1, 2 or 3 to exit");
    }
    
    void SphereVolume ()
    {
        Scanner sc = new Scanner (System.in);
        double volume;
        int radius;
        
        System.out.println ("Enter the radius of the sphere:");
        radius = sc.nextInt ();
        
        volume = (4/3) * (3.14) * radius * radius * radius;
        System.out.println ("The Volume of the Sphere is " +volume);
    }
    
    void CylinderVolume ()
    {
        Scanner sc = new Scanner (System.in);
        double volume;
        int radius, height;
        
        System.out.println ("Enter the radius of the cylinder:");
        radius = sc.nextInt ();
        System.out.println ("Enter the height of the cylinder:");
        height = sc.nextInt ();
        
        volume = (3.14) * radius * radius * height;
        System.out.println ("The Volume of the Sphere is " +volume);
    }
    
    void ConeVolume ()
    {
        Scanner sc = new Scanner (System.in);
        double volume;
        int radius, height;
        
        System.out.println ("Enter the radius of the cylinder:");
        radius = sc.nextInt ();
        System.out.println ("Enter the height of the cylinder:");
        height = sc.nextInt ();
        
        volume = (3.14) * radius * radius * (height/3);
        System.out.println ("The Volume of the Sphere is " +volume);
    }
    
    public static void main ()
    {
        Scanner sc = new Scanner (System.in);
        Menu1 obj = new Menu1 ();
        char choice;
        int option;
        
        do
        {
            obj.generateMenu ();
            System.out.println ("Enter your selection [1/2/3]:");
            option = sc.nextInt ();
            
            if (option==1)
                obj.SphereVolume ();
            else if (option == 2)
                obj.CylinderVolume ();
            else if (option == 3)
                obj.ConeVolume ();
            else
                return;
            
            System.out.println ("Would you like to continue [y/n]?");
            choice = sc.next().charAt(0);
        } while (choice == 'y');
        
    }
}

    
    
    