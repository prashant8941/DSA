class Solution {
    public int mostFrequentEven(int[] nums) {
        int n = nums.length ; 
        int[] arr = new int[100000];
        for( int  ele  : nums ){
            arr[ele]++ ; 
        }
        int ans = -1 ; 
        int  val = 0 ; 
        for( int  i = 0 ; i< arr.length ; i++){
            if( arr[i] > val  && i % 2 == 0 ){
                ans  = i ; 
                val = arr[i] ; 
            }
        }
        return ans ; 
        
    }
}