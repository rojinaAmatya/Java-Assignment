public class Assignment8 {

    //Mr.Sampath went to Dominos and ordered 2 pizzas, each pizza cost 399.0
    //Dominos provide 20% discount on bill amt , calculate final amt

    public static void main(String[] args) {
        int numOfPizza = 2;
        double priceOfPizza = 399.0;
        double discount = 20;

        double totalPriceOfPizza = (numOfPizza * priceOfPizza);
        double finalAmt = totalPriceOfPizza - ((discount/100) * totalPriceOfPizza);

        System.out.println("The final bill amount after 20% discount is: " + "$"+finalAmt);

        //output - $638.4
    }
}
