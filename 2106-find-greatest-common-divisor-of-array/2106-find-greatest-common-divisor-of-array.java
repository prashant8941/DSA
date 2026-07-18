class Solution {
    public static int gcd(int a , int  b ){
        if( b ==0 )return a ; 
        return gcd(b , a%b); 
    }
    public int findGCD(int[] nums) {
        int n = nums.length ; 
        Arrays.sort(nums); 
        return gcd(nums[0] , nums[n-1]); 
        
    }
}