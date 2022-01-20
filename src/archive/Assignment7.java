package archive;

public class Assignment7 {

    //JioFiber silver plan cost is $699 + gst 18%, calculate final cost
    public static void main(String[] args) {
        int planCost = 699;
        double gst = 18;

        double finalCost = planCost + (gst/100 * planCost);
        String output = String.format("%,.2f", finalCost); //converted into two decimal format
        System.out.println("The final cost of JioFiver silver plan is" + " "+ "$"+ output);

        //output = $824.82
    }
}
