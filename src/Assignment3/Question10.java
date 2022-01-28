package Assignment3;

public class Question10 {
    //Write a Java program to remove duplicate elements from an array
    static void duplicateElement(int arr[]){
        System.out.println("Duplicate Value are: ");
        for(int i =0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.println(arr[j] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {20,54,67,99,20,145,3,45,65,29,17,245,56};
        duplicateElement(arr);
    }
}
