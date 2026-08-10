class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length; 
        int ind = 0 ; 
        int[]arr = new int[2*n]; 
        for( int i = 0 ;i < n ;i++){
            arr[ind++] = code[i]; 
        }
        for( int i = 0 ;i < n ;i++){
            arr[ind++] = code[i]; 
        }
        int[]ans = new int[n]; 
        if( k>0 ){
        for( int i = 0 ;i < n;i++){
            int sum = 0 ; 
            for( int j = i+1 ;j <=i+k ; j++){
                sum+=arr[j] ; 
            }
            ans[i] = sum ; 
        }

        }else{
            for( int i = 2*n-1 ;i >= n ;i--){
            int sum = 0 ; 
            for( int j = i-1 ;j >= i+k ; j--){
                sum+=arr[j] ; 
            }
            ans[i-n] = sum ; 
        }

        }
        //  for( int i = (2*n)-1 ;i >= n ;i--){
        //     int sum = 0 ; 
        //     for( int j = i-1 ;j >= i+k ; j--){
        //         sum+=arr[j] ; 
        //     }
        //     ans[i-n] = sum ; 
        // }

        

return ans ;  
        
    }
}