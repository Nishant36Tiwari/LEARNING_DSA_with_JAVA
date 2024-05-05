class Solution {   //LEET CODE MAXSUM OF SUBARRAY
    public int maxSubArray(int[] nums) {
        //int ms = Integer.MIN_VALUE; 
        //int cs = 0; 
        //int n = nums.length;            APNA COLLEGE CODE
        //for(int i=0; i<n;i++ ){
        //    cs =  cs+nums[i];
        //    if (cs<0 ){
        //        cs=0;
        //    }
        //    ms = Math.max(cs, ms);
        //}
        //return ms;


                                 //UPGRADED CODE!!
        
        int currentSum = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        
        return maxSum;
        
    }
    
}
 // just paste it in leet code