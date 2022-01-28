package Assignment3;

public class Question11 {
    //Write a Java program to find the second largest element in an array
    static int secondLargest(int arr[]){
        int temp = 0;
        for(int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++){
                if(arr[i]> arr[j]){
                    temp = arr[i];
                    arr[i]= arr[j];
                    arr[j]= temp;
                }
            }
        }
        return arr[arr.length -1];
    }

    public static void main(String[] args) {
        int arr[] = {20,54,67,99,20,145,3,45,65,29,17,245,56};
        System.out.println("The second largest number is: " + secondLargest(arr));

    }
}
