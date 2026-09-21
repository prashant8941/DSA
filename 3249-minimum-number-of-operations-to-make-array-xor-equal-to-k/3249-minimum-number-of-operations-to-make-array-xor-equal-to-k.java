class Solution {
    public int minOperations(int[] nums, int k) {

        int xor = 0 ; 
        for( int ele  : nums ){
            xor^= ele ; 
        }
        return Integer.bitCount(xor^k); 
        
    }
}