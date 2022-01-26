package Assignement2;

import java.util.Scanner;

public class CalculateApp {

    static Scanner sc = new Scanner(System.in);
    int firstNum,secondNum, result;

    public void add()
    {
        System.out.println("Enter the first number: ");
        firstNum = sc.nextInt();
        System.out.println("Enter the second number: ");
        secondNum = sc.nextInt();
        result = firstNum + secondNum;
        System.out.println("The addition of two number is: " + result);
    }

    public void sub()
    {
        System.out.println("Enter the first number: ");
        firstNum = sc.nextInt();
        System.out.println("Enter the second number: ");
        secondNum = sc.nextInt();
        result = firstNum - secondNum;
        System.out.println("The subtraction of two number is: " + result);
    }

    public void mul()
    {
        System.out.println("Enter the first number: ");
        firstNum = sc.nextInt();
        System.out.println("Enter the second number: ");
        secondNum = sc.nextInt();
        result = firstNum * secondNum;
        System.out.println("The multiplication of two number is: " + result);
    }

    public void div()
    {
        System.out.println("Enter the first number: ");
        firstNum = sc.nextInt();
        System.out.println("Enter the second number: ");
        secondNum = sc.nextInt();

        try {
            result = firstNum / secondNum;
            System.out.println("The division of two number is: " + result);
        }
        catch(ArithmeticException e){
            System.out.println("Divided by zero operation cannot be possible.");
        }
    }


    public static void main(String[] args) {
        CalculateApp demo = new CalculateApp();

        while(true) {
            System.out.println(" ");
            System.out.println("********** MENU **********");
            System.out.println("   1. ADDITION  ");
            System.out.println("   2. SUBTRACTION  ");
            System.out.println("   3. MULTIPLICATION ");
            System.out.println("   4. DIVISON  ");
            System.out.println("   5. EXIT ");
            System.out.println("***************************");
            System.out.println(" ");

            System.out.println("Please enter the choice from the menu: ");
            int choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    demo.add();
                    break;

                case 2:
                    demo.sub();
                    break;

                case 3:
                    demo.mul();
                    break;

                case 4:
                    demo.div();
                    break;

                case 5:
                    System.out.println("Thank you for using the application");
                    System.exit(0);

                default:
                    System.out.println("Please enter number between 1 to 5");

            }
        }
    }

}
