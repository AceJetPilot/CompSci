/**
 * Created by Ethan on 1/25/2017.
 */
public class Multiplication
{
    public static final int TABLE_COUNT = 9;
    public static void main(String[] args)
    {
        greetUser();
        drawHeader();
        fillTable();
        goodbyeMessage();
    }

    //Standard greeting for the user
    public static void greetUser()
    {
        System.out.println("\tWelcome to the Multipication");
        System.out.println("\t\tTable Application");
    }

    /*
     *Draws the header for the multiplication table
     *Now based on the static integer: TABLE_COUNT
     */
    public static void drawHeader()
    {
        for(int z = 1; z <= TABLE_COUNT; z++)
        {
            System.out.print("\t" + z);
        }
        System.out.println("\n");
    }

    //Fills the table with multiplication table numbers
    public static void fillTable()
    {
        for(int x = 1; x <= TABLE_COUNT; x++)
        {
            System.out.print(x);
            for(int y = 1; y <= TABLE_COUNT; y++)
            {
                System.out.print("\t" + x * y);
            }
            System.out.println();
        }
        System.out.println();
    }

    //prints goodbye to users
    public static void goodbyeMessage()
    {
        System.out.println("\tGoodbye and thank you for using");
        System.out.println("\tthe multiplication application!");
    }
}