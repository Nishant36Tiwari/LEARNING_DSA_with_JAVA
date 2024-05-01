import java.util.*;
public class trapping_Rainwater{

    public static int trappedWater(int height[]){
        int n = height.length;
        // left max array
        int leftmax[]= new int[n];
        leftmax[0]= height[0];
        for(int i =1; i<n; i++){
            leftmax[i]= Math.max(leftmax[i-1], height[i]);
        }

        //Right max array
        int Rightmax[]=new int[n];
        Rightmax[n-1]= height[n-1];
        for (int i=n-2 ; i>=0 ; i--){
            Rightmax[i]=Math.max(Rightmax[i+1], height[i]);
        }

        int trappedWater=0;
        for (int i=0 ; i<n ; i++){
            int waterHeight = Math.min(Rightmax[i], leftmax[i]);
            trappedWater += waterHeight - height[i];
        }

        return trappedWater;
    }


 
    public static void main (String args[]){
        int height[]= {4, 2, 0, 3, 2, 5};
        System.out.println(trappedWater(height));
        
    }
}
