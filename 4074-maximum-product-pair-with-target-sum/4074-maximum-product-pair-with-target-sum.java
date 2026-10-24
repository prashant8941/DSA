class Solution {
    public int[] maxProductPair(int[] nums, int target) {
        int ans[]= new int[2];
        ans[0] = -1 ; 
        ans[1] = -1 ;  
        int n = nums.length ; 
        int product = -(int)1e9 ; 
        for( int i = 0 ;i <   n ;i++){
            for( int  j = 0 ;j < n ;j++){
                if( i != j ){
                if(nums[i] > nums[j]   &&  nums[i]+nums[j] == target){
                    int pr =  nums[i]*nums[j]; 
                    if( pr > product ){
                        product = pr  ;
                        ans[0] = i ; 
                        ans[1] =  j ; 
                    }
                }

                }
            }
        }
        return ans ; 
        
    }
}