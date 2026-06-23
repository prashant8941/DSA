class Solution {
    public int findDuplicate(int[] nums) {
        int  n = nums.length ; 
       boolean seen[] = new boolean[n+1] ; 
       for( int ele : nums){
         if( !seen[ele]){
            seen[ele] = true ; 
         }else{
            return ele ; 
         }
       }
       return - 1; 
 
    }
}