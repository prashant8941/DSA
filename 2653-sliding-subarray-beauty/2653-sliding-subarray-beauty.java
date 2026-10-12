class Solution {
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int n = nums.length ; 
        int []ans = new int[n-k+1]; 
        int ind = 0 ;
        int []freq = new int[51]; 
        for( int i = 0 ;i < k ;i++){
            if( nums[i] < 0 ){
                freq[nums[i]+50]++ ; 
            }
        } 
        for( int i = k-1 ;i < n ;i++){
            if( i >= k ){
                if( nums[i] < 0 ){
                    freq[nums[i]+50]++ ; 
                }
                int left = i-k ; 
                if( nums[left] < 0 ){
                    freq[nums[left]+50]-- ; 
                }

            }
            int count = 0 ; 
            for( int j = -50 ; j<= -1 ;j++){
                count+=freq[j+50]; 
                if( count>= x ){
                    ans[ind] = j ;
                    break ;  
                }
            }
            ind++ ; 


        }
        return ans ; 

        
    }
}