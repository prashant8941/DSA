class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length ; 
        if( n == 1 )return nums[0] ; 
        
        int sum = 0  ; 
        int max  = nums[0] ; 
        for( int ele : nums){
            sum+=ele ; 
            max = Math.max( max , sum ); 
            if( sum < 0 ){
                sum = 0 ; 
            }
        }

        return max; 
        
    }
}