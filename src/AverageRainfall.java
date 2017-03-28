import java.util.Scanner;

/**
 * @Author: Ethan Dritz
 *
 * @Version: 3/24/17
 *
 * This program calculates the average rainfall over the course of a year and repeats the process for a specified
 * number of years.
 */
public class AverageRainfall
{
    private static Scanner console = new Scanner(System.in);
    private static final int NUM_MONTHS = 12;

    public static void main(String[] args)
    {
        String choice;
        String negative = "N";

        giveIntro();

        //Program runs the first time through and then reruns until the user enters "N" or "n"
        do {
            int years = getNumberOfYears();
            double totalRainfall = getTotalRainfall(years);
            double averageRainfall = calculateTotalRainfall(years, totalRainfall);

            System.out.println("\nNumber of months: " + years * 12);
            System.out.println("Total Rainfall: " + totalRainfall);
            System.out.println("Average monthly rainfall: " + averageRainfall);
            System.out.println("Would you like to use the Rainfall Calculator again? (Y/N): ");
            console.nextLine();
            choice = console.nextLine();
        }while(!choice.equalsIgnoreCase(negative));

    }

    //Standard Greeting for the user
    public static void giveIntro()
    {
        System.out.println("Welcome to the Rainfall Calculator");
    }

    public static int getNumberOfYears()
    {
        System.out.println("Please enter the number of years:");
        while(!console.hasNextInt() && console.nextInt() >= 1)
        {
            console.next();
            System.out.println("Not an integer or not above zero, try again");
        }
        return console.nextInt();
    }

    /*
     * Takes the number of years as a parameter and then has the user fill in the rainfall for each month of the specified
     * time (e.x. 1 year is 12 entries, 2 years is 24 entries, etc.). Returns the total number of rainfall for the given
     * period
     *
     * @param int years: The number of years to which the entry spans
     *
     * @return: The total added rainfall over the entire period.
     */
    public static double getTotalRainfall(int years)
    {
        double totalRain = 0;

        if(years < 1)
        {
            throw new IllegalArgumentException("Years number entered was below zero");
        }

        for(int currentYear = 1; currentYear <= years; currentYear++)
        {
            for(int currentMonth = 1; currentMonth <= NUM_MONTHS; currentMonth++)
            {
                System.out.println("Year " + currentYear + " Month " + currentMonth + ": ");
                while(!console.hasNextDouble() && console.nextDouble() < 0)
                {
                    console.next();
                    System.out.println("Error: Either you didn't enter a number of you entered negative rainfall, try again");
                }
                totalRain += console.nextDouble();
            }
        }
        return totalRain;
    }

    /*
     * Takes the total rainfall and averages it by the total number of years, multiplied by months to get the average
     * monthly rainfall. This average is then returned.
     *
     * @param int years: the total number of years which the data is collected
     * @param double totalRain: the total rainfall over the time-span
     *
     * @return: the average monthly rainfall
     */
    public static double calculateTotalRainfall(int years, double totalRain)
    {
        if(years < 0)
        {
            throw new IllegalArgumentException("Error: Years are zero or below zero");
        }
        if(totalRain < 0)
        {
            throw new IllegalArgumentException("Error: total rain is a negarive number");
        }

        return totalRain / (NUM_MONTHS * years);
    }


}
