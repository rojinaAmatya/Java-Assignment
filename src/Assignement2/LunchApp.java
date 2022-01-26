package Assignement2;

import java.util.Scanner;

public class LunchApp {

    static Scanner sc = new Scanner(System.in);
    int total_bill = 0;
    int bonda_bill = 0;
    int bonda_price = 50;
    int dosa_bill = 0;
    int dosa_price = 100;
    int idly_bill=0;
    int idly_price = 35;

    public void bonda(){
        System.out.println("How many plates of Bonda would you like? :");
        int bonda_plates = sc.nextInt();
        bonda_bill = bonda_plates * bonda_price;
        System.out.println(bonda_plates + " Plates bonda: " + bonda_bill);
    }

    public void dosa(){
        System.out.println("How many plates of Dosa would you like?: ");
        int dosa_plates = sc.nextInt();
        dosa_bill = dosa_plates * dosa_price;
        System.out.println(dosa_plates + " Plates Dosa: " + dosa_bill );
    }
    public void idly(){
        System.out.println("How many plates of Idly would you like?: ");
        int idly_plates = sc.nextInt();
        idly_bill = idly_plates * idly_price;
        System.out.println(idly_plates + " Plates Dosa: " + idly_bill );
    }

    public void bill(){
        total_bill = bonda_bill+ dosa_bill+ idly_bill;
        System.out.println("Total bill amount is: " + total_bill );
    }


    public static void main(String[] args) {
        LunchApp demo = new LunchApp();
        while(true) {
            System.out.println(" ");
            System.out.println("********** FOOD MENU **********");
            System.out.println("   1. Bonda");
            System.out.println("   2. Dosa");
            System.out.println("   3. Idly");
            System.out.println("   4. Bill");
            System.out.println("   5. Exit");
            System.out.println("********************************");
            System.out.println(" ");

            System.out.println("Please enter the choice from the menu: ");
            int choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    demo.bonda();
                    break;

                case 2:
                    demo.dosa();
                    break;

                case 3:
                    demo.idly();
                    break;

                case 4:
                    demo.bill();
                    break;

                case 5:
                    System.out.println("Thank you for using the application");
                    System.exit(0);

                default:
                    System.out.println("Please enter the number between 1 to 5: ");


            }

        }



    }

}
