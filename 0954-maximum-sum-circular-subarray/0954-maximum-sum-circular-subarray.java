class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length ; 

        int curMax = 0 ; 
        int maxSum = -(int)1e9 ; 

        int curMin = 0 ; 
        int minSum = (int)1e9 ; 
        
       int total = 0 ; 
       for( int ele : nums ){

        curMax= Math.max( ele , curMax+ele); 
        maxSum = Math.max(maxSum , curMax); 

        curMin = Math.min(ele , curMin+ele); 
        minSum = Math.min( minSum , curMin); 

        total+=ele ; 

       }
       if( maxSum < 0 ){
        return maxSum ; 
       }
       return Math.max( maxSum , total - minSum); 
        
    }
}