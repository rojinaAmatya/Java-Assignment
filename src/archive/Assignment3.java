package archive;

public class Assignment3 {

    public static void main(String[] args) {
        //swap three number using temp variable;



        int temp = 0,
                firstNum = 100, //200 -- output
                secondNum = 200, //300 -- output
                thirdNum = 300; //100 -- output

        System.out.println("firstNum:" + firstNum + " "+ "secondNum:" + secondNum + " "+ "thirdNum:" + thirdNum );

        temp = firstNum;
        firstNum = secondNum;
        secondNum = thirdNum;
        thirdNum = temp;

        System.out.println("------Output after Swapping------");
        System.out.println("firstNum:" + firstNum + " "+ "secondNum:" + secondNum + " "+ "thirdNum:" + thirdNum );

    }
}
