// Project #1 Food Program Sydney Steinbauer \\
import java.util.Scanner;
public class Order 
{
    double tot = 0;
    double total = 0;

        public void order(){
            // prices
            double hotdog = 2.50;
            double brat = 3.50;
            double hamburger = 5.00;
            double fries = 2.00;
            double soda = 2.00;
            double water = 0.00;
            boolean ordering = true;
            total = 0;
            
            Scanner sc = new Scanner(System.in);
            while (ordering == true){
            
            System.out.println("Please enter an item or 'c' to calculate the total of your order: ");
            String input = sc.nextLine();

            if (input.equals("d")){
                total += hotdog;
                tot += hotdog;}
            if (input.equals("b")){
                total += brat;
                tot += brat;}
            else if (input.equals("h")){
                total += hamburger;
                tot += hamburger;}
            else if (input.equals("f")){
                total += fries;
                tot += fries;}
            else if (input.equals("s")){
                total += soda;
                tot += soda;}
            else if (input.equals("w")){
                total += water;
                tot += water;}
            // selecting c will end the order, but the user will be given the option to make another
                else if (input.equals("c"))
                ordering = false;
                System.out.println("Your total is $" + total + "0");
                System.out.println("Today's total is: $" + tot + "0");
            }
        }
    }
