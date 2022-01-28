package Assignment3;

public class Question01 {

    //Write a Java program to calculate the average value of array
    static void calcAverage(int arr[]){
        int sum = 0;
        for(int i: arr){
            sum += i;}
        int average = sum/arr.length;
        System.out.println("The average of given array is: " + average);
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60};
        calcAverage(arr);
    }
}
