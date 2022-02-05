package Assignment7.Customer;

public class CustomerDetails {
    int customer_number;
    String customer_name;
    String customer_address;
    String customer_email;

    public CustomerDetails(int customer_number, String customer_name, String customer_address, String customer_email) {
        this.customer_number = customer_number;
        this.customer_name = customer_name;
        this.customer_address = customer_address;
        this.customer_email = customer_email;
    }

    public int getCustomer_number() {
        return customer_number;
    }

    public void setCustomer_number(int customer_number) {
        this.customer_number = customer_number;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_address() {
        return customer_address;
    }

    public void setCustomer_address(String customer_address) {
        this.customer_address = customer_address;
    }

    public String getCustomer_email() {
        return customer_email;
    }

    public void setCustomer_email(String customer_email) {
        this.customer_email = customer_email;
    }
}
