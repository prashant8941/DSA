class Solution {
  private boolean  find( int start  , int end , String s , Set<String>wd , Boolean[][]dp ){

    if( end == s.length()-1){
        if( wd.contains(s.substring(start , end+1)))return true ; 
        return false ; 

    }
    if( dp[start][end] != null ){
        return dp[start][end]; 
    }
    if( wd.contains(s.substring(start , end+1))){
        if( find(end+1 , end+1 , s , wd , dp )){
            dp[start][end] = true ; 
            return true ; 
        }
    }
    return dp[start][end] = find(start , end+1 , s  , wd , dp ); 




  }
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length(); 
        Boolean[][]dp  = new Boolean[n][n]; 

      return find( 0 , 0 , s ,new HashSet<>(wordDict) ,dp ); 
        
    }
}