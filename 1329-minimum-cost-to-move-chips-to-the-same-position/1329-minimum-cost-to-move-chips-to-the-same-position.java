class Solution {
    public int minCostToMoveChips(int[] position) {
        int n = position.length ; 
        int odd   = 0 ; 
        int even = 0 ; 
        for(int ele : position){
            if( ele %2== 0 ){
                even++ ; 
            }else{
                odd++ ; 
            }
        }
        if( odd > even ){
            return even ; 
        }
        return odd ; 
        
    }
}