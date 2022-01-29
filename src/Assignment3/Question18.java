package Assignment3;

public class Question18 {
    //Program to copy all the elements of one array into another array
    static void copyArray(int arr1[]){
        int arr2[] = new int[arr1.length];
        for(int i =0; i < arr1.length; i++){
            arr2[i]= arr1[i];
        }

        System.out.println("Array 1: ");
        for(int i =0; i < arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }

        System.out.println("");
        System.out.println("Array 2: ");
        for(int i =0; i < arr2.length; i++){
            System.out.print(arr2[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr1[] ={1,2,3};
        copyArray(arr1);
    }
}
