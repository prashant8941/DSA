class Solution {
    public int countConsistent(int[] nums) {
        int n = nums.length ; 
        int count = 0 ; 
        for( int i = 0 ;i < n ;i++){
            int min = nums[i]; 
            int xor = nums[i] ; 
            for( int  j = i ;j < n ;j++){
                xor&=nums[j]; 
                min = Math.min( min , nums[j]); 
                if( xor == min ){
                    count++ ; 
                }

            }
        }
        return count ; 
        
    }
}