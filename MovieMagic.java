//Board Paper 2014
import java.util.Scanner;
public class MovieMagic
{
    int year;
    String title;
    float rating;
    
    MovieMagic ()
    {
        year = 0;
        title = "";
        rating = (float)0.0;
    }
    
    void accept ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the title of the movie:");
        title = sc.nextLine();
        System.out.println ("Enter the year of release of the movie:");
        year = sc.nextInt ();
        System.out.println ("Enter the rating for the movie between 0-5");
        rating = sc.nextFloat ();
    }
    
    void display ()
    {
        System.out.println ("The title of the movie is " +title);
        if ((rating>=0.0) && (rating<=2.0))
            System.out.println ("Flop Movie");
        else if ((rating>=2.1) && (rating<=3.4))
            System.out.println ("Semi-Hit Movie");
        else if ((rating>=3.5) && (rating<=4.5))
            System.out.println ("Hit Movie");
        else if ((rating>=4.6) && (rating<=5.0))
            System.out.println ("Super-Hit Movie");
        else
            System.out.println ("Invalid Ratings");
    }
    
    public static void main ()
    {
        MovieMagic obj = new MovieMagic ();
        obj.accept ();
        obj.display ();
    }
}
