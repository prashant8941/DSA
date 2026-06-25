class Solution {
    public int longestConsecutive(int[] nums) {
        int  n = nums.length ;
        // if( n == 0 )return 0 ;  
        HashSet<Integer > set = new HashSet<>() ; 
        for( int ele : nums ){
            set.add(ele); 
        }
        int  ans = 0 ; 
        for( int ele  :set   ){
            if(! set.contains(ele-1)){
                int temp = 0 ; 
                int val = ele ; 
                while(set.contains(val) ){
                    temp++ ; 
                     ans = Math.max( ans  , temp ); 
                     val++ ; 
                }
               
            }
        }
        return ans ; 
        
    }
}