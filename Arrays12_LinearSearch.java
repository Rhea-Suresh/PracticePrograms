// Program to initialize an array of 5 names and initialize another array with their respective telephone numbers
//Search for a name input by the user in the list
//If found, display "Search Successful" and print the name along with the telephone number
//Otherwise display "Search unsuccessful. Name not enlisted"
import java.util.Scanner;
public class Arrays12_LinearSearch
{
    String [] nameArray;
    String [] telArray;
    
    void initialize ()
    {
        String [] strArray = {"Hasan","Urmi","Sayali","Prerna","Surabhi","Shabnam","Sood"};
        String [] numArray = {"09897940001","09897940002","09897940003","09897940004","09897940005","09897940006","09897940007"};
        nameArray = strArray;
        telArray = numArray;
    }
    
    void search (String sName) //Linear Search
    {
        int pos = -1;
        
        for (int i = 0; i<=nameArray.length-1; i++)
             if (nameArray[i].equals(sName))
                 pos = i;
                 
        if (pos == -1)
            System.out.println ("Search unsuccessful.Name not enlisted");
        else
            System.out.println ("Search successful. Name: " +nameArray[pos]+ "; Telephone number: " +telArray[pos]);
    }
    
    public static void main ()
    {
        Arrays12_LinearSearch obj = new Arrays12_LinearSearch ();
        
        obj.initialize ();
        
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the name to be searched for");
        String name = sc.next();
        
        obj.search (name);
    }
}
        
    
    