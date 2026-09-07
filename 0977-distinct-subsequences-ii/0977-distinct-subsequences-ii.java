class Solution {
    public int distinctSubseqII(String s) {
        int mod = 1000000007;
        int n = s.length(); 
        int[]dp = new int[n+1]; 
        dp[0] = 1 ; 
        int[]last = new int[26]; 
        Arrays.fill(last , -1); 
        for( int i = 1 ; i <= n ;i++){
            int c = s.charAt(i-1)-'a'; 
            dp[i] = (2* dp[i-1]  )%mod ; 
            if( last[c]!= -1 ){
                dp[i] = (dp[i] -   dp[last[c] -1] + mod) %mod; 
            }
            last[c] = i ; 

        }
        return (dp[n]-1 + mod )%mod ; 

        
    }
}