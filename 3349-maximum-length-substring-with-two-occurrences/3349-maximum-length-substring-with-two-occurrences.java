class Solution {
    public int maximumLengthSubstring(String s) {
        int n = s.length(); 
        int l   = 0 ; 
        int max = 0 ; 
        HashMap<Character, Integer>map = new HashMap<>(); 
        for( int i = 0 ;i < n; i++){
            char ch = s.charAt(i); 
            map.put(ch , map.getOrDefault(ch, 0 )+1); 
            if( map.get(ch)<= 2 ){
                max = Math.max(max , i-l+1); 
            }else{
                while(( map.get(ch)>2)){
                    char lf = s.charAt(l); 
                    if( map.get(lf)> 1 ){
                        map.put(lf , map.get(lf)-1); 
                    }else{
                        map.remove(lf); 
                    }
                    l++ ; 
                }
            }
        }
        return max ; 
    }
}