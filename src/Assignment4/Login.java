package Assignment4;

import java.util.Scanner;

import static Assignment4.UserDaoImp.addRegister;

public class Login {
    Scanner sc = new Scanner(System.in);

    public void login() {
        System.out.println("************ LOGIN ***************");
        System.out.println("Please enter username: ");
        String uname = sc.next();
        System.out.println("Please enter password");
        String pass = sc.next();

        boolean temp = verifyUser(uname, pass);
        if (temp == true) {
            System.out.println("Login successful");
        } else {
            System.out.println("Invalid username and password");
        }
    }

    public boolean verifyUser(String uname, String pass) {
        boolean condition = true;
        for (User user : addRegister) {
            if (uname.matches(user.getUsername()) && pass.matches(user.getPassword())) {
                condition = true;
            } else {
                condition = false;
            }

        }
        return condition;

    }
}



