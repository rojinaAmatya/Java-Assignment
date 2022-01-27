package Assignement2.RestaurantApp;

import java.util.Scanner;

public class HotDrinksDetails {
    Scanner sc = new Scanner(System.in);

    int tea_price = 10;
    int coff_price = 15;
    int hot_choc_price = 12;
    static int hot_drink_total = 0;
    int tea_bill = 0;
    int coff_bill = 0;
    int hot_choc_bill = 0;

    void tea(){
        System.out.println("How many cup of tea would you like? :");
        int tea_ct = sc.nextInt();
        tea_bill = tea_ct * tea_price;
        hot_drink_total += tea_bill;
        System.out.println(tea_ct + " cup of tea: $"+ tea_bill);
    }

    void coffee(){
        System.out.println("How many cup of coffee would you like? :");
        int coff_ct = sc.nextInt();
        coff_bill = coff_ct * coff_price;
        hot_drink_total += coff_bill;
        System.out.println(coff_ct + " cup of coffee: $"+ coff_bill);
    }

    void hotChocolate(){
        System.out.println("How many cup of hot chocolate would you like? :");
        int hot_choc_ct = sc.nextInt();
        hot_choc_bill = hot_choc_ct * hot_choc_price;
        hot_drink_total += hot_choc_bill;
        System.out.println(hot_choc_ct + " cup of coffee: $"+ hot_choc_bill);
    }

    void hotDrinks(){
        while(true){
            System.out.println("*********************************");
            System.out.println("    1. Tea         ");
            System.out.println("    2. Coffee        ");
            System.out.println("    3. Hot Chocolate        ");
            System.out.println("    4. Go back to Main Menu      ");
            System.out.println("*********************************");
            System.out.println(" ");

            System.out.println("Please enter the hot drinks choices: ");
            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    tea();
                    hotDrinks();
                    break;

                case 2:
                    coffee();
                    hotDrinks();
                    break;

                case 3:
                    hotChocolate();
                    hotDrinks();
                    break;

                case 4:
                    DrinksDetails.main(null);

                default:
                    System.out.println("Please choose between 1 to 4");
            }

        }
    }
}
