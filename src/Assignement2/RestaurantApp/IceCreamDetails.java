package Assignement2.RestaurantApp;

import java.util.Scanner;

public class IceCreamDetails {

    Scanner sc = new Scanner(System.in);
    int choc_icecream_price = 20;
    int van_icecream_price = 25;
    int straw_icecream_price = 30;
    static int ice_cream_total = 0;
    int choc_icecream_bill = 0;
    int van_icecream_bill = 0;
    int straw_icecream_bill = 0;

    void chocolateIcecream() {
        System.out.println("How many chocolate ice-cream would you like? ");
        int choc_cones = sc.nextInt();
        choc_icecream_bill = choc_cones * choc_icecream_price;
        ice_cream_total += choc_icecream_bill;
        System.out.println(choc_cones + " cone of chocolate ice-cream: " + choc_icecream_bill);
    }

    void vanillaIcecream() {
        System.out.println("How many vanilla ice-cream would you like? ");
        int van_cones = sc.nextInt();
        van_icecream_bill = van_cones * van_icecream_price;
        ice_cream_total += van_icecream_bill;
        System.out.println(van_cones + " cone of vanilla ice-cream: " + van_icecream_bill);
    }

    void strawberryIcecream() {
        System.out.println("How many strawberry ice-cream would you like? ");
        int straw_cones = sc.nextInt();
        straw_icecream_bill = straw_cones * straw_icecream_price;
        ice_cream_total += straw_icecream_bill;
        System.out.println(straw_cones + " cone of strawberry ice-cream: " + straw_icecream_bill);
    }


    public void iceCreamMenu() {
        while(true) {
            System.out.println("*********************************");
            System.out.println("    1. Chocolate Flavour           ");
            System.out.println("    2. Vanilla Flavour         ");
            System.out.println("    3. Strawberry Flavour         ");
            System.out.println("    4. Go back to Main Menu      ");
            System.out.println("*********************************");
            System.out.println(" ");

            System.out.println("Please enter the choice from Ice cream menu: ");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    chocolateIcecream();
                    iceCreamMenu();
                    break;

                case 2:
                    vanillaIcecream();
                    iceCreamMenu();
                    break;

                case 3:
                    strawberryIcecream();
                    iceCreamMenu();
                    break;

                case 4:
                    RestaurantMenuApp.main(null);

                default:
                    System.out.println("Please choose between 1 to 4:");

            }
        }

    }
}

