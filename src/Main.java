import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
	Scanner in = new Scanner(System.in);
    int sideLeft = 0;
    int sideTop = 0;
    int sideRight = 0;
    int sideBottom = 0;
    double recArea;
    double recPerim;
    double recDiagonal;
    double pythTheory;
    String trash;



        System.out.print("Enter the length for Left side: ");

        if (in.hasNextInt())
        {
            sideLeft = in.nextInt();
            in.nextLine(); // Clear the input buffer
        }
        else
        {
            trash = in.nextLine();
            System.out.println("\n You must enter a valid integer and not " + trash);
            System.out.println("Run the program again!");
            System.exit(0);
        }

        System.out.print("Enter the length for Top side: ");

        if (in.hasNextInt())
        {
            sideTop = in.nextInt();
            in.nextLine(); // Clear the input buffer
        }
        else
        {
            trash = in.nextLine();
            System.out.println("\n You must enter a valid integer and not " + trash);
            System.out.println("Run the program again!");
            System.exit(0);
        }

        System.out.print("Enter the length for Right side: ");

        if (in.hasNextInt())
        {
            sideRight = in.nextInt();
            in.nextLine(); // Clear the input buffer
        }
        else
        {
            trash = in.nextLine();
            System.out.println("\n You must enter a valid integer and not " + trash);
            System.out.println("Run the program again!");
            System.exit(0);
        }

        System.out.print("Enter the length for Bottom Side: ");

        if (in.hasNextInt())
        {
            sideBottom = in.nextInt();
            in.nextLine(); // Clear the input buffer

        }
        else
        {
            trash = in.nextLine();
            System.out.println("\n You must enter a valid integer and not " + trash);
            System.out.println("Run the program again!");
            System.exit(0);
        }

        recArea = sideTop * sideLeft;
        recPerim = sideLeft + sideTop + sideRight + sideBottom;
        pythTheory = ((sideLeft * sideLeft) + (sideBottom * sideBottom));
        recDiagonal = Math.sqrt(pythTheory);

        System.out.println("\n The area of the rectangle is " + recArea + " and the perimeter is " + recPerim);
        System.out.println("\n The legnth of the diagonal is " + recDiagonal);
    }
}
