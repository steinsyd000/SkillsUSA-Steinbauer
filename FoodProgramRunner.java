// Project #1 Food Program Sydney Steinbauer \\
import java.util.Scanner;
public class FoodProgramRunner
{
    public static void main(String[]args)
    {
        System.out.println("Welcome to the food truck!");
        System.out.println("Menu: hotdog $2.50 (d) \nbrat $3.50 (b) \nhamburger $5.00 (h) \nfries $2.00 (f) \nsoda $2.00 (s) \nwater free (w)");

        boolean run = true;
        Order the = new Order();

        Scanner sc = new Scanner(System.in);
        while (run == true){
            System.out.println("Would you like to enter an order? (y/n)");
            String choice = sc.nextLine();
            // selecting n will end the program
            if (choice.equals("n"))
                run = false;
            else if (choice.equals("y"))
                the.order();
            }

        System.out.println("Thanks for stopping by!");
    }
}