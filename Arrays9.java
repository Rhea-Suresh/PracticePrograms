//A program to store a student's marks of 5 subjects in a array named Marks  
// Calculate the total and average marks
import java.util.Scanner;
public class Arrays9
{
    int sum, avg;
    int [] Marks;
    
    Arrays9 ()
    {
        Marks = new int [5];
    }
    
    void Initialize ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the Marks of the Student in 5 subjects");
        
        for (int i = 0; i<=Marks.length-1; i++)
             Marks[i] = sc.nextInt ();
    }
    
    void TotalMarks ()
    {
        for (int i = 0; i<=Marks.length-1; i++)
             sum = sum + Marks[i];
        System.out.println ("The total marks scored by the student is " +sum);
    }
    
    void AverageMarks ()
    {
        avg = sum/5;
        System.out.println ("The average marks secured by the student is " +avg);
    }
    
    public static void main ()
    {
        Arrays9 obj = new Arrays9 ();
        obj.Initialize ();
        obj.TotalMarks ();
        obj.AverageMarks ();
    }
}
   