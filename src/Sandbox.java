/**
 * Created by dritz on 1/26/2017.
 */
public class Sandbox
{
    public static void main(String[] args)
    {
        int total = 25;
        for(int number = 1; number <= (total/2); number++)
        {
            total = total - number;
            System.out.println(total + " " + number);
        }
        System.out.println();
        System.out.println("+----+");
        for(int i = 1; i <= 3; i++)
        {
            System.out.println("\\   /");
            System.out.println("/   \\");
        }
        System.out.println("+----+");
    }
}
