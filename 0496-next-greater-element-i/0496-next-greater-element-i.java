class Solution {
    public static int find(Stack<Integer>st , int ele ){
       Stack<Integer>temp = new Stack<>(); 
       int ans = -1 ; 
       while(!st.isEmpty()){
        if(st.peek() == ele ){
            break  ; 
        }
        if(st.peek()>ele){
            ans = st.peek(); 
        }
        temp.add(st.pop()); 
       }
       while(!temp.isEmpty()){
        st.add(temp.pop()); 
       }
       return ans ; 


    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer>st = new Stack<>(); 
        for( int ele : nums2){
            st.add(ele); 
        }
        int n1 = nums1.length ; 
        int ans[] = new int[n1]; 
        for(int i = 0 ;i < n1 ;i++){
            ans[i] = find(st, nums1[i]); 

        }
        return ans ;

        
    }
}