package Assignment4;

import java.util.Scanner;

public class UserDetails {

    public void userDetails(){

        Scanner sc = new Scanner(System.in);
        UserDaoImp daoImpl = new UserDaoImp();

        while(true) {
            System.out.println("*******************************************");
            System.out.println("            1) Register new user        ");
            System.out.println("            2) View All User           ");
            System.out.println("            3) View user               ");
            System.out.println("            4) Back                    ");
            System.out.println("*******************************************");

            System.out.println(" ");
            System.out.println("Enter the choice: ");
            int choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                    daoImpl.addRegister();
                    userDetails();
                    break;

                case 2:
                    UserClient[] viewAllUser = daoImpl.viewAllUser();

                    System.out.println("******************************************************************************************");
                    System.out.println("UserNum\t FName\t LName\t Email\t Mobile Number\t Username\t Password");
                    System.out.println("******************************************************************************************");

                    if(viewAllUser != null) {
                        for (UserClient user : viewAllUser) {
                            System.out.println(user.getUser_num() + "\t" + user.getFirst_name() + "\t" + user.getLast_name()
                                    + "\t" + user.getEmail() + "\t" + user.getMobile_number() + "\t" + user.getUsername());
                        }
                    }
                    else{
                        System.out.println("User information are not available");
                    }
                    userDetails();
                    break;


                case 3:
                    System.out.println("Enter the user id:");
                    UserClient user = daoImpl.viewUser(sc.nextInt());
                    if(user!= null){
                        System.out.println(user.getUser_num()+ "\t" + user.getFirst_name() + "\t" + user.getLast_name()
                                + "\t" + user.getEmail() + "\t" + user.getMobile_number() + "\t"+ user.getUsername());
                    }
                    else{
                        System.out.println("User record Not found");
                    }
                    userDetails();
                    break;

                case 4:
                default:
                    System.out.println("Please choose between 1 to 4:" );

            }
        }




    }
}
