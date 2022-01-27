package Assignement2.RestaurantApp;

import java.util.Scanner;

public class DrinksDetails {


    public static void main(String[] args)
     {
         Scanner scan = new Scanner(System.in);
         while(true){
             System.out.println("*********************************");
             System.out.println("    1. Soft Drinks           ");
             System.out.println("    2. Hot Drinks         ");
            System.out.println("    3. Go back to Main Menu      ");
            System.out.println("*********************************");
            System.out.println(" ");

            System.out.println("Enter the choice from the Menu: ");
            int choice = scan.nextInt();
            SoftDrinksDetails soft = new SoftDrinksDetails();

            switch (choice) {
                case 1:
                    soft.softDrinks();
                    break;

                case 3:
                    RestaurantMenuApp.main(null);

                default:
                    System.out.println("Please choose between 1 to 3");
            }


        }
    }
}
