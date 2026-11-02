class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums); 
        
        int n = nums.length ; 
        int mid =  0 ; 
        if( n%2 != 0 ){
            mid  = nums[n/2]; 

        }else{
            int d = nums[n/2] + nums[(n/2) -1]; 
            mid = d/2 ; 
        }
        int ans = 0 ; 
        for( int ele : nums){
            ans+=Math.abs( ele - mid ); 
        }
        return ans ; 

    }
}