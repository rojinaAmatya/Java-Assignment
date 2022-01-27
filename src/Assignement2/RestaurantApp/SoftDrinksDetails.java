package Assignement2.RestaurantApp;

import java.util.Scanner;

public class SoftDrinksDetails {
    Scanner sc = new Scanner(System.in);

    int sprite_price=5;
    int coke_price=2;
    int fanta_price= 5;
    int dew_price =3;
    static int soft_drink_total = 0;
    int sprite_bill= 0;
    int coke_bill= 0;
    int fanta_bill=0;
    int dew_bill = 0;

    void sprite(){
        System.out.println("How many sprite would you like? :");
        int sprite_ct = sc.nextInt();
        sprite_bill = sprite_ct * sprite_price;
        soft_drink_total += sprite_bill;
        System.out.println(sprite_ct+ " bottles of sprite: $" + sprite_bill);
    }
    void coke(){
        System.out.println("How many coke would you like? :");
        int coke_ct = sc.nextInt();
        coke_bill = coke_ct * coke_price;
        soft_drink_total += coke_bill;
        System.out.println(coke_ct+ " bottles of coke: $" + coke_bill);
    }

    void fanta(){
        System.out.println("How many fanta would you like? :");
        int fanta_ct = sc.nextInt();
        fanta_bill = fanta_ct * fanta_price;
        soft_drink_total += fanta_bill;
        System.out.println(fanta_ct+ " bottles of fanta: $" + fanta_bill);
    }

    void dew(){
        System.out.println("How many Mt.Dew would you like? :");
        int dew_ct = sc.nextInt();
        dew_bill = dew_ct * dew_price;
        soft_drink_total += dew_bill;
        System.out.println(dew_ct+ " bottles of dew: $" + dew_bill);
    }


    void softDrinks(){
        while (true) {
            System.out.println("*********************************");
            System.out.println("    1. Sprite         ");
            System.out.println("    2. Coke        ");
            System.out.println("    3. Fanta        ");
            System.out.println("    4. Mt.Dew        ");
            System.out.println("    5. Go back to Main Menu      ");
            System.out.println("*********************************");
            System.out.println(" ");

            System.out.println("Please enter the soft drink choices: ");
            int choice = sc.nextInt();
            switch (choice){
                 case 1:
                     sprite();
                     softDrinks();
                     break;

                case 2:
                    coke();
                    softDrinks();
                    break;

                case 3:
                    fanta();
                    softDrinks();
                    break;

                case 4:
                    dew();
                    softDrinks();
                    break;

                case 5:
                    DrinksDetails.main(null);

            }
        }
    }


}
