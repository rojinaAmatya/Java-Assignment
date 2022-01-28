package Assignment3;

public class Question06 {
    //Write a Java program to reverse an array of integer values
    static void reverseArray(int arr[]){
        System.out.println("Original Array: ");
        for(int i=0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");}
        System.out.println(" ");
        System.out.println("Reverse Array: ");
        for (int i= arr.length-1; i >=0; i--){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {

        int arr[] ={10,20,30,40,50,60};
        reverseArray(arr);

    }
}
