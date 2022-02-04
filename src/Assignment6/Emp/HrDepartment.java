package Assignment6.Emp;

public class HrDepartment extends Employee{

    public HrDepartment(int empNum, String empName, String depName) {
        super(empNum, empName, depName);
    }

    @Override
    int CalculateSalary() {
        return super.CalculateSalary()*3;
    }
}
