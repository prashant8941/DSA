class Solution {
    public int numOfSubarrays(int[] arr) {
        int sum = 0 ; 
        int ans = 0 ; 
        int even = 1; 
        int odd = 0  ; 
        int mod = 1000000007; 
        for( int ele: arr ){
            sum+=ele ; 
            if( sum%2 == 0 ){
                ans= (ans+odd)%mod ; 
                even++ ; 
            }else{
                ans = (ans+even)%mod ; 
                odd++ ; 
            }
        }
        return ans ; 
        
    }
}