class Solution {
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int n = nums.length ; 
        int[]ans = new int[n-k+1]; 
        int freq[] = new int[51]; 
        for( int i = 0 ;i < k  ;i++){
            if( nums[i]< 0 ){
                freq[nums[i]+50]++ ;
            }
        }
        int ind = 0 ; 
        // int l = 0 ; 
        for( int i  = k-1 ; i < n ;i++){
            if( i>= k  ){
                if( nums[i]< 0 ){
                    freq[nums[i]+50]++ ; 
                }
                int l = i-k ; 
                if( nums[l]< 0 ){
                    freq[nums[l]+50]--; 
                }
                // l++ ; 
            }
            int count = 0 ; 
            for( int j = -50; j <= -1 ; j++){
                count+=freq[j+50]; 
                if( count>= x ){
                    ans[ind] = j ; 
                    break ; 
                }
            }
            ind++ ; 
        }
        return ans; 
        
    }
}