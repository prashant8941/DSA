class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length(); 
        int l = 0 ; 
        int max = 0 ; 
        Set<Character> set = new HashSet<>(); 
        for(int i = 0 ; i < n ;i++){
            char ch = s.charAt(i); 
            while( set.contains(ch)){
                set.remove(s.charAt(l));
                l++ ;  
            }
            set.add(ch);
            max = Math.max(max , i-l+1); 
         
        }
        return max ; 
        
    }
}