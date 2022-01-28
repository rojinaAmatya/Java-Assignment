package Assignment3;

public class Question7 {
    //Write a Java program to find the duplicate values of an array of an integer values
    static void duplicateValue(int arr[]){
        int temp= 0;
        System.out.print("Duplicate items are: ");
        for (int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++ ){
                if (arr[i] == arr[j] && i != j) {
                    temp = arr[j];
                    System.out.print(temp + " ");
                }
            }
        }


    }
    public static void main(String[] args) {
        int arr[] ={10,24,32,45,65,87,98,32,65,13,94,87};
        duplicateValue(arr);
    }
}
