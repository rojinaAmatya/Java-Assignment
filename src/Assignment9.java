public class Assignment9 {

    //Salary is $85000, pay tax = 20% of salary, calculate tax amt, display tax amt
    public static void main(String[] args) {
        int salary = 85000;
        double tax = 20;

        double taxAmt = (tax/100) * salary;
        System.out.println("The tax amount is: " + "$"+ taxAmt );

        //output --> 17000

    }
}
