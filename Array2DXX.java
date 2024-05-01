import java.util.*;

public class Array2DXX {


    public static void main(String args[]){
        int arr[][]={{4,7,8},{8,8,7}};
    
        int countof7 =0; 
        for(int i =0; i<arr.length; i++){
            for (int j = 0 ; j <arr[0].length;j++){
                if (arr[i][j] ==7) {
                    countof7 ++;
                }


            }
        }
        System.out.println(countof7);

    }
}