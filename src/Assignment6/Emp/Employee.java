package Assignment6.Emp;

public class Employee {
    private int empNum;
    private String empName;
    private String depName;
    private int salary = 1000;

    public Employee(int empNum, String empName, String depName) {
        this.empNum = empNum;
        this.empName = empName;
        this.depName = depName;
    }

    public Employee() {

    }

    public int getEmpNum()
    {
        return empNum;
    }

    public void setEmpNum(int empNum) {
        this.empNum = empNum;
    }

    public String getEmpName() {
        return empName;
    }


    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    int CalculateSalary(){
        return salary;
    }
}




