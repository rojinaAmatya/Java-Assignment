package Assignment3;

public class Question12 {
    //Write a Java program to find the second smallest element in an array.
    static int secondSmallest(int arr[]){
        int temp =0;
        for(int i =0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i]= arr[j];
                    arr[j]= temp;
                }
            }
        }
        return arr[1];
    }

    public static void main(String[] args) {
        int arr[] ={20,54,67,99,20,145,3,4,45,65,29,17,245,56};
        System.out.println("The second smallest number is: " + secondSmallest(arr));
    }
}
