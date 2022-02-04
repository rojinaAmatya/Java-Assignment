package Assignment6.Emp;

public class ItDepartment extends Employee{

    public ItDepartment(int empNum, String empName, String depName) {
        super(empNum, empName, depName);
    }

    @Override
    int CalculateSalary() {
        return super.CalculateSalary()*5;
    }
}
