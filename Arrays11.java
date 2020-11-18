// A program to pass the monthly salaries of 5 employees in an array and
// Count the number of employees earning more than 1 Lakh per annum
import java.util.Scanner;
public class Arrays11
{
    int [] Salary;
    
    Arrays11 ()
    {
        Salary = new int [5];
    }
    
    void initialize ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the monthly salaries of 5 employees");
        
        for (int i = 0; i<=Salary.length-1; i++)
             Salary[i] = sc.nextInt ();
    }
    
    void count ()
    {
        int s;
        int count = 0;
        for (int i = 0; i<=Salary.length-1; i++)
        {
            s = Salary[i]*12; //To find the annual income from the monthly salaries
            if (s >= 100000)
                count++;
        }
        System.out.println (+count+ " employee/employees have an annual income of more than 1 lakh");
    }
    
    public static void main ()
    {
        Arrays11 obj = new Arrays11 ();
        obj.initialize ();
        obj.count ();
    }
}