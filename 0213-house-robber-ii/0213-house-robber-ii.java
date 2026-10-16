class Solution {
    public static int find(int[]arr , int ind  , int n ){
       int prev = 0 ;
       int prev2 = 0 ; 
       for( int i = ind ; i < n ;i++){
        int pick = arr[i] + prev2 ;
        int npick = prev ; 
        int curr = Math.max(pick , npick); 
        prev2 = prev ; 
        prev = curr ; 
       }
       return prev ; 
      
    }
    public int rob(int[] nums) {
        int n = nums.length ; 
        if( n ==1){
            return nums[0]; 
        }
        return Math.max(find(nums , 0 , n-1) , find(nums , 1 , n)); 
        
    }
}