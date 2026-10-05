class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer>st = new Stack<>(); 
        st.push(0); 
        for( char ch : s.toCharArray()){
            if( ch =='('){
                st.push(0); 
            }else{
                int inside = st.pop(); 
                int size ; 
                if( inside == 0 ){
                    size = 1 ; 
                }else{
                    size = 2*inside; 
                }
                int prev = st.pop(); 
                st.push(prev + size);
            }

        }
        return st.peek(); 
        
    }
}