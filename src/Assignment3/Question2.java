package Assignment3;

import java.util.Scanner;

public class Question2 {
    //Write a Java program to test if an array contains a specific value
    static boolean valueContains(int arr[], int val){
        for(int i= 0; i < arr.length; i++){
            if (arr[i] == val)
            {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] ={10,24,32,45,65,87,98,32,65,13,94,87};
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the value to check: ");
        int val = sc.nextInt();
        System.out.println(valueContains(arr, val));

    }
}
