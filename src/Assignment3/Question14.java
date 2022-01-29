package Assignment3;

import groovy.json.JsonOutput;

import java.util.Scanner;

public class Question14 {
    //Write a Java program to find the kth largest elements in a given
    //array. Elements in the array can be in any order

    static void kLargest(int arr[], int k){
        for(int i =0; i < arr.length; i++){
            for(int j =i +1; j < arr.length; j++){
                int tmp =0;
                if(arr[i] < arr[j]){
                    tmp = arr[i];
                    arr[i]=arr[j];
                    arr[j]= tmp;
                }
            }
        }
        System.out.println("Largest numbers are: ");
        for(int m =0; m < k; m++) {
            System.out.print(arr[m] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the kth largest number:");
        int k = sc.nextInt();
        int arr[]= {12,3,5,7,8,19};
        kLargest(arr,k);
    }
}


