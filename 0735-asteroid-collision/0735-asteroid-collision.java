class Solution {
        public static void reverse(int[]arr ){
        int i= 0 ; 
        int j = arr.length -1 ; 
        while( i <j ){
            int t = arr[i]; 
            arr[i] = arr[j]; 
            arr[j] =t ; 
            i++ ; 
            j--  ; 
        }
    }
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length ;  
        Stack<Integer>st = new Stack<>(); 
        for( int ele : asteroids ){
            if( ele > 0 ){
                st.push(ele); 
            }else{
                while (!st.isEmpty() &&st.peek()> 0  && st.peek()< Math.abs(ele) ){
                    st.pop(); 
                }
                if( !st.isEmpty() && st.peek() == Math.abs(ele)){
                    st.pop(); 
                }
               else  if( st.isEmpty() || st.peek() < 0 ){
                    st.push(ele); 
                }

            }
        }
        int[]an = new int[st.size()]; 
        int ind = 0 ; 
        while(!st.isEmpty()){
            an[ind++] = st.pop(); 
        }
        reverse(an); 
        return an ; 
        
    }
}