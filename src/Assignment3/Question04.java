package Assignment3;

import java.util.Scanner;

public class Question04 {
    //Write a Java program to remove a specific element from an array
    static void removeElement(int arr[], int n){

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == n ){
                for(int j =i; j < arr.length-1; j++){
                    arr[j]= arr[j+1];
                }
                break;
            }
        }
        System.out.println("All the elements after deletion: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(" " + arr[i]);
        }

    }

    public static void main(String[] args) {
        int arr[] = {10,24,32,45,65,87,98,25,13,94};
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the index you want to remove: ");
        int index = sc.nextInt();
        removeElement(arr, index);

    }
}
