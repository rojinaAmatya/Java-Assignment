public class Assignment11 {

    //Salary is 85000, company provides ta,da,hra. Calculate gross amt and
    // new amt include pf, tax
    //ta = 15%, da = 20%, hra = 18% of basic salary
    //pf is 20%, tax = 25% of basic salary
    public static void main(String[] args) {

        int salary = 85000;
        double ta =15, da = 20, hra = 18, pf=20, tax = 25;

        ta = (ta/100) * salary;
        da = (da/100) * salary;
        hra = (hra/100) * salary;

        double grossAmt = (salary + ta + da +hra)/12;
        double netIncome =  salary-grossAmt;

        pf = (pf/100) * salary;
        tax = (tax/100) * salary;

        double finalAmt = netIncome + pf + tax;

        System.out.println("Gross Amount is: " + "$"+ grossAmt);
        System.out.println("Net Amount is: " + "$" + netIncome );
        System.out.println("Net income including pf and tax: "+ "$" + finalAmt);

        //output --> Gross amt: $10837.5, net amt: $74162.5,
        // net income including pf and tax : $112412.5

    }
}
