class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length ; 
        Arrays.sort(nums); 
        int min= nums[0]; 
        int sum = 0 ; 
        for( int i= 1 ;i < n; i++){
            int ele =  nums[i]; 
            sum+=(ele-min); 
        }
        return sum ; 
        
    }
}