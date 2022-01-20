package archive;

public class Assignment2 {

    public static void main(String[] args) {
        //swap two number without temp

        int firstNum = 200;
        int secondNum = 100;

        System.out.println("firstNum:"+ firstNum + " " + "secondNum:" + secondNum);

        firstNum = firstNum-secondNum;
        secondNum = secondNum + firstNum;

        System.out.println("-----Output after Swapping-----");
        System.out.println("firstNum:"+ firstNum + " " + "secondNum:" + secondNum);
    }
}
