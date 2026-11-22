class Solution {
    public int countDominantElements(int[] nums) {
        
        int n =  nums.length ; 
        if( n == 1 ){
            return  1 ; 
        }
        int count = 0  ; 
        for( int i = 0 ;i < n ;i++){
            if( i == 0 && i+1 < n ){
                if( nums[i] >= nums[i+1]){
                    count++ ; 
                }
            }
            if( i== n-1 && i > 0 ){
                if( nums[i] >= nums[i-1]){
                    count++ ; 

                }
            }
            if( i > 0 && i <n-1){
                double avg =(double) (nums[i-1] + nums[i+1])/2 ; 
                if( nums[i] >= avg ){
                    count++ ; 
                }
            }
        }
        return count ; 
    }
}