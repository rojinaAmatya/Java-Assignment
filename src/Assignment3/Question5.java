package Assignment3;

public class Question5 {
    //Write a Java program to find the maximum and minimum value of an array
    static void findMax(int arr[]){
        int max = arr[0];
        for(int i=0; i < arr.length; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
            }
        }
        System.out.println("Maximum value of an Array: " + max);

    }

    static void findMin(int arr[]){
        int min = arr[0];
        for(int i = 0; i <arr.length; ++i)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }
        System.out.println("Minimum value of an Array: " + min);
    }

    public static void main(String[] args) {
        int arr[] ={20,54,67,99,145,3,45,65,29,17,245,56};
        findMax(arr);
        findMin(arr);
    }

}
