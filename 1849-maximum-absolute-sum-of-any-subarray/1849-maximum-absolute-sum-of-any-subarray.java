class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n = nums.length ; 
        int min = 0 ; 
       int  minSum = (int)1e9 ; 

        int max = 0 ; 
        int maxSum = -(int)1e9 ; 
        for( int ele : nums){
            min = Math.min( ele , min+ele); 
            minSum = Math.min( minSum , min ); 

            max = Math.max( ele , max+ele); 
            maxSum = Math.max( maxSum , max); 
        }
        return Math.max( maxSum , Math.abs(minSum)) ; 
        
    }
}