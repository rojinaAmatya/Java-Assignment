package Assignment4;

import java.util.Scanner;

public class UserMenu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("*******************************************");
            System.out.println("            1) Register         ");
            System.out.println("            2) Login           ");
            System.out.println("            3) Exit                    ");
            System.out.println("*******************************************");
            System.out.println(" ");
            System.out.println("Enter the choice from the menu: ");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    UserDetails details = new UserDetails();
                    details.userDetails();
                    break;

                case 3:
                    System.out.println("Thank you for using this application");
                    System.exit(0);
                default:
                    System.out.println("Please choose between 1 to 3: ");

            }


        }
    }
}
