class Solution {
    public int minMoves(int[] nums) {
        int n  = nums.length ; 
        int min = nums[0]; 
        for( int ele : nums ){
            min = Math.min(min , ele ); 
        }
        int ans = 0 ; 
        for( int ele : nums ){
            ans+=(ele - min) ; 
        }
        return ans ; 
        
    }
}