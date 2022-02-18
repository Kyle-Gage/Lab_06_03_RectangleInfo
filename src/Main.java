import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double height = 0;
        double width = 0;
        double recArea; // height * width
        double recPerim; // 2 * (height + width)
        double recDiagonal; // c = square root (height^2 + width^2)
        double pythTheory;
        String trash;



        System.out.print("Enter the length for hieght: ");

        if (in.hasNextDouble())
        {
            height = in.nextInt();
            in.nextLine(); // Clear the input buffer
        }
        else
        {
            trash = in.nextLine();
            System.out.println("\n You must enter a valid integer and not " + trash);
            System.out.println("Run the program again!");
            System.exit(0);
        }

        System.out.print("Enter the length for width: ");

        if (in.hasNextInt())
        {
            width = in.nextInt();
            in.nextLine(); // Clear the input buffer
        }
        else
        {
            trash = in.nextLine();
            System.out.println("\n You must enter a valid integer and not " + trash);
            System.out.println("Run the program again!");
            System.exit(0);
        }




        recArea = width * height;
        recPerim = (height + width) * 2;
        recDiagonal = Math.sqrt((height * height) + (width * width));

        System.out.println("\n The area of the rectangle is " + recArea + " and the perimeter is " + recPerim);
        System.out.println("\n The legnth of the diagonal is " + recDiagonal);
    }
}
