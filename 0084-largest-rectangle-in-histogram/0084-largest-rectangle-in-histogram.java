class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length ;
        int max = -1 ;  
        Stack<Integer>st = new Stack<>(); 
        for( int i = 0 ;i < n; i++){
            while(!st.isEmpty() && heights[i] <heights[st.peek()]){
                int nse  = i ; 
                int ele = st.pop(); 
                 int pse = st.isEmpty()?-1 : st.peek(); 
                 max  = Math.max(  max , heights[ele]*(nse-pse-1)); 
            }
            st.push(i); 
        }
        while(!st.isEmpty()){
            int nse = n; 
            int ele = st.pop(); 
            int pse = st.isEmpty()?-1 : st.peek(); 
              max  = Math.max(  max , heights[ele]*(nse-pse-1)); 


        }
        return max ; 
        
        
        
    }
}