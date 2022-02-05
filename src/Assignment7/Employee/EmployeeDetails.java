package Assignment7.Employee;

public class EmployeeDetails {
    int emp_Id;
    String emp_name;
    String emp_address;
    String position;

    public EmployeeDetails(int emp_Id, String emp_name, String emp_address, String position) {
        this.emp_Id = emp_Id;
        this.emp_name = emp_name;
        this.emp_address = emp_address;
        this.position = position;
    }

    public int getEmp_Id() {
        return emp_Id;
    }

    public void setEmp_Id(int emp_Id) {
        this.emp_Id = emp_Id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getEmp_address() {
        return emp_address;
    }

    public void setEmp_address(String emp_address) {
        this.emp_address = emp_address;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
