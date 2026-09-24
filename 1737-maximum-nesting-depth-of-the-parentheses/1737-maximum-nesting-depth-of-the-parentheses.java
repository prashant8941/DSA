class Solution {
    public int maxDepth(String s) {
        int count = 0 ; 
        int ans = 0 ; 
        for( char ch : s.toCharArray()){
            if( ch == '(')count++ ; 
            if( ch == ')')count-- ; 
            if( count> ans ){
                ans = count  ; 
            }
        }
        return ans ; 
        
    }
}