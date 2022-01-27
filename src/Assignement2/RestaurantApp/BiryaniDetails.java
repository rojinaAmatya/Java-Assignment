package Assignement2.RestaurantApp;

import java.util.Scanner;

public class BiryaniDetails {
    Scanner sc = new Scanner(System.in);
    int chk_biryani_price = 120;
    int veg_biryani_price = 100;
    static int biryani_total = 0;
    int chk_biryani_bill = 0;
    int veg_biryani_bill = 0;

    void chickenBiryani(){
        System.out.println("How many plates of Chicken Biryani would you like? ");
        int chk_biryani_plates = sc.nextInt();
        chk_biryani_bill = chk_biryani_plates * chk_biryani_price;
        biryani_total += chk_biryani_bill;
        System.out.println(chk_biryani_plates + " plate of chicken Biryani: $" + chk_biryani_bill);
    }

    void vegBiryani(){
        System.out.println("How many plates of Vegetable Biryani would you like? ");
        int veg_biryani_plates = sc.nextInt();
        veg_biryani_bill = veg_biryani_plates * veg_biryani_price;
        biryani_total += veg_biryani_bill;
        System.out.println(veg_biryani_plates + " plate of chicken Biryani: $" + veg_biryani_bill);
    }

    public void biryaniMenu() {
        while (true) {
            System.out.println("*********************************");
            System.out.println("    1. Chicken Biryani           ");
            System.out.println("    2. Vegetable Biryani         ");
            System.out.println("    3. Go back to Main Menu      ");
            System.out.println("*********************************");
            System.out.println(" ");

            System.out.println("Please enter the choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    chickenBiryani();
                    biryaniMenu();
                    break;

                case 2:
                    vegBiryani();
                    biryaniMenu();
                    break;

                case 3:
                    RestaurantMenuApp.main(null);

                default:
                    System.out.println("Please choose between 1 to 3");

            }


        }
    }
}
