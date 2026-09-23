class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length ; 
        int z = 0 ; 
        int l = 0 ;
        int max = 0 ;  
        for( int i = 0 ;i <n ;i++){
            if(nums[i] == 0 )z++ ; 
            if( z<= k ){
                max = Math.max( max , i-l+1); 

            }else{
             while( nums[l] != 0 ){
                l++; 
             } 
             z-- ; 
             l++ ; 
            }
        }
        return max ; 

        
    }
}