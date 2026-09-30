class Solution {
    public String smallestSubsequence(String s) {
        int n = s.length(); 
        int[]last = new int[26]; 
       for(int i = 0 ;i < n;i++){
        char ch = s.charAt(i); 
        last[ch-'a'] = i ; 
       }
       Stack<Character>st = new Stack<>(); 
       boolean[]used = new boolean[26]; 
       for( int i = 0 ;i < n;i++){
        char ch = s.charAt(i); 
        int ind = ch-'a'; 
        if( used[ind])continue ; 
        while( !st.isEmpty()&& st.peek()>ch && last[st.peek()-'a']> i  ){
           used[st.pop()-'a'] = false ; 
         
        }
        st.push(ch); 
        used[ind] = true ; 
       }
       StringBuilder sb = new StringBuilder(); 
       while(!st.isEmpty()){
        sb.append(st.pop()); 
       }
       return sb.reverse().toString(); 
        
    }
}