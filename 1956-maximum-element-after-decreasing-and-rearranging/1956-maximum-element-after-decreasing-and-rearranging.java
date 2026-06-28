class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        int n = arr.length ; 
        Arrays.sort(arr) ; 
        int count = 0 ; 
        int val = 0 ; 
        for( int i = 0 ;i < n ;i++){
            if( arr[i] < val || arr[i] > val  ){
                val++ ; 

            }


        }
        return val ; 

        
    }
}