package Assignment1;

public class Assignment1 {

    //swap two number using temp variable
    public void problem1() {
        int temp =0;
        int firstNum = 100;
        int secondNum = 200;

        System.out.println("firstNum:" + firstNum + " " + "SecondNum:" + secondNum);
        temp = firstNum;
        firstNum = secondNum;
        secondNum = temp;

        System.out.println("------Output after Swapping------");
        System.out.println("firstNum:" + firstNum + " " + "SecondNum:" + secondNum);

    }

    public void problem2()
    {
        int firstNum = 100;
        int secondNum = 200;

        System.out.println("firstNum:"+ firstNum + " " + "secondNum:" + secondNum);
        firstNum += secondNum;
        secondNum =  firstNum - secondNum;
        firstNum = firstNum- secondNum;

        System.out.println("-----Output after Swapping-----");
        System.out.println("firstNum:"+ firstNum + " " + "secondNum:" + secondNum);
    }

    public void problem3()
    {
        int temp =0;
        int firstNum = 100;
        int secondNum = 200;
        int thirdNum = 300;

        System.out.println("firstNum:" + firstNum + " "+ "secondNum:" + secondNum + " "+ "thirdNum:" + thirdNum );
        temp = firstNum;
        firstNum = secondNum;
        secondNum = thirdNum;
        thirdNum = temp;
        System.out.println("------Output after Swapping------");
        System.out.println("firstNum:" + firstNum + " "+ "secondNum:" + secondNum + " "+ "thirdNum:" + thirdNum );
    }

    public void problem4()
    {
        int firstNum = 100;
        int secondNum = 200;
        int thirdNum = 300;

        System.out.println("firstNum:"+ firstNum + " " + "secondNum:" + secondNum + " "+ "thirdNum:"+ thirdNum);
        firstNum = secondNum;
        secondNum = thirdNum;
        thirdNum = secondNum- firstNum;
        System.out.println("-----Output after Swapping-----");
        System.out.println("firstNum:"+ firstNum + " " + "secondNum:" + secondNum + " "+ "thirdNum:"+ thirdNum);
    }


    public void problem5()
    {
        int temp = 0;
        int firstNum = 100;
        int secondNum = 200;
        int thirdNum = 300;
        int fourthNum = 400;

        System.out.println("firstNum:" + firstNum + " "+ "secondNum:" + secondNum + " "+ "thirdNum:" + thirdNum
                + " "+ "fourthNum:" + fourthNum);
        temp = firstNum;
        firstNum = secondNum;
        secondNum = thirdNum;
        thirdNum = fourthNum;
        fourthNum = temp;
        System.out.println("------Output after Swapping------");
        System.out.println("firstNum:" + firstNum + " "+ "secondNum:" + secondNum + " "+ "thirdNum:" + thirdNum
                + " "+ "fourthNum:" + fourthNum);

    }

    public void problem6()
    {
        int firstNum = 100;
        int secondNum = 200;
        int thirdNum = 300;
        int fourthNum = 400;

        System.out.println("firstNum:" + firstNum + " "+ "secondNum:" + secondNum + " "+ "thirdNum:" + thirdNum
                + " "+ "fourthNum:" + fourthNum);
        firstNum = secondNum;
        secondNum = thirdNum;
        thirdNum= fourthNum;
        fourthNum = thirdNum-secondNum;
        System.out.println("------Output after Swapping------");
        System.out.println("firstNum:" + firstNum + " "+ "secondNum:" + secondNum + " "+ "thirdNum:" + thirdNum
                + " "+ "fourthNum:" + fourthNum);
    }

    public void problem7()
    {
        int planCost = 699;
        double gst = 18;
        double finalCost = planCost + (gst/100 * planCost);
        String output = String.format("%,.2f", finalCost); //converted into two decimal format
        System.out.println("The final cost of JioFiver silver plan is" + " "+ "$"+ output);
        //output = $824.82
    }

    public void problem8()
    {
        int numOfPizza = 2;
        double priceOfPizza = 399.0;
        double discount = 20;
        double totalPriceOfPizza = (numOfPizza * priceOfPizza);
        double finalAmt = totalPriceOfPizza - ((discount/100) * totalPriceOfPizza);
        System.out.println("The final bill amount after 20% discount is: " + "$"+finalAmt);
        //output - $638.4
    }

    public void problem9()
    {
        int salary = 85000;
        double tax = 20;
        double taxAmt = (tax/100) * salary;
        System.out.println("The tax amount is: " + "$"+ taxAmt );
        //output --> 17000
    }

    public void problem10()
    {
        int principal = 500000;
        int time = 5;
        double rate = 6.8;
        double interestAmt = (principal * time * rate)/100;
        double finalAmt = principal + interestAmt;
        System.out.println("Interest Amount: " + "$"+interestAmt);
        System.out.println("The final amount: " + "$"+finalAmt);
        //output --> Interest amount : 170000 , final amount: 670000
    }

    public void problem11(){
        int salary = 85000;
        double ta =15, da = 20, hra = 18, pf=20, tax = 25;
        ta = (ta/100) * salary;
        da = (da/100) * salary;
        hra = (hra/100) * salary;
        double grossAmt = (salary + ta + da +hra);
        pf = (pf/100) * salary;
        tax = (tax/100) * salary;
        double netAmt = grossAmt - pf - tax;
        System.out.println("Gross Amount is: " + "$"+ grossAmt);
        System.out.println("Net income including pf and tax: "+ "$" + netAmt);

        //output --> Gross amt: $10837.5
        // net income including pf and tax : $91800.0
    }


}





