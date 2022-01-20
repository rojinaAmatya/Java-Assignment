package archive;

public class Assignment10 {

    //Deposit 500000 for 5 yrs with rate of interest 6.8%. calculate interest amt and final amt
    public static void main(String[] args) {
        int principal = 500000;
        int time = 5;
        double rate = 6.8;

        double interestAmt = (principal * time * rate)/100;
        double finalAmt = principal + interestAmt;
        System.out.println("Interest Amount: " + "$"+interestAmt);
        System.out.println("The final amount: " + "$"+finalAmt);

        //output --> Interest amount : 170000 , final amount: 670000

    }
}
