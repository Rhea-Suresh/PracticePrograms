public class BoardPaper2011_4
{
    void compare (int a, int b)
    {
        if (a>b)
            System.out.println ("The greater number is " +a);
        else
            System.out.println ("The greater integer is " +b);
    }
    
    void compare (char a, char b)
    {
        if ((int)a > (int)b)
            System.out.println ("The greater character is " +a);
        else 
            System.out.println ("The greater character is " +b);
    }
    
    void compare (String a, String b)
    {
        if (a.length() > b.length())
            System.out.println ("The longer word is " +a);
        else 
            System.out.println ("The longer word is " +b);
    }
}


