// Board Paper 2010: Question 5
import java.util.Scanner;
public class BoardPaper2010_1
{
    String name;
    int age, m1, m2, m3, max, avg;
    BoardPaper2010_1 ()
    {
        age = 0; 
        m1 = 0;
        m2 = 0; 
        m3 = 0; 
        max = 0;
        avg = 0;
        name = "";
    }
    
    void Initialize ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the name of the student");
        name = sc.nextLine ();
        System.out.println ("Enter the age of the student");
        age = sc.nextInt ();
        System.out.println ("Enter the marks scored in Science");
        m1 = sc.nextInt ();
        System.out.println ("Enter the marks scored in Mathematics");
        m2 = sc.nextInt ();
        System.out.println ("Enter the marks scored in English");
        m3 = sc.nextInt ();
    }
    
    void Calculate ()
    {
        if (m1>m2 && m1>m3)
            max = m1;
        else if (m2>m1 && m2>m3)
            max = m2;
        else
            max = m3;
        avg = (m1+m2+m3)/3;
    }
    
    void Display ()
    {
        System.out.println ("The name of the student is " +name);
        System.out.println ("The age of the student is " +age);
        System.out.println ("The marks of the student in Science is " +m1);
        System.out.println ("The marks of the student in Mathematics is " +m2);
        System.out.println ("The marks of the student in English is " +m3);
        System.out.println ("The maximum marks of the student is " +max);
        System.out.println ("The average marks of the student is " +avg);
    }
    
    public static void main ()
    {
        BoardPaper2010_1 obj = new BoardPaper2010_1 ();
        obj.Initialize ();
        obj.Calculate ();
        obj.Display ();
    }
}
