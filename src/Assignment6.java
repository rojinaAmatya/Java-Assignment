public class Assignment6 {

    public static void main(String[] args) {
        //swap four number without using temp variable;

        int firstNum = 100, //200 -- output
                secondNum = 200, //300 -- output
                thirdNum = 300, //400 -- output
                fourthNum = 400; //100 -- output

        System.out.println("firstNum:" + firstNum + " "+ "secondNum:" + secondNum + " "+ "thirdNum:" + thirdNum
                + " "+ "fourthNum:" + fourthNum);

        firstNum +=100;
        secondNum +=100;
        thirdNum += 100;
        fourthNum -= 300;

        System.out.println("------Output after Swapping------");
        System.out.println("firstNum:" + firstNum + " "+ "secondNum:" + secondNum + " "+ "thirdNum:" + thirdNum
                + " "+ "fourthNum:" + fourthNum);

    }
}
