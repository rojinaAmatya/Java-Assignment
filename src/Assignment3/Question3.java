package Assignment3;

import java.util.Scanner;

public class Question3 {
    //Write a Java program to find the index of an array element
    static int findIndex(int arr[], int el)
    {
        if(arr== null){
            return -1;
        }
        for(int i = 0; i < arr.length; i++){
            if (arr[i] == el){
                return i;
            }
            else{
                i+=1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] ={10,24,32,45,65,87,98,13,94};
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the element value to find index: ");
        int el = sc.nextInt();
        System.out.println("Index of the " + el+ " value is :"+ findIndex(arr,el));

    }
}
