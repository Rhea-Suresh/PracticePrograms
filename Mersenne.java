
public class Mersenne 
{
    void MersenneNos ()
    {
        double m;
        System.out.println ("The first 20 Mersenne numbers are: ");
        for (int i = 1; i<=20; i++)
        {
            m = (Math.pow(2,i))-1;
            System.out.println (m);
        }
    }
    
    public static void main ()
    {
        Mersenne obj = new Mersenne ();
        obj.MersenneNos ();
    }
}