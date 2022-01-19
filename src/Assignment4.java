public class Assignment4 {

    public static void main(String[] args) {
        //swap three number without temp

        int firstNum = 100, // 200 -- output
                secondNum = 200, //300 -- output
                thirdNum = 300; //100 -- output

        System.out.println("firstNum:"+ firstNum + " " + "secondNum:" + secondNum + " "+ "thirdNum:"+ thirdNum);

        firstNum = firstNum +secondNum+thirdNum;
        secondNum = firstNum-secondNum;
        thirdNum = secondNum-thirdNum;
        secondNum= secondNum-thirdNum;
        firstNum= firstNum-secondNum-thirdNum;

        System.out.println("-----Output after Swapping-----");
        System.out.println("firstNum:"+ firstNum + " " + "secondNum:" + secondNum + " "+ "thirdNum:"+ thirdNum);
    }
}
