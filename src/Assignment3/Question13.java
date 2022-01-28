package Assignment3;
public class Question13 {
    //Write a Java program to separate even and odd numbers of a
    //given array of integers. Put all even numbers first, and then odd
    //numbers

    static void evenOdd(int arr[]) {
        int j = -1;
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                j++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int arr[]= {2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        evenOdd(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+" ");
    }
}
