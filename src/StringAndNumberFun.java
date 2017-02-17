import java.util.Scanner;

/**
 * This class first takes inputs from the user and manipulates it in different ways,
 * some defined by the user and others by a preset system
 *
 * All output handled by the main function
 *
 * @author Ethan Dritz
 * @version 2/16/17
 */
public class StringAndNumberFun
{
    public static void main(String[] args)
    {
        //Scanner class for users input
        Scanner console = new Scanner(System.in);

        //Name segment
        System.out.println("Please enter your first name:");
        String FirstName = console.next();
        System.out.println("Please enter your last name:");
        String LastName = console.next();
        console.nextLine();

        String FullName = FirstName.concat(" " + LastName);
        System.out.println("Hi " + FullName.toUpperCase());

        System.out.println(reverseName(FullName) + "\n");

        System.out.println(FirstName + " " + LastName + "'s standard user name is: " + getUserName(FirstName, LastName) + "\n");

        //Phrase segment
        System.out.println("Please enter a phrase:");
        String phrase = console.nextLine();
        System.out.println("Enter a letter to replace");
        String removed = console.next();
        System.out.println("Enter the letter you want '" + removed + "' to be replaced by:");
        String replacement = console.next();
        System.out.println("The new phrase is: " + getMutatedPhrase(phrase, removed, replacement) + "\n");

        //Exponent segment
        System.out.println("Enter a number between 2 and 8");
        int firstNumber = console.nextInt();
        System.out.println("Enter another number between 2 and 8");
        int secondNumber = console.nextInt();
        System.out.println(firstNumber + "^" + secondNumber + " = " + getPowerOfValue(firstNumber, secondNumber));
    }

    /*Takes a string and returns the strings characters in reverse order
     *
     *@param String entireName: takes the full name of the user
     */
    public static String reverseName(String entireName)
    {
        int counter = entireName.length() - 1;
        String reverseName = "";
        for(int x = counter; x >= 0; x--)
        {
            reverseName += entireName.charAt(x);
        }
        return reverseName;
    }

    /*Takes the users first and last name and returns a username with the first letter of the users first name and the
     *full last name
     *
     * @param String UsersFirst: takes the users first name
     * @param String UsersLast: takes the users last name
     */
    public static String getUserName(String UsersFirst, String UsersLast)
    {
        String userName = "";
        userName += UsersFirst.charAt(0) + UsersLast;
        userName = userName.toLowerCase();
        return userName;
    }

    /*Takes the phrase, the character to be replaced, and the character to replace it with and returns with the
     *edited phrase
     *
     * @param String usersPhrase: Takes the phrase that the user entered
     * @param String oldChar: the character that is to be replaced
     * @param String newChar: the character that is replacing the other
     */
    public static String getMutatedPhrase(String usersPhrase,String oldChar, String newChar)
    {
        String mutatedPhrase = usersPhrase.replace(oldChar, newChar);
        return mutatedPhrase;
    }

    /*Takes a base and a power and returns the calculation
     *
     * @param int base: base number to which will be raised to a specified power
     * @param int power: power that the base will be raised to
    */
    public static double getPowerOfValue(int base, int power)
    {
        double lastNumber = Math.pow(base, power);
        return lastNumber;
    }


}
