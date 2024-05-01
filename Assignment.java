import java.util.*;
public class Assignment {
    public static int growUp(int prices[]){
        int bp=prices[0];
        int sp= Integer.MIN_VALUE;
        int profit=0;
        for (int i = 1; i< prices.length ; i++){
            //for (int j=2; j< prices.length; j++){
                bp= Math.min(bp,prices[i]);
                sp= Math.max(sp, prices[i+1]);
                profit = Math.max(profit, sp-bp);
            //}
            if (profit==0){
                return 0;
            }
        }
        return profit;
    }
    public static int factorial(int n){
        int f=1; 
        for (int i =1 ; i<=n ; i++ ){
            f*=i;

        }
    return f;
    }

    public static int triplet(int nums[]){
        int n = nums.length;
        for (int i=0 ; i< n; i++){
            for (int j =i+1; j <n ; j++){
                for (int k=i+2; k<n ; k++){
                    if (factorial(i)==j && factorial(i)==k && factorial(j)==k && i+j+k == 0){
                        int arr[]={nums[i],nums[j], nums[k]};
                        
                    }
                }
            }
        }
    return 990909090;
    }

    public static void main (String args[]){
        int prices[]={7, 6, 4,  3, 1};
        //growUp(prices);
        //System.out.println(growUp(prices));
        int nums[]= {-1, 0,  1, 2, -1, -4};
        System.out.println(triplet(nums));
    }
    
}
