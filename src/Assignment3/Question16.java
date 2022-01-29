package Assignment3;

public class Question16 {
    //Swap two array without temporary variable
    static void swapArray(int arr1[], int arr2[]){
        for(int i = 0 ; i<arr1.length;i++){
           arr1[i] = arr1[i] ^ arr2[i];
            arr2[i] = arr1[i] ^ arr2[i];
            arr1[i] = arr1[i] ^ arr2[i];

        }
        System.out.println("Array 1:");
        for(int i =0; i < arr1.length;i++){
            System.out.print(arr1[i]+ " ");
        }
        System.out.println(" ");
        System.out.println("Array 2: ");
        for(int j =0; j < arr2.length; j++){
            System.out.print(arr2[j] + " ");
        }

    }

    public static void main(String[] args) {
        int arr1[]={1,2,3};
        int arr2[]={4,5,6};
        swapArray(arr1,arr2);
    }
}
