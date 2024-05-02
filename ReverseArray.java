import java.util.*;
public class ReverseArray {
    public static void main(String args[]){
        int arr[]= {1,2,3,4,5,8,9,11,2258};
        ReverseArray(arr);    
    }

    public static void ReverseArray( int arr [] ){
        int[] rev= new int[arr.length];
        int n =arr.length;
        int b=0;
        for (int i=0; i< n; i++){
            
            rev[i]=arr[n-i-1];            
        }
        for (int a= 0; a<=n-1 ; a++){
            System.out.print(rev[a] +",");
        }

    }
    
}
