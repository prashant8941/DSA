class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length ; 
        long  sum  = 0 ; 
        long  max  = 0 ; 
        int l = 0  ; 
    Set<Integer>list= new HashSet<>(); 
        for( int i = 0 ;i < n; i++){

          while(list.contains(nums[i]) ){
            list.remove(nums[l]); 
            sum-=nums[l]; 
            l++ ; 
        
          }
        list.add(nums[i]);
          sum+= nums[i]; 
 
          if( i -  l + 1 == k ){
            max = Math.max( max , sum);
            list.remove(nums[l]);  
            sum-=nums[l]; 
            l++ ; 
          }
        }
    
        return max;
        
    }
}