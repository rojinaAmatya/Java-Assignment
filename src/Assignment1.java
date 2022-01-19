public class Assignment1 {

    //swap two number using temp variable
    public static void main(String[] args) {
        int temp = 0;
        int firstNum = 300;
        int secondNum = 100;

        System.out.println("firstNum:" + firstNum + " " +"SecondNum:" + secondNum);
        temp = firstNum;
        firstNum= secondNum;
        secondNum = temp;

        System.out.println("-----Output after Swapping-----");
        System.out.println("firstNum:" + firstNum + " " +"SecondNum:" + secondNum);
    }
}
