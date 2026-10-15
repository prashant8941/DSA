class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length ; 
        int k = n/2 ; 
        for( int i = 0 ;i < n ;i++){
            nums[i] =(int) Math.pow(nums[i] , 2 ); 
        }
        Arrays.sort(nums); 
        long sum = 0 ; 
        for( int i = 0 ;i < n;i++){
            if( k > 0 ){
                sum+=  (-nums[i]); 
                k-- ; 
            }else{
            sum+=nums[i]; 
            }
        }
        return sum ; 

        
    }
}