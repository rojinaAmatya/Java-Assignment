package Assignement2.RestaurantApp;

import java.util.Scanner;

public class RestaurantMenuApp {

    static void bill(){
        System.out.println("*--------------------------------------------*");
        System.out.println("Biryani Bill : " + BiryaniDetails.biryani_total);
        System.out.println("Ice-cream Bill : " + IceCreamDetails.ice_cream_total);

        int total = BiryaniDetails.biryani_total + IceCreamDetails.ice_cream_total;
        System.out.println("Total Bill: " + total);
        System.out.println("*--------------------------------------------*");

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println(" ");
            System.out.println("********** RESTAURANT MENU **********");
            System.out.println("   1. Biryani");
            System.out.println("   2. Drinks");
            System.out.println("   3. Ice Cream");
            System.out.println("   4. Bill");
            System.out.println("   5. Exit");
            System.out.println("**************************************");
            System.out.println(" ");

            System.out.println("Enter the choice from the Menu: ");
            int choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    BiryaniDetails details = new BiryaniDetails();
                    details.biryaniMenu();
                    break;

                case 3:
                    IceCreamDetails iceDetails = new IceCreamDetails();
                    iceDetails.iceCreamMenu();
                    break;

                case 4:
                    bill();

                default:
                    System.out.println("Please choose between 1 to 5");
            }
        }


    }
}
