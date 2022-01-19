public class Assignment5 {

    public static void main(String[] args) {
        //swap four number using temp variable;

        int temp = 0,
                firstNum = 100, //200 -- output
                secondNum = 200, //300 -- output
                thirdNum = 300, //400 -- output
                fourthNum = 400; //100 -- output

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
}
