package Assignment6.Emp;

import java.util.Scanner;

class AccountDepartment extends Employee{

    public AccountDepartment(int empNum, String empName, String depName) {
        super(empNum, empName, depName);
    }


    @Override
    int CalculateSalary() {
        return super.CalculateSalary()*7;
    }
}
