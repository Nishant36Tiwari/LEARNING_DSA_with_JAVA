import java.util.*;

public class AssgnmentAllSorting {
    
    public static void bubbleSort(int arr[]){
        int n = arr.length;
        for (int i =0; i<n-1; i++){
            for (int j=i+1; j<n; j++){
                if (arr[i]> arr[j]){
                    //swap
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]= temp;
                }
            }
        }
    }

    // Selection Sorting 
    public static void selectionSort(int arr[]){
        int n = arr.length;
        for (int i =0; i<n-1; i++){
            int minpose = i;
            for (int j=i+1; j<n ; j++){
                if (arr[j]<minpose){
                    minpose = arr[j];
                }
            }
            //swap
            int temp = arr[i];
            arr[i]=arr[minpose];
            arr[minpose]= temp;
        }

    }

    public static void insertionSort(int arr[]){
        int n = arr.length;
        for (int i =0; i<n-1; i++){
            int curr = arr[i];
            int prev = i-1;

            while (prev >= 0 && arr[prev]>curr){
                arr[prev +1]= arr[prev];
                prev --;
            }
            arr[prev +1 ] = curr;

        }
        
    }

    public static void countingSort(int arr[]){
        int n= arr.length;
        int largest = Integer.MIN_VALUE;
        for (int i=0 ; i<n ; i++){
            largest = Math.max(largest ,arr[i]);
        }

        int count[]= new int[largest+1];
        for (int i=0 ; i<n ; i++){
            count[arr[i]]++;
        }
        System.out.println(count.length);
        //sorting
        int j=0;
        for (int i=0 ; i<count.length ; i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }   
    }

    public static void printarr(int arr[]){
        //for (int i = 0; i<arr.length ; i++){
            for (int j = 0; j<arr.length ; j++){
                System.out.print(arr[j]+" ");
            }
            System.out.println();
            System.out.println();
        //}
    }
    public static void main(String args[]){
        //int arr[]= {5,7,6,1,2,8,3};
        //int arr[]= {3,6,2,1,8,7,4,5,3,1};
        //int arr[]= {1,1,1,25,2,3,45,21,2,5,5,3,5,5,5,22,5};
        int arr[]= {1,255425};
        bubbleSort(arr);
        System.out.println();
        System.out.println("sorting using bubble Sorting");
        printarr(arr);
        selectionSort(arr);
        System.out.println("sorting using selection Sorting");
        printarr(arr);
        insertionSort(arr);
        System.out.println("sorting using insertion Sorting");
        printarr(arr);
        countingSort(arr);
        System.out.println("sorting using counting Sorting");
        printarr(arr);
        
    }
    
}
