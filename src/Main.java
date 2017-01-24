/**
 * Created by Ethan on 1/24/2017.
 */
public class Main
{
    public static void main(String[] args) {
        drawT();
        drawE();
        drawN();
        drawN();
        drawE();
        drawS();
        drawS();
        drawE();
        drawE();
    }

    public static void drawT() {
        System.out.println("MMMMMMM");
        System.out.println("   M   ");
        System.out.println("   M   ");
        System.out.println("   M   ");
        System.out.println("   M   ");
        System.out.println("   M   ");
        System.out.println("   M   ");
    }

    public static void drawE() {
        System.out.println("MMMMMMM");
        System.out.println("M");
        System.out.println("M");
        System.out.println("MMMMMMM");
        System.out.println("M");
        System.out.println("M");
        System.out.println("MMMMMMM");
    }

    public static void drawN() {
        System.out.println("M     M");
        System.out.println("MM    M");
        System.out.println("M M   M");
        System.out.println("M  M  M");
        System.out.println("M   M M");
        System.out.println("M    MM");
        System.out.println("M     M");
        System.out.println();
    }

    public static void drawS() {
        System.out.println(" MMMMM ");
        System.out.println("M     M");
        System.out.println("M");
        System.out.println(" MMMMM ");
        System.out.println("      M");
        System.out.println("M     M");
        System.out.println(" MMMMM ");
    }
}
