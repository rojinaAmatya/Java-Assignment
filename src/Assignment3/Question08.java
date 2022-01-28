package Assignment3;

public class Question08 {
    // Write a Java program to find the duplicate values of an array of string values
    static void duplicateValue(String arr[]){
        System.out.println("Duplicate String Value are: ");
        for (int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++){
                if(arr[i]== arr[j]){
                    System.out.print(arr[j]+ " ");
                }
            }
        }

    }

    public static void main(String[] args) {
        String arr[] = {"abc", "bdc","xyz","abd","cbc","bdc","oiu","aei","uio","xyx","xyz"};
        duplicateValue(arr);
    }
}
