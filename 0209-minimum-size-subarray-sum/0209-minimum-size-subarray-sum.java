class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length ; 
        int l = 0 ; 
        int min = (int)1e9 ; 
        long sum = 0 ; 
        for( int i = 0 ;i < n ;i++){
            int ele = nums[i]; 
            sum+=ele; 
            while( sum >= target ){
                min = Math.min( min , i-l+1); 
                sum-=nums[l]; 
               l++ ; 
            }

        }
        return min==(int)1e9 ? 0 : min ; 
        
    }
}