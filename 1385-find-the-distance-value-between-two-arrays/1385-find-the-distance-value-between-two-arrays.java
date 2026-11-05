class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int n = arr1.length ; 
        int m = arr2.length ; 
        int count = 0 ; 
        for( int i = 0 ;i < n ;i++){
            int ele = arr1[i]; 
            boolean cond = true ; 
            for( int j = 0 ;j < m  ;j++){
                if( Math.abs(ele - arr2[j])<= d ){
                    cond = false ; 
                    break ;
                }

            }
            if( cond)count++ ; 
        }
        return count; 
        
    }
}