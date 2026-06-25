class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length() ; 
        if(n == 0 )return 0 ; 
        
        HashMap<Character , Integer> map = new HashMap<>() ; 
        int max =1 ;
        int l = 0 ;  
        for( int i = 0 ;i < n ; i++){
            char ch = s.charAt(i) ; 
            if( map.containsKey(ch)){
               if( map.get(ch) >= l ){
                l = map.get(ch)+1 ; 
               }
            }
                max = Math.max( max , i-l+1) ; 
    
            map.put( ch , i ) ; 

        }
        return max ; 
        
    }
}