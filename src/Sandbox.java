import java.util.Scanner;

/**
 * Created by dritz on 1/26/2017.
 */
public class Sandbox
{
    public static void main(String[] args)
    {
        double a = 77.0;
        double b = 3.0;
        double c = a / b;
        System.out.println(c);
        System.out.println(test());

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

    public static double test()
    {
        double a = 77.0;
        int b = 3;
        double c = a / b;
        return c;
    }
}
