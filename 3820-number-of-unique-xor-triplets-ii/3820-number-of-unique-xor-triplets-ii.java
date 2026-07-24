class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length ; 
        int max = 2048 ; 
        boolean pair[] = new boolean[max]; 
        boolean triplet[] = new boolean[max]; 
        for(int i = 0 ;i < n ;i++){
            for( int j  = 0 ;j <= i  ;j++){
                int val = nums[i]^nums[j]; 
                pair[val] = true ; 
            }
            for(int  xor = 0 ; xor< max ; xor++){
                if(pair[xor]){
                    int va  = xor^nums[i]; 
                        triplet[va] = true ; 
                    
                }
            }
        }
 int count  = 0 ; 
 for( boolean ele : triplet){
    if( ele)count++ ; 
 }
 return count ; 

        
    }
}