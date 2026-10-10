class Solution {
    public int maxFrequency(int[] nums, int k) {
        int n =  nums.length ; 
        Arrays.sort(nums); 
        long sum = 0 ;
         int l = 0 ; 
         int max = 0 ; 
         for( int i = 0 ;i <n ;i++){
            sum+=nums[i]; 
            while((long) (i-l+1)*nums[i] - sum > k ){
                sum-=nums[l]; 
                l++; 
            }
            max = Math.max( max , i-l+1); 
         }
         return max ; 
        
    }
}