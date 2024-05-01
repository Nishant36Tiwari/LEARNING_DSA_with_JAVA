import java.util.*;
public class Subarray{

    public static void subarray(int arr[]){
        // n is the length of array
        int n = arr.length -1;

        // i is starting index
        for(int i=0; i<=n ; i++){

            // j is the ending index 
            for(int j=i ; j<=n ; j++){

                // k is the pair of subarray
                for (int k=i; k<=j; k++){
                    System.out.print(arr[k]);
                }
            System.out.println();
            }
        System.out.println();
        }

    }



    public static void main(String args[]){

        int arr[]= {2,4,6,8,10};
        subarray(arr);
    }
}