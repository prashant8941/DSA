class Solution {
    public int partitionDisjoint(int[] nums) {
        int n = nums.length ; 
        int[]left = new int[n]; 
        int[]right = new int[n]; 
        left[0] = nums[0]; 
       for( int i = 1 ;i  < n ;i++){
        if(nums[i] > left[i-1]){
            left[i] = nums[i]; 
        }else{
            left[i] = left[i-1]; 
        }

       }
       right[n-1] = nums[n-1]; 
       for(int i = n-2 ; i>= 0 ;i--){
        if( nums[i]< right[i+1]){
            right[i] = nums[i]; 
        }else{
            right[i] = right[i+1]; 
        }
       }
       for( int i = 0 ;i< n-1 ;i++){
        if( right[i+1]>=  left[i]){
            return i+1 ; 
        }
       }
       return n ; 


        
    }
}