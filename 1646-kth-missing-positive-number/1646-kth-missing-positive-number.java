class Solution {
    public static boolean valid( int[]arr , int k , int mid ){
        int count = 0 ; 
        for( int ele : arr){
            if( ele <= mid){
                count++ ; 
            }else{
                break ; 
            }
        }
        return mid-k >= count ; 
    }
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length ; 
        int low = 0 ; 
        int high = (int)1e9 ; 
        int ans = arr[n-1]+1 ; 
        while( low <= high){
            int mid = low+(high -low)/2 ; 
            if(valid( arr , k , mid)){
                high = mid-1 ; 
                ans = mid ; 
            }else{
                low = mid+1 ; 
            }
        }
        return ans ; 
        
    }
}