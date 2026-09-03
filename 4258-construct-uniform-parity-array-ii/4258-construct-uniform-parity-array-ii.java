class Solution {
    public boolean uniformArray(int[] nums1) {
        int n = nums1.length ; 
        if(n == 1 )return true ; 
        Arrays.sort(nums1); 
        int first = nums1[0]; 
        if( first % 2 == 0 ){
            for( int ele : nums1){
                if( ele % 2 != 0 ){
                    return false ; 
                }
            }
            return true ; 
         

        }
        return true ; 

        
    }
}