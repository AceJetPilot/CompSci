/**
 * Created by Ethan on 1/25/2017.
 */
public class Multipication
{
    public static void main(String[] args)
    {
        greetUser();
        drawHeader();
        fillTable();
        goodbyeMessage();
    }

    public static void greetUser()
    {
        System.out.println("\tWelcome to the Multipication");
        System.out.println("\t\tTable Application");
    }

    public static void drawHeader()
    {
        System.out.println("\t1\t2\t3\t4\t5\t6\t7\t8\t9\n");
    }

    public static void fillTable()
    {
        for(int x = 1; x <= 9; x++)
        {
            System.out.print(x);
            for(int y = 1; y <= 9; y++)
            {
                System.out.print("\t" + x * y);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void goodbyeMessage()
    {
        System.out.println("\tGoodbye and thank you for using");
        System.out.println("\tthe multiplication application!");
    }
}