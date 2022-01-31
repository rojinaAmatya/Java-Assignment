package Assignment4;

import java.util.Scanner;

public class UserDaoImp {

    static User[] addRegister;

    Scanner sc = new Scanner(System.in);
    public void addRegister(){
        System.out.println("How many user would you like register? ");
        int size = sc.nextInt();
        addRegister = new User[size];
        for(int i =0; i < addRegister.length; ++i){
            System.out.println("Enter User ID number: ");
            int user_num = sc.nextInt();
            System.out.println("Enter User first name: ");
            String first_name = sc.next();
            System.out.println("Enter User last name: ");
            String last_name = sc.next();
            System.out.println("Enter User email: ");
            String email = sc.next();
            System.out.println("Enter User mobile number: ");
            long mobile_number = sc.nextLong();
            System.out.println("Enter User name: ");
            String username = sc.next();
            System.out.println("Enter the password: ");
            String password = sc.next();


            User register = new User(user_num,first_name, last_name,email,
                                    mobile_number,username,password);

            addRegister[i] = register;
            System.out.println("User registered successfully");
        }//end of loop

    }//end of addRegister

    public User[] viewAllUser(){
        return addRegister;

    }//end of view all user information

    public User viewUser(int user_num)
    {
        if(addRegister != null) {
            for(User user: addRegister ){
                if (user != null) {
                    if (user.getUser_num() == user_num) {
                        return user;
                    }
                }
            }
        }
        return null;
    } //end of viewUser

}
