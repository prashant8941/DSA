class Solution {
    public static boolean  find(int[]nums){
        for( int ele : nums ){
            if( !(ele == 0) ){
                return false ; 
            }
        }
        return true ; 

    }
    public int longestSubsequence(int[] nums) {
        int n = nums.length ; 
        boolean aZ = find(nums );
        if( aZ){
            return  0 ; 
        } 
        int xor = 0 ; 
        for( int ele : nums ){
            xor^= ele ; 
        }
        if( xor != 0 ){
            return n ; 
        }
        for( int ele : nums ){
            if( (xor^ele ) != 0 ){
                return n-1 ; 
            }
        }
        return 0 ; 
        
    }
}