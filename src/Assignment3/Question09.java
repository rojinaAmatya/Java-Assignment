package Assignment3;

public class Question09 {
    //Write a Java program to find the common elements between two arrays (string values)
    static void commonElement(String arr1[], String arr2[]){

        for(int i=0; i < arr1.length; i++){
            for(int j =0 ; j < arr2.length; j++){
                if (arr1[i] == arr2[j]){
                    System.out.println("The common element is: " + arr1[i] );
                    break;
                }
            }
        }

    }


    public static void main(String[] args) {
        String arr1[] ={"abc", "ade", "bdc","xyz"};
        String arr2[] = {"xyz", "abc", "vhy"};
        commonElement(arr1, arr2);
    }
}
