class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length ; 
        if( n< 3)return n ; 
        Arrays.sort(nums); 
        int ele = nums[n-1]; 
       String s = Integer.toBinaryString(ele); 
       int len  = s.length(); 
       int ans =(1<<len); 
       return ans ; 
    }
}