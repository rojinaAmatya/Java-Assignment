package Assignment6.Emp;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Employee demo = new Employee();


        AccountDepartment e1 = new AccountDepartment(1,"John Doe","Account department");
        Employee e2 = new ItDepartment(2,"Jane Marry","IT department");
        Employee e3 = new HrDepartment(3,"Megan Fox","HR department");



        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println(" ");
            System.out.println("******************************************");
            System.out.println(" 1. Account Department");
            System.out.println(" 2. IT Department");
            System.out.println(" 3. HR Department");
            System.out.println(" 4. Exit");
            System.out.println("****************** ************************");
            System.out.println(" ");

            System.out.println("Please enter the choice from the menu: ");
            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("ID number: " + e1.getEmpNum());
                    System.out.println("Employee name: " + e1.getEmpName());
                    System.out.println("Department: " + e1.getDepName());
                    System.out.println("salary: " +e1.CalculateSalary());
                    break;

                case 2:
                    System.out.println("ID number: " + e2.getEmpNum());
                    System.out.println("Employee name: " + e2.getEmpName());
                    System.out.println("Department: " + e2.getDepName());
                    System.out.println("salary: " +e2.CalculateSalary());
                    break;

                case 3:
                    System.out.println("ID number: " + e3.getEmpNum());
                    System.out.println("Employee name: " + e3.getEmpName());
                    System.out.println("Department: " + e3.getDepName());
                    System.out.println("salary: " +e3.CalculateSalary());
                    break;

                case 4:
                    System.out.println("Thank you for using the application");
                    System.exit(0);

                default:
                    System.out.println("Please choose between 1 to 4") ;


            }



        }

    }
}
