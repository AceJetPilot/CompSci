import java.util.Scanner;

/**
 * This program is designed to take the weighted average of a users quizes, tests, homework, and final exam and return
 * their final grade
 *
 * @Author Ethan Dritz
 * @Version 2/25/2017
 */
public class Grades
{
    //Scanner declared globally for use in methods
    private static Scanner console;

    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        giveIntro();

        System.out.print("Homework: ");
        int homeworkWeight = console.nextInt();
        System.out.print("Quizzes: ");
        int quizWeight = console.nextInt();
        System.out.print("Tests: ");
        int testWeight = console.nextInt();
        int finalWeight = 100 - (quizWeight + testWeight + homeworkWeight);
        System.out.print("Final Exam: " + finalWeight);
        System.out.println();

        double finalGrade = calculateFinalGrade(quizWeight, testWeight, homeworkWeight, finalWeight);
        System.out.printf("Your final grade is: %.2f \n", finalGrade);
        getFinalLetterGrade(finalGrade);
    }

    //Gives a standard greeting to the user and describes the purpose to the program
    public static void giveIntro()
    {
        System.out.println("Welcome to the grade calculator\n");
        System.out.println("This program will input your homework, quizzes, tests,\nand final exam and calculate you average");
        System.out.println("Please enter the weights for the following categories....\n");

    }

    /*
     * Prompts the user to enter the number of grades that will be entered and then has the user enter grades one at a
     * time and then returns the average.
     */
    public static double getHomeworkAvg()
    {
        Scanner console = new Scanner(System.in);

        System.out.print("How many homework grades need to be entered?: ");
        int gradeNumbers = console.nextInt();
        double rawTotal = 0;
        for(int x = 1; x <= gradeNumbers; x++)
        {
            System.out.print("Grade " + x + ": ");
            rawTotal += console.nextDouble();
        }
        return rawTotal / gradeNumbers;
    }

    public static double getQuizAvg()
    {
        Scanner console = new Scanner(System.in);

        System.out.print("How many quiz grades need to be entered?: ");
        int gradeNumbers = console.nextInt();
        double rawTotal = 0;
        for(int x = 1; x <= gradeNumbers; x++)
        {
            System.out.print("Grade " + x + ": ");
            rawTotal += console.nextDouble();
        }
        return rawTotal / gradeNumbers;
    }

    public static double getTestAvg()
    {
        Scanner console = new Scanner(System.in);

        System.out.print("How many test grades need to be entered?: ");
        int gradeNumbers = console.nextInt();
        double rawTotal = 0;
        for(int x = 1; x <= gradeNumbers; x++)
        {
            System.out.print("Grade " + x + ": ");
            rawTotal += console.nextDouble();
        }
        return rawTotal / gradeNumbers;
    }

    //Takes and returns the users final exam grade
    public static double getFinalExamGrade()
    {
        Scanner console = new Scanner(System.in);

        System.out.print("Please enter your final exam grade: ");
        return console.nextDouble();
    }

    /*
     * Takes in the weights for quizzes, tests, homework, and the final as its parameters, subtotals each corresponding
     * section by multiplying it by its average, adds all subtotals together and finally divides it all by 100 to get
     * the final number grade. Returns this final number.
     *
     * @quizWeight: the weight of the quiz grades
     * @testWeight: the weight of the test grades
     * @homeworkWeight: the weight of the homework grades
     * @finalWeight: the weight of the final grade
     */
    public static double calculateFinalGrade(int quizWeight, int testWeight, int homeworkWeight, int finalWeight)
    {
        if(quizWeight < 0 || testWeight < 0 || homeworkWeight < 0 || finalWeight < 0)
        {
            throw new IllegalArgumentException("Error: All weights must have a value above zero");
        }
        double homeworkSub = homeworkWeight * getHomeworkAvg();
        double quizSub = quizWeight * getQuizAvg();
        double testSub = testWeight * getTestAvg();
        double finalSub = finalWeight * getFinalExamGrade();

        return (quizSub + testSub + homeworkSub + finalSub)/100;
    }

    /*
     * Takes the grade percentage and prints out the letter grade corresponding to that number
     *
     * @gradePercentage: the calculated number grade
     */
    public static void getFinalLetterGrade(double gradePercentage)
    {
        if(gradePercentage < 0)
        {
            throw new IllegalArgumentException("Error: the final grade must be zero or above");
        }
        if(gradePercentage >= 90)
        {
            System.out.println("Great job - You earned an A");
        }
        else if(gradePercentage >= 80)
        {
            System.out.println("Good job - You earned a B");
        }
        else if(gradePercentage >= 70)
        {
            System.out.println("Good but you can do better - You earned a C");
        }
        else if(gradePercentage >= 60)
        {
            System.out.println("Well that could have gone better - You earned a D");
        }
        else
        {
            System.out.println("Oh no, better luck next time - You earned a F");
        }
    }

}
