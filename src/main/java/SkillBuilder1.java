import java.util.Scanner;

/**
 * Skill Builder 0
 *
 * @author (You)
 * @version (2.1, 2.2)
 */
public class SkillBuilder1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("You're Jane's Friend!");
        System.out.println("\"What's your name?\"");
        String userName = input.nextLine();

        System.out.println(userName);

        System.out.println("Enter a floating point number:");
        double spice = input.nextDouble();



        double spiceD = (4.0/3) * Math.pow(2, ((Math.sqrt(5)) / Math.pow(spice, 3)));

        System.out.println("Well " + userName + ", the spice value resulted in " + spiceD);

        System.out.printf(" And the converted value is %.2f" , spiceD);

    }

    public static void calcWallPaint() {
        Scanner input = new Scanner(System.in);

        final double squareFeetPerGallons = 350.0;
        final double gallonsPerCan = 1.0;

        // Prompt user to input wall's width
        System.out.println("Enter wall height (feet):");
        double wallHeight = input.nextDouble();
        int H = (int) wallHeight;
        System.out.println(H);



        // Prompt user to input wall's width
        System.out.println("Enter wall width (feet):");
        double wallWidth = input.nextDouble();
        int W = (int) wallWidth;
        System.out.println(W);

        double area = (wallHeight * wallWidth);
        int A = (int) area;
        System.out.println("Wall area: " + A + " square feet");

        double paint = (area / squareFeetPerGallons);
        System.out.printf("Paint needed: %.2f gallons" , paint);

        double C = Math.ceil(paint);
        int can = (int) C;

        System.out.println("\nCans needed: " + can + " can(s)");

    }


}
