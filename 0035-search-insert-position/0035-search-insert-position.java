class Solution {
    public int searchInsert(int[] arr, int target) {
        int n = arr.length ; 
        int low = 0 ; 
        int high = n-1 ;
        int ans = -1 ;  
        while( low <= high ){
            int mid = low+(high -low )/2 ; 
            if( arr[mid]>= target ){
                high = mid-1 ; 
                ans =  mid ;
            }else {
                low = mid+1 ; 
            }
        }
        return  ans == -1?n : ans ; 
        
        
    }
}