class Solution {
    public int sortPermutation(int[] nums) {
        int n = nums.length ; 
        int ans = -1 ; 
        boolean mis  = false ; 
        for( int i = 0 ;i < n ;i++){
            if( i!= nums[i]){
                ans&=nums[i]; 
                mis= true ; 
            }
        }
        if( mis == false ){
            return  0 ; 
        }
        return ans ; 

        
    }
}