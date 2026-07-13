class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer>map = new HashMap<>(); 
        Stack<Integer>st = new Stack<>(); 
        for( int ele  : nums2){
            while( !st.isEmpty()  &&ele > st.peek() ){
                map.put(st.pop(),  ele);
            }
            st.push(ele); 
        }
        while(!st.isEmpty()){
            map.put(st.pop() , -1); 
        }
        int ans[] = new int[nums1.length]; 
        for( int i = 0 ;i < nums1.length ; i++){
            int el = nums1[i]; 
            ans[i]= map.get(el); 


        }
        return ans; 
          

        
    }
}