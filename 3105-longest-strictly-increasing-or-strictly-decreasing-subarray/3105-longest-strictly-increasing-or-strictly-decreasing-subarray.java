class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length ; 
        int inc = 0 ; 
        int temp =  1 ; 
        for( int i = 1 ;i < n ;i++){
          if( nums[i] > nums[i-1]){
            temp++ ; 
            inc = Math.max( inc , temp ); 
          }else{
            temp = 1 ; 
          }
             
        }
        int dec = 1 ; 
        temp = 1 ; 
        for( int i = 1  ; i  < n ;i++ ){
            if(nums[i] < nums[i-1] ){
                temp++ ; 
                dec  = Math.max( dec , temp); 
            }else{
                temp = 1 ; 
            }
        }
        return Math.max( inc , dec ); 
        
    }
}